package org.sdia.microserviceinfractions;

import org.springframework.web.filter.CorsFilter;
import org.sdia.microserviceinfractions.entities.Infraction;
import org.sdia.microserviceinfractions.repositories.InfractionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class MicroserviceInfractionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceInfractionsApplication.class, args);
    }

    @Bean
    CommandLineRunner start(InfractionRepository infractionRepository){
        //repositoryRestConfiguration.exposeIdsFor(Infraction.class);
        return args -> {
            infractionRepository.save(new Infraction(0,new Date(),1,"EE-8522",50.20,80,0));
            infractionRepository.save(new Infraction(0,new Date(),2,"AZ-422",60,80,0));
            infractionRepository.save(new Infraction(0,new Date(),1,"EE-8522",100,80,150));
            infractionRepository.save(new Infraction(0,new Date(),2,"AZ-422",120,60,700));
            infractionRepository.save(new Infraction(0,new Date(),1,"EE-8522",50.20,80,0));
            infractionRepository.save(new Infraction(0,new Date(),2,"AZ-422",60,80,0));
            infractionRepository.save(new Infraction(0,new Date(),1,"EE-8522",100,80,150));

            infractionRepository.findAll().forEach(customer -> {
                System.out.println(customer.toString());
            });
        };
    }

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
        corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
                "Accept", "Authorization", "Origin, Accept", "X-Requested-With",
                "Access-Control-Request-Method", "Access-Control-Request-Headers"));
        corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
                "Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
        corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }


}
