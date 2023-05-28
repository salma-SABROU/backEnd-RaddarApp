package org.sdia.radarmicroservice.feign;

import org.sdia.radarmicroservice.model.Infraction;
import org.sdia.radarmicroservice.model.Proprietaire;
import org.sdia.radarmicroservice.model.Vehicule;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "INFRACTION-SERVICE")
public interface InfractionRestClient {

    @PostMapping(path = "/infraction")
    public Infraction saveInfraction(@PathVariable(name = "infraction") Infraction infraction);

}
