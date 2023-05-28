package org.sdia.radarmicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Vehicule {
    private long id;
    private String numeroMatricule;
    private String marque;
    private String puissanceFiscale;
    private String modele;

    private long IdProprietaire;
}
