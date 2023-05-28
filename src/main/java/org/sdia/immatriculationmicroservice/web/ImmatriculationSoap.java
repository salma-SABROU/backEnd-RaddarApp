package org.sdia.immatriculationmicroservice.web;

import org.sdia.immatriculationmicroservice.entities.Proprietaire;
import org.sdia.immatriculationmicroservice.entities.Vehicule;
import org.sdia.immatriculationmicroservice.repositories.ProprietaireRepository;
import org.sdia.immatriculationmicroservice.repositories.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService (serviceName = "ServiceImmatriculation")
public class ImmatriculationSoap {
    private ProprietaireRepository proprietaireRepository;

    private VehiculeRepository vehiculeRepository;

    public ImmatriculationSoap(ProprietaireRepository proprietaireRepository, VehiculeRepository vehiculeRepository) {
        this.proprietaireRepository = proprietaireRepository;
        this.vehiculeRepository = vehiculeRepository;
    }
    @WebMethod
    public List<Vehicule> vehicules(){
        return vehiculeRepository.findAll();
    }

    @WebMethod
    public List<Proprietaire> proprietaires(){
        return proprietaireRepository.findAll();
    }

    @WebMethod
    public Vehicule vehiculesById(@WebParam(name="id") long id){
        return vehiculeRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("vehicule %s not found",id)));
    }

    @WebMethod
    public Proprietaire proprietairesById(@WebParam(name="id") long id){
        return proprietaireRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Proprietaire %s not found",id)));
    }

    @WebMethod
    public Vehicule savevehicule(@WebParam(name="vehicule") Vehicule vehicule){
        if(vehicule.getId() == 0) vehicule.setId((long) ((Math.random() * 1000) + 800));
        return vehiculeRepository.save(vehicule);
    }

    @WebMethod
    public Proprietaire saveProprietaire(@WebParam(name ="proprietaire") Proprietaire proprietaire){
        if(proprietaire.getId() == 0) proprietaire.setId((long) ((Math.random() * 1000) + 800));
        return proprietaireRepository.save(proprietaire);
    }

    @WebMethod
    public Vehicule updateVehicule(@WebParam(name = "id") long id,@WebParam Vehicule vehicule){
        //search account
        Vehicule vh=vehiculeRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("vehicule %s not found",id)));
        if (vehicule.getModele()!=null) vh.setModele(vehicule.getModele());
        if (vehicule.getMarque()!=null) vh.setMarque(vehicule.getMarque());
        if (vehicule.getNumeroMatricule()!=null) vh.setNumeroMatricule(vehicule.getNumeroMatricule());
        if (vehicule.getPuissanceFiscale()!=null) vh.setPuissanceFiscale(vehicule.getPuissanceFiscale());
        if (vehicule.getIdProprietaire() != 0) vh.setIdProprietaire(vehicule.getIdProprietaire());
        return vehiculeRepository.save(vh);
    }
    @WebMethod
    public Proprietaire updateProprietaires(@WebParam long id,@WebParam Proprietaire proprietaire){
        //search account
        Proprietaire pr=proprietaireRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("proprietaire %s not found",id)));
        if (proprietaire.getNom()!=null) pr.setNom(proprietaire.getNom());
        if (proprietaire.getEmail()!=null) pr.setEmail(proprietaire.getEmail());
        if (proprietaire.getDateNaissance()!=null) pr.setDateNaissance(proprietaire.getDateNaissance());

        return proprietaireRepository.save(pr);
    }

    @WebMethod
    public void deleteVehicule(@WebParam long id){
        vehiculeRepository.deleteById(id);
    }

    @WebMethod
    public void deleteProprietaires(@WebParam long id){
        proprietaireRepository.deleteById(id);
    }
}
