package org.sdia.radarmicroservice.web;

import org.sdia.radarmicroservice.entities.Radar;
import org.sdia.radarmicroservice.model.Infraction;
import org.sdia.radarmicroservice.model.Proprietaire;
import org.sdia.radarmicroservice.model.Vehicule;
import org.sdia.radarmicroservice.repositories.RadarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class RadarController {

    private RestTemplate restTemplate;

    private RadarRepository radarRepository;

    public RadarController(RadarRepository radarRepository) {
        this.radarRepository = radarRepository;
        restTemplate = new RestTemplate();
    }

    @GetMapping("/radars")
    public List<Radar> radars(){
        return radarRepository.findAll();
    }

    @GetMapping("/radars/{id}")
    public Radar radarById(@PathVariable long id){
        return radarRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Radar %s not found",id)));
    }
    @GetMapping("/vehicule/{matricule}")
    public Vehicule vehiculeByMatricule(@PathVariable String matricule){
        String url = "http://localhost:8081/api/vehiculesByMatricule/" + matricule;
        ResponseEntity<Vehicule> reponse = restTemplate.getForEntity(url, Vehicule.class);

        return reponse.getBody();
    }

    @GetMapping("/proprietaire/{id}")
    public Proprietaire proprietaireById(@PathVariable long id){
        String url = "http://localhost:8081/proprietaires/" + id;
        ResponseEntity<Proprietaire> reponse = restTemplate.getForEntity(url, Proprietaire.class);

        return reponse.getBody();
    }

    @PostMapping("/infraction")
    public ResponseEntity<Infraction> InfractionSave(@RequestBody Infraction infraction) {
        // Envoyer la demande à ServiceB en utilisant une requête HTTP POST
        ResponseEntity<Infraction> reponse = restTemplate.postForEntity("http://localhost:8088/infractions", infraction, Infraction.class);

        return reponse;
    }

    @PostMapping("/radars")
    public Radar saveRadar(@RequestBody Radar radar){
        if(radar.getId() == 0) radar.setId((long) ((Math.random() * 1000) + 800));
        return radarRepository.save(radar);
    }

    @PutMapping ("/radars/{id}")
    public Radar updateRadar(@PathVariable long id,@RequestBody Radar radar){
        Radar vh=radarRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Radar %s not found",id)));
        if (radar.getLongitude()!=0) vh.setLongitude(radar.getLongitude());
        if (radar.getLatitude() !=0) vh.setLatitude(radar.getLatitude());
        if (radar.getVitesseMaximale() != 0 ) vh.setVitesseMaximale(radar.getVitesseMaximale());

        return radarRepository.save(vh);
    }

    @DeleteMapping("/radars/{id}")
    public void deleteRadar(@PathVariable long id){
        radarRepository.deleteById(id);
    }

}
