package org.sdia.radarmicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Proprietaire {
    private long id;
    private  String nom;
    private Date dateNaissance;
    private String email;
}
