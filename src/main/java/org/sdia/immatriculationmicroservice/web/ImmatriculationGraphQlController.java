package org.sdia.immatriculationmicroservice.web;

import org.sdia.immatriculationmicroservice.dto.ProprietaireRequestDTO;
import org.sdia.immatriculationmicroservice.dto.ProprietaireResponseDTO;
import org.sdia.immatriculationmicroservice.dto.VehiculeRequestDTO;
import org.sdia.immatriculationmicroservice.dto.VehiculeResponseDTO;
import org.sdia.immatriculationmicroservice.entities.Proprietaire;
import org.sdia.immatriculationmicroservice.entities.Vehicule;
import org.sdia.immatriculationmicroservice.repositories.ProprietaireRepository;
import org.sdia.immatriculationmicroservice.repositories.VehiculeRepository;
import org.sdia.immatriculationmicroservice.services.ProprietaireServiceImp;
import org.sdia.immatriculationmicroservice.services.VehiculeServiceImp;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ImmatriculationGraphQlController {
    private ProprietaireRepository proprietaireRepository;
    private VehiculeRepository vehiculeRepository;
    private ProprietaireServiceImp proprietaireServiceImp;
    private VehiculeServiceImp vehiculeServiceImp;

    public ImmatriculationGraphQlController(ProprietaireRepository proprietaireRepository, VehiculeRepository vehiculeRepository, ProprietaireServiceImp proprietaireServiceImp, VehiculeServiceImp vehiculeServiceImp) {
        this.proprietaireRepository = proprietaireRepository;
        this.vehiculeRepository = vehiculeRepository;
        this.proprietaireServiceImp = proprietaireServiceImp;
        this.vehiculeServiceImp = vehiculeServiceImp;
    }

    @QueryMapping
    public List<Vehicule> vehiculeList(){
        return vehiculeRepository.findAll();
    }
    @QueryMapping
    public List<Proprietaire> proprietaireList(){
        return proprietaireRepository.findAll();
    }
    @QueryMapping
    public Vehicule vehiculeById(@Argument long id){
        return vehiculeRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Vehicule %s not found",id)));
    }
    @QueryMapping
    public Proprietaire proprietaireById(@Argument long id){
        return proprietaireRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Proprietaire %s not found",id)));
    }

    @MutationMapping
    public VehiculeResponseDTO addVehicule(@Argument VehiculeRequestDTO vehicule){
        return vehiculeServiceImp.addVehicule(vehicule);
    }
    @MutationMapping
    public ProprietaireResponseDTO addProprietaire(@Argument ProprietaireRequestDTO proprietaire){
        return proprietaireServiceImp.addProprietaire(proprietaire);
    }

    @MutationMapping
    public ProprietaireResponseDTO updateProprietaire(@Argument long id, @Argument ProprietaireRequestDTO proprietaireRequestDTO){
        return proprietaireServiceImp.updateProprietaire(proprietaireRequestDTO,id);
    }
    @MutationMapping
    public VehiculeResponseDTO updateVehicule(@Argument long id, @Argument VehiculeRequestDTO vehiculeRequestDTO){
        return vehiculeServiceImp.updateVehicule(vehiculeRequestDTO,id);
    }

    @MutationMapping
    public void deleteVehicule(@Argument long id){
        vehiculeRepository.deleteById(id);
    }

    @MutationMapping
    public void deleteProprietaire(@Argument long id){
        proprietaireRepository.deleteById(id);
    }

}
