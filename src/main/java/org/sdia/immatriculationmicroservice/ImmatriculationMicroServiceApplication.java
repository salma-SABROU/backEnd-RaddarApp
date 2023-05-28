package org.sdia.immatriculationmicroservice;

import org.sdia.immatriculationmicroservice.entities.Proprietaire;
import org.sdia.immatriculationmicroservice.entities.Vehicule;
import org.sdia.immatriculationmicroservice.repositories.ProprietaireRepository;
import org.sdia.immatriculationmicroservice.repositories.VehiculeRepository;
import org.sdia.immatriculationmicroservice.web.ImmatriculationSoap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import javax.xml.ws.Endpoint;
import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class ImmatriculationMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImmatriculationMicroServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProprietaireRepository proprietaireRepository, VehiculeRepository vehiculeRepository){
        return args -> {
            Vehicule v1=new Vehicule(1,"EE-8522","BMW","puissance","2015",1);
            Vehicule v2=new Vehicule(2,"AZ-422","JEEP","puissanceJ","2023",2);

            Vehicule vh1=vehiculeRepository.save(v1);
            System.out.println("V1 : "+vh1);
            Vehicule vh2=vehiculeRepository.save(v2);
            System.out.println("V2 : "+vh2);

            Proprietaire proprietaire1=new Proprietaire(1,"PR1",new Date(),"p1@gmail.com");
            Proprietaire proprietaire2=new Proprietaire(2,"PR2",new Date(),"p2@gmail.com");
            Proprietaire proprietaire3=new Proprietaire(3,"PR3",new Date(),"p3@gmail.com");
            Proprietaire pr1=proprietaireRepository.save(proprietaire1);
            System.out.println("PR1 : "+pr1);
            Proprietaire pr2=proprietaireRepository.save(proprietaire2);
            System.out.println("PR2 : "+pr2);
            Proprietaire pr3=proprietaireRepository.save(proprietaire3);
            System.out.println("PR3 : "+pr3);

            Endpoint.publish("http://0.0.0.0:8084/",new ImmatriculationSoap(proprietaireRepository,vehiculeRepository));
            System.out.println("WebService deploye sur http://0.0.0.0:8084/ ");

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
