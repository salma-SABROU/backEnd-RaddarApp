package org.sdia.immatriculationmicroservice.web;

import org.sdia.immatriculationmicroservice.entities.Proprietaire;
import org.sdia.immatriculationmicroservice.entities.Vehicule;
import org.sdia.immatriculationmicroservice.repositories.ProprietaireRepository;
import org.sdia.immatriculationmicroservice.repositories.VehiculeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ImmatriculationRestController {

    private ProprietaireRepository proprietaireRepository;
    private VehiculeRepository vehiculeRepository;

    public ImmatriculationRestController(ProprietaireRepository proprietaireRepository, VehiculeRepository vehiculeRepository) {
        this.proprietaireRepository = proprietaireRepository;
        this.vehiculeRepository = vehiculeRepository;
    }

    @GetMapping("/vehicules")
    public List<Vehicule> vehicules(){
        return vehiculeRepository.findAll();
    }

    @GetMapping("/proprietaires")
    public List<Proprietaire> proprietaires(){
        return proprietaireRepository.findAll();
    }

    @GetMapping("/vehicules/{id}")
    public Vehicule vehicules(@PathVariable long id){
        return vehiculeRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("vehicule %s not found",id)));
    }

    @GetMapping("/vehiculesByMatricule/{matricule}")
    public Vehicule vehiculesByMatricule(@PathVariable String matricule){
        Vehicule vehicule=new Vehicule();
        List<Vehicule> vehiculeList= vehiculeRepository.findAll();
        for (Vehicule vh:vehiculeList) {
            if(vh.getNumeroMatricule().equals(matricule)){
                vehicule=vh;
            }
        }
        return vehicule;
    }

    @GetMapping("/proprietaires/{id}")
    public Proprietaire proprietaires(@PathVariable long id){
        return proprietaireRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Proprietaire %s not found",id)));
    }

    @PostMapping("/vehicules")
    public Vehicule savevehicule(@RequestBody Vehicule vehicule){
        if(vehicule.getId() == 0) vehicule.setId((long) ((Math.random() * 1000) + 800));
        return vehiculeRepository.save(vehicule);
    }
    @PostMapping("/proprietaires")
    public Proprietaire saveProprietaire(@RequestBody Proprietaire proprietaire){
        if(proprietaire.getId() == 0) proprietaire.setId((long) ((Math.random() * 1000) + 800));
        return proprietaireRepository.save(proprietaire);
    }

    @PutMapping ("/vehicules/{id}")
    public Vehicule updateVehicule(@PathVariable long id,@RequestBody Vehicule vehicule){
        //search account
        Vehicule vh=vehiculeRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("vehicule %s not found",id)));
        if (vehicule.getModele()!=null) vh.setModele(vehicule.getModele());
        if (vehicule.getMarque()!=null) vh.setMarque(vehicule.getMarque());
        if (vehicule.getNumeroMatricule()!=null) vh.setNumeroMatricule(vehicule.getNumeroMatricule());
        if (vehicule.getPuissanceFiscale()!=null) vh.setPuissanceFiscale(vehicule.getPuissanceFiscale());
        if (vehicule.getIdProprietaire() != 0) vh.setIdProprietaire(vehicule.getIdProprietaire());
        return vehiculeRepository.save(vh);
    }
    @PutMapping ("/proprietaires/{id}")
    public Proprietaire updateProprietaires(@PathVariable long id,@RequestBody Proprietaire proprietaire){
        //search account
        Proprietaire pr=proprietaireRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("proprietaire %s not found",id)));
        if (proprietaire.getNom()!=null) pr.setNom(proprietaire.getNom());
        if (proprietaire.getEmail()!=null) pr.setEmail(proprietaire.getEmail());
        if (proprietaire.getDateNaissance()!=null) pr.setDateNaissance(proprietaire.getDateNaissance());

        return proprietaireRepository.save(pr);
    }

    @DeleteMapping("/vehicules/{id}")
    public void deleteVehicule(@PathVariable long id){
        vehiculeRepository.deleteById(id);
    }

    @DeleteMapping("/proprietaires/{id}")
    public void deleteProprietaires(@PathVariable long id){
        proprietaireRepository.deleteById(id);
    }
}
