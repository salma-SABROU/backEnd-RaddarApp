package org.sdia.microserviceinfractions.web;

import org.sdia.microserviceinfractions.entities.Infraction;
import org.sdia.microserviceinfractions.repositories.InfractionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InfractionController {
    private InfractionRepository infractionRepository;

    public InfractionController(InfractionRepository infractionRepository) {
        this.infractionRepository = infractionRepository;
    }

    @GetMapping("/infractions")
    public List<Infraction> infractions(){
        return infractionRepository.findAll();
    }

    @GetMapping("/infractions/{id}")
    public Infraction infractionById(@PathVariable long id){
        return infractionRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Infraction %s not found",id)));
    }

    @PostMapping("/infractions")
    public Infraction saveInfraction(@RequestBody Infraction infraction){
        if(infraction.getId() == 0) infraction.setId((long) ((Math.random() * 1000) + 800));
        return infractionRepository.save(infraction);
    }

    @PutMapping ("/infractions/{id}")
    public Infraction updateInfraction(@PathVariable long id,@RequestBody Infraction infraction){
        Infraction vh=infractionRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Infraction %s not found",id)));
        if (infraction.getMontantInfraction()!=0) vh.setMontantInfraction(infraction.getMontantInfraction());
        if (infraction.getDate() != null )vh.setDate(infraction.getDate());
        if (infraction.getNumeroRadar() != 0) vh.setNumeroRadar(infraction.getNumeroRadar());
        if (infraction.getMatriculeVehicule() != null) vh.setMatriculeVehicule(infraction.getMatriculeVehicule());
        if (infraction.getVitesseVehicule() !=0) vh.setVitesseVehicule(infraction.getVitesseVehicule());
        if (infraction.getVitesseMaximaleRadar() !=0 ) vh.setVitesseMaximaleRadar(infraction.getVitesseMaximaleRadar());
        return infractionRepository.save(vh);
    }

    @DeleteMapping("/infractions/{id}")
    public void deleteInfraction(@PathVariable long id){
        infractionRepository.deleteById(id);
    }

    @GetMapping("/infractionsDepassemant/{id}")
    public Boolean infractionsDepassemant(@PathVariable long id){
        Infraction infraction=infractionRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Infraction %s not found",id)));
        if(infraction.getVitesseVehicule() > infraction.getVitesseMaximaleRadar()){
            return true;
        }else {
            return false;
        }
    }
}
