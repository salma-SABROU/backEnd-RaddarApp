package org.sdia.immatriculationmicroservice.services;

import org.sdia.immatriculationmicroservice.dto.ProprietaireRequestDTO;
import org.sdia.immatriculationmicroservice.dto.ProprietaireResponseDTO;
import org.springframework.graphql.data.method.annotation.Argument;

public interface ProprietaireService {
    public ProprietaireResponseDTO addProprietaire(@Argument ProprietaireRequestDTO proprietaireRequestDTO);
    public ProprietaireResponseDTO updateProprietaire(@Argument ProprietaireRequestDTO proprietaireRequestDTO,long id);
}
