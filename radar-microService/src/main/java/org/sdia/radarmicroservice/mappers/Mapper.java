package org.sdia.radarmicroservice.mappers;

import org.sdia.radarmicroservice.model.Infraction;
import org.sdia.radarmicroservice.model.InfractionResponse;
import org.sdia.radarmicroservice.model.Proprietaire;
import org.sdia.radarmicroservice.model.Vehicule;
import org.sdia.radarmicroservice.stub.Radar;
import org.springframework.stereotype.Component;

@Component
public class Mapper {

    public Radar.infractionResponse fromInfractionToinfractionResponse(Infraction infraction){
        Radar.infractionResponse infractionResponse= Radar.infractionResponse.newBuilder()
                .setMontantInfraction(infraction.getMontantInfraction())
                .setId(infraction.getId())
                .setDate(String.valueOf(infraction.getDate()))
                .setNumeroRadar(infraction.getNumeroRadar())
                .setMatriculeVehicule(infraction.getMatriculeVehicule())
                .setVitesseVehicule(infraction.getVitesseVehicule())
                .setVitesseMaximaleRadar(infraction.getVitesseMaximaleRadar())
                .build();

        return infractionResponse;
    }

    public Radar.VehiculeResponse fromVehiculeToVehiculeResponse(Vehicule vehicule){
        Radar.VehiculeResponse vehiculeResponse=Radar.VehiculeResponse.newBuilder()
                .setId(vehicule.getId())
                .setMarque(vehicule.getMarque())
                .setIdProprietaire(vehicule.getIdProprietaire())
                .setModele(vehicule.getModele())
                .setNumeroMatricule(vehicule.getNumeroMatricule())
                .setPuissanceFiscale(vehicule.getPuissanceFiscale())
                .build();

        return vehiculeResponse;
    }

    public Radar.ProprietaireResponse fromProprietaireToProprietaireResponse(Proprietaire proprietaire){
        Radar.ProprietaireResponse proprietaireResponse=Radar.ProprietaireResponse.newBuilder()
                .setDateNaissance(String.valueOf(proprietaire.getDateNaissance()))
                .setId(proprietaire.getId())
                .setEmail(proprietaire.getEmail())
                .setNom(proprietaire.getNom())
                .build();


        return proprietaireResponse;
    }
}
