package org.sdia.immatriculationmicroservice.mappers;

import org.sdia.immatriculationmicroservice.dto.VehiculeRequestDTO;
import org.sdia.immatriculationmicroservice.dto.VehiculeResponseDTO;
import org.sdia.immatriculationmicroservice.entities.Vehicule;
import org.sdia.immatriculationmicroservice.stub.Immatriculation;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class VehiculeMapper {
    public VehiculeResponseDTO fromVehiculeToDTO(Vehicule vehicule){
        VehiculeResponseDTO vehiculeResponseDTO=new VehiculeResponseDTO();
        BeanUtils.copyProperties(vehicule,vehiculeResponseDTO);
        return vehiculeResponseDTO;
    }

    public Immatriculation.Vehicule fromVehiculeToVehiculeDTO(Vehicule vehicule){
        Immatriculation.Vehicule vehiculeDTO= Immatriculation.Vehicule.newBuilder()
                .setId(vehicule.getId())
                .setMarque(vehicule.getMarque())
                .setModele(vehicule.getModele())
                .setPuissanceFiscale(vehicule.getPuissanceFiscale())
                .setNumeroMatricule(vehicule.getNumeroMatricule())
                .setIdProprietaire(vehicule.getIdProprietaire())
                .build();
        return vehiculeDTO;
    }

    public Immatriculation.VehiculeResponseDTO fromVehiculeToResponseDTOGRPC(Vehicule vehicule){
        Immatriculation.VehiculeResponseDTO vehiculeResponseDTO=Immatriculation.VehiculeResponseDTO.newBuilder()
                .setId(vehicule.getId())
                .setMarque(vehicule.getMarque())
                .setModele(vehicule.getModele())
                .setNumeroMatricule(vehicule.getNumeroMatricule())
                .setPuissanceFiscale(vehicule.getPuissanceFiscale())
                .setIdProprietaire(vehicule.getIdProprietaire())
                .build();


        return vehiculeResponseDTO;
    }

    public Vehicule fromRequestDtoToVehicule(VehiculeRequestDTO vehiculeRequestDTO){
        Vehicule vehicule=new Vehicule();
        vehicule.setId((long) ((Math.random() * 1000) + 800));
        vehicule.setMarque(vehiculeRequestDTO.getMarque());
        vehicule.setModele(vehiculeRequestDTO.getModele());
        vehicule.setNumeroMatricule(vehiculeRequestDTO.getNumeroMatricule());
        vehicule.setPuissanceFiscale(vehiculeRequestDTO.getPuissanceFiscale());
        vehicule.setIdProprietaire(vehiculeRequestDTO.getIdProprietaire());

        return vehicule;
    }
}
