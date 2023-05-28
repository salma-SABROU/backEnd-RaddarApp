package org.sdia.radarmicroservice.repositories;

import org.sdia.radarmicroservice.entities.Radar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RadarRepository extends JpaRepository<Radar,Long> {
}
