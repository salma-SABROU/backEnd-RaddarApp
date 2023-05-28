package org.sdia.radarmicroservice;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.sdia.radarmicroservice.entities.Radar;
import org.sdia.radarmicroservice.feign.ImmatriculationRestClient;
import org.sdia.radarmicroservice.feign.InfractionRestClient;
import org.sdia.radarmicroservice.model.Infraction;
import org.sdia.radarmicroservice.model.Proprietaire;
import org.sdia.radarmicroservice.model.Vehicule;
import org.sdia.radarmicroservice.repositories.RadarRepository;
import org.sdia.radarmicroservice.services.RadarService;
import org.sdia.radarmicroservice.services.RadarServiceImp;
import org.sdia.radarmicroservice.stub.radarGrpcServiceGrpc;
import org.sdia.radarmicroservice.web.RadarController;
import org.sdia.radarmicroservice.web.RadarGrpcController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

@SpringBootApplication
@EnableFeignClients
public class RadarMicroServiceApplication {

    @Autowired
    RadarController radarController;

    @Autowired
    RadarGrpcController radarGrpcController;

    public static void main(String[] args) {
        SpringApplication.run(RadarMicroServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(RadarRepository radarRepository, ImmatriculationRestClient immatriculationRestClient, InfractionRestClient infractionRestClient){
        return args -> {
            ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("localhost",8089)
                    .usePlaintext()
                    .build();
            radarGrpcServiceGrpc.radarGrpcServiceBlockingStub blockingStub=radarGrpcServiceGrpc.newBlockingStub(managedChannel);
            Radar radar=new Radar(1,120,30.322,6.68);
            RadarServiceImp radarService=new RadarServiceImp();
            Radar radarSaved=radarRepository.save(radar);
            Random random = new Random();
            double v= radar.getVitesseMaximale();
            for (int i=0;i<10;i++){
                double vitess= v+(600-v)*random.nextDouble();
                String m="EE-8522";
                System.out.println("Vehicule "+m+" : "+vitess+" km/h");
                if (radarService.vitesseDepasser(vitess,m,radar)){
                    //recuperer le proprietaire et vehicule
                    Vehicule response = radarController.vehiculeByMatricule(m);
                    System.out.println("////////// "+response+"//////////////");
                    //org.sdia.radarmicroservice.stub.Radar.VehiculeRequest vehiculeRequest= org.sdia.radarmicroservice.stub.Radar.VehiculeRequest.newBuilder().setNumeroMatricule(m).build();
                    //org.sdia.radarmicroservice.stub.Radar.VehiculeResponse response=blockingStub.getVehiculeByMatricule(vehiculeRequest);
                    System.out.println("////////// "+response+"//////////////");


                    Proprietaire proprietaireResponse=radarController.proprietaireById(response.getId());
                    System.out.println("//////////"+proprietaireResponse+"/////////");
                    //org.sdia.radarmicroservice.stub.Radar.ProprietaireRequest request=org.sdia.radarmicroservice.stub.Radar.ProprietaireRequest.newBuilder().setId(response.getId()).build();
                    //org.sdia.radarmicroservice.stub.Radar.ProprietaireResponse proprietaireResponse=blockingStub.getProprietaireById(request);
                    System.out.println("//////////"+proprietaireResponse+"/////////");

                    //generer l'infraction
                    Infraction infraction=new Infraction(0,new Date(), radar.getId(), m,vitess, radar.getVitesseMaximale(), 1042222);
                    Infraction infractionSaved= radarController.InfractionSave(infraction).getBody();
                    System.out.println("Infraction saved : "+infractionSaved);

                    /*org.sdia.radarmicroservice.stub.Radar.infractionRequest infractionRequest= org.sdia.radarmicroservice.stub.Radar.infractionRequest.newBuilder()
                            .setDate(String.valueOf(new Date()))
                            .setMontantInfraction(1042222)
                            .setNumeroRadar(radar.getId())
                            .setMatriculeVehicule(m)
                            .setVitesseMaximaleRadar(radar.getVitesseMaximale())
                            .setVitesseVehicule(vitess)
                            .build();

                    org.sdia.radarmicroservice.stub.Radar.infractionResponse infractionSaved=blockingStub.saveInfraction(infractionRequest);
                    System.out.println("Infraction saved : "+infractionSaved);*/

                }
            }
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
