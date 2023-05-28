package org.sdia.immatriculationmicroservice.services;

import org.sdia.immatriculationmicroservice.dto.VehiculeRequestDTO;
import org.sdia.immatriculationmicroservice.dto.VehiculeResponseDTO;
import org.springframework.graphql.data.method.annotation.Argument;

public interface VehiculeService {
    public VehiculeResponseDTO addVehicule(@Argument VehiculeRequestDTO vehiculeRequestDTO);

    public VehiculeResponseDTO updateVehicule(@Argument VehiculeRequestDTO vehiculeRequestDTO,long id);
}
