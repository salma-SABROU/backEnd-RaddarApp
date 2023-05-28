package org.sdia.immatriculationmicroservice.services;

import org.sdia.immatriculationmicroservice.dto.VehiculeRequestDTO;
import org.sdia.immatriculationmicroservice.dto.VehiculeResponseDTO;
import org.sdia.immatriculationmicroservice.entities.Vehicule;
import org.sdia.immatriculationmicroservice.mappers.VehiculeMapper;
import org.sdia.immatriculationmicroservice.repositories.VehiculeRepository;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service @Transactional
public class VehiculeServiceImp implements VehiculeService{
    private VehiculeRepository vehiculeRepository;
    private VehiculeMapper vehiculeMapper;

    public VehiculeServiceImp(VehiculeRepository vehiculeRepository, VehiculeMapper vehiculeMapper) {
        this.vehiculeRepository = vehiculeRepository;
        this.vehiculeMapper = vehiculeMapper;
    }

    @Override
    public VehiculeResponseDTO addVehicule(VehiculeRequestDTO vehiculeRequestDTO) {
        Vehicule vehicule=vehiculeMapper.fromRequestDtoToVehicule(vehiculeRequestDTO);
        Vehicule vehiculeSaved=vehiculeRepository.save(vehicule);
        VehiculeResponseDTO vehiculeResponseDTO=vehiculeMapper.fromVehiculeToDTO(vehiculeSaved);

        return vehiculeResponseDTO;
    }

    @Override
    public VehiculeResponseDTO updateVehicule(VehiculeRequestDTO vehiculeRequestDTO, long id) {
        Vehicule vehicule=new Vehicule();
        vehicule.setId(id);
        vehicule.setMarque(vehiculeRequestDTO.getMarque());
        vehicule.setModele(vehiculeRequestDTO.getModele());
        vehicule.setPuissanceFiscale(vehiculeRequestDTO.getPuissanceFiscale());
        vehicule.setNumeroMatricule(vehiculeRequestDTO.getNumeroMatricule());
        vehicule.setIdProprietaire(vehiculeRequestDTO.getIdProprietaire());

        Vehicule vehiculeSaved=vehiculeRepository.save(vehicule);
        VehiculeResponseDTO vehiculeResponseDTO=vehiculeMapper.fromVehiculeToDTO(vehiculeSaved);

        return vehiculeResponseDTO;
    }
}
