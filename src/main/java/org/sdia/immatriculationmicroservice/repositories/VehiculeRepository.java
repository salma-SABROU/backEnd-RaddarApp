package org.sdia.immatriculationmicroservice.repositories;

import org.sdia.immatriculationmicroservice.entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculeRepository extends JpaRepository<Vehicule,Long> {
}
