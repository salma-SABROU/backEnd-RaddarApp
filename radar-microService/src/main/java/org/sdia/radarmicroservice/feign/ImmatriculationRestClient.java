package org.sdia.radarmicroservice.feign;

import org.sdia.radarmicroservice.model.Proprietaire;
import org.sdia.radarmicroservice.model.Vehicule;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "IMMATRICULATION-SERVICE")
public interface ImmatriculationRestClient {
    @GetMapping(path = "/api/vehiculesByMatricule/{matricule}")
    public Vehicule getVehiculeByMatricule(@PathVariable(name = "matricule") String matricule);
    @GetMapping(path = "/proprietaires/{id}")
    public Proprietaire getProprietaireById(@PathVariable(name = "id") Long id);
}
