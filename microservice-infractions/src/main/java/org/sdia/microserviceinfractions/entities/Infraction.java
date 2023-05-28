package org.sdia.microserviceinfractions.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Infraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    Date date;
    long numeroRadar;
    String matriculeVehicule;
    double vitesseVehicule;
    double vitesseMaximaleRadar;
    double montantInfraction;

}
