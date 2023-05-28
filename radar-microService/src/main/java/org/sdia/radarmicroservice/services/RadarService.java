package org.sdia.radarmicroservice.services;

import org.sdia.radarmicroservice.entities.Radar;

public interface RadarService {

    public Boolean vitesseDepasser(double vitesseVehicule, String matriculeVihecule, Radar radar);
}
