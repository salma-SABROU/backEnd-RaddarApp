package org.sdia.radarmicroservice.web;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.sdia.radarmicroservice.feign.ImmatriculationRestClient;
import org.sdia.radarmicroservice.feign.InfractionRestClient;
import org.sdia.radarmicroservice.mappers.Mapper;
import org.sdia.radarmicroservice.model.Infraction;
import org.sdia.radarmicroservice.model.Proprietaire;
import org.sdia.radarmicroservice.model.Vehicule;
import org.sdia.radarmicroservice.stub.Radar;
import org.sdia.radarmicroservice.stub.radarGrpcServiceGrpc;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@GrpcService
public class RadarGrpcController  extends radarGrpcServiceGrpc.radarGrpcServiceImplBase {

    @Autowired
    private ImmatriculationRestClient immatriculationRestClient;

    @Autowired
    private InfractionRestClient infractionRestClient;


    @Autowired
    private Mapper mapper;
    @Override
    public void getVehiculeByMatricule(Radar.VehiculeRequest request, StreamObserver<Radar.VehiculeResponse> responseObserver) {
        Vehicule vehicule=immatriculationRestClient.getVehiculeByMatricule(request.getNumeroMatricule());
        Radar.VehiculeResponse vehiculeResponse=mapper.fromVehiculeToVehiculeResponse(vehicule);

        responseObserver.onNext(vehiculeResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getProprietaireById(Radar.ProprietaireRequest request, StreamObserver<Radar.ProprietaireResponse> responseObserver) {
        Proprietaire proprietaire=immatriculationRestClient.getProprietaireById(request.getId());
        Radar.ProprietaireResponse proprietaireResponse=mapper.fromProprietaireToProprietaireResponse(proprietaire);

        responseObserver.onNext(proprietaireResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void saveInfraction(Radar.infractionRequest request, StreamObserver<Radar.infractionResponse> responseObserver) {
        Infraction infraction=new Infraction();
        String dateString = request.getDate();
        Date date;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
        try {
            date = dateFormat.parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        infraction.setMontantInfraction(request.getMontantInfraction());
        infraction.setDate(date);
        infraction.setNumeroRadar(request.getNumeroRadar());
        infraction.setVitesseMaximaleRadar(request.getVitesseMaximaleRadar());
        infraction.setVitesseVehicule(request.getVitesseVehicule());
        infraction.setMatriculeVehicule(request.getMatriculeVehicule());

        Infraction infractionSaved=infractionRestClient.saveInfraction(infraction);

        Radar.infractionResponse response=mapper.fromInfractionToinfractionResponse(infractionSaved);

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
