package org.sdia.radarmicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Infraction {
    long id;
    Date date;
    long numeroRadar;
    String matriculeVehicule;
    double vitesseVehicule;
    double vitesseMaximaleRadar;
    double montantInfraction;
}
