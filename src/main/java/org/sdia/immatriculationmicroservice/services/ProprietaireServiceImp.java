package org.sdia.immatriculationmicroservice.services;

import org.sdia.immatriculationmicroservice.dto.ProprietaireRequestDTO;
import org.sdia.immatriculationmicroservice.dto.ProprietaireResponseDTO;
import org.sdia.immatriculationmicroservice.entities.Proprietaire;
import org.sdia.immatriculationmicroservice.mappers.ProprietaireMapper;
import org.sdia.immatriculationmicroservice.repositories.ProprietaireRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProprietaireServiceImp implements ProprietaireService{
    private ProprietaireRepository proprietaireRepository;
    private ProprietaireMapper proprietaireMapper;

    public ProprietaireServiceImp(ProprietaireRepository proprietaireRepository, ProprietaireMapper proprietaireMapper) {
        this.proprietaireRepository = proprietaireRepository;
        this.proprietaireMapper = proprietaireMapper;
    }

    @Override
    public ProprietaireResponseDTO addProprietaire(ProprietaireRequestDTO proprietaireRequestDTO) {
        Proprietaire proprietaire=proprietaireMapper.fromRequestDtoToProprietaire(proprietaireRequestDTO);
        Proprietaire proprietaireSaved=proprietaireRepository.save(proprietaire);
        ProprietaireResponseDTO proprietaireResponseDTO=proprietaireMapper.fromProprietaireToResponseDTO(proprietaireSaved);
        return proprietaireResponseDTO;
    }

    @Override
    public ProprietaireResponseDTO updateProprietaire(ProprietaireRequestDTO proprietaireRequestDTO, long id) {
        Proprietaire proprietaire=new Proprietaire();
        proprietaire.setId(id);
        proprietaire.setEmail(proprietaireRequestDTO.getEmail());
        proprietaire.setNom(proprietaireRequestDTO.getNom());
        proprietaire.setDateNaissance(proprietaireRequestDTO.getDateNaissance());

        Proprietaire proprietaireSaved=proprietaireRepository.save(proprietaire);
        ProprietaireResponseDTO proprietaireResponseDTO=proprietaireMapper.fromProprietaireToResponseDTO(proprietaireSaved);

        return proprietaireResponseDTO;
    }
}
