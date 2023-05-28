package org.sdia.radarmicroservice.services;

import org.sdia.radarmicroservice.entities.Radar;
import org.sdia.radarmicroservice.web.RadarController;
import org.springframework.beans.factory.annotation.Autowired;

public class RadarServiceImp implements RadarService{
    @Autowired
    private RadarController radarController;


    @Override
    public Boolean vitesseDepasser(double vitesseVehicule, String matriculeVihecule, Radar radar) {
        if (radar.getVitesseMaximale() < vitesseVehicule){
            return true;
        }else {
            return false;
        }
    }
}
