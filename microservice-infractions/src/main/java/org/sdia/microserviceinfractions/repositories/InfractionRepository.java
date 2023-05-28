package org.sdia.microserviceinfractions.repositories;

import org.sdia.microserviceinfractions.entities.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfractionRepository extends JpaRepository<Infraction,Long> {
}
