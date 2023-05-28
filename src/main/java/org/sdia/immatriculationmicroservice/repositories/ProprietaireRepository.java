package org.sdia.immatriculationmicroservice.repositories;

import org.sdia.immatriculationmicroservice.entities.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProprietaireRepository extends JpaRepository<Proprietaire,Long> {
}
