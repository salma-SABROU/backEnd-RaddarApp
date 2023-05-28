package org.sdia.immatriculationmicroservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class VehiculeResponseDTO {
    private long id;
    private String numeroMatricule;
    private String marque;
    private String puissanceFiscale;
    private String modele;
    private long idProprietaire;
}
