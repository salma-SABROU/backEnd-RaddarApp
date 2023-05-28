package org.sdia.immatriculationmicroservice.mappers;

import org.sdia.immatriculationmicroservice.dto.ProprietaireRequestDTO;
import org.sdia.immatriculationmicroservice.dto.ProprietaireResponseDTO;
import org.sdia.immatriculationmicroservice.dto.VehiculeRequestDTO;
import org.sdia.immatriculationmicroservice.dto.VehiculeResponseDTO;
import org.sdia.immatriculationmicroservice.entities.Proprietaire;
import org.sdia.immatriculationmicroservice.entities.Vehicule;
import org.sdia.immatriculationmicroservice.stub.Immatriculation;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ProprietaireMapper {
    public ProprietaireResponseDTO fromProprietaireToResponseDTO(Proprietaire proprietaire){
        ProprietaireResponseDTO proprietaireResponseDTO=new ProprietaireResponseDTO();
        BeanUtils.copyProperties(proprietaire,proprietaireResponseDTO);
        return proprietaireResponseDTO;
    }

    public Immatriculation.Proprietaire fromProprietaireToProprietaireDTO(Proprietaire proprietaire){
        Immatriculation.Proprietaire proprietaireDTO= Immatriculation.Proprietaire.newBuilder()
                .setId(proprietaire.getId())
                .setDateNaissance(String.valueOf(proprietaire.getDateNaissance()))
                .setEmail(proprietaire.getEmail())
                .setNom(proprietaire.getNom())
                .build();
        return proprietaireDTO;
    }

    public Immatriculation.ProprietaireResponseDTO fromProprietaireToResponseDTOGRPC(Proprietaire proprietaire){
        Immatriculation.ProprietaireResponseDTO responseDTO=Immatriculation.ProprietaireResponseDTO.newBuilder()
                .setDateNaissance(String.valueOf(proprietaire.getDateNaissance()))
                .setEmail(proprietaire.getEmail())
                .setNom(proprietaire.getNom())
                .setId(proprietaire.getId())
                .build();

        return responseDTO;
    }

    public Proprietaire fromRequestDtoToProprietaire(ProprietaireRequestDTO proprietaireRequestDTO){
        Proprietaire proprietaire=new Proprietaire();
        proprietaire.setId((long) ((Math.random() * 1000) + 800));
        proprietaire.setNom(proprietaireRequestDTO.getNom());
        proprietaire.setEmail(proprietaireRequestDTO.getEmail());
        proprietaire.setDateNaissance(proprietaireRequestDTO.getDateNaissance());


        return proprietaire;
    }
}
