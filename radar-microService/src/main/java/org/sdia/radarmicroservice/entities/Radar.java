package org.sdia.radarmicroservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Radar {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    double vitesseMaximale;
    double longitude;
    double latitude;
}
