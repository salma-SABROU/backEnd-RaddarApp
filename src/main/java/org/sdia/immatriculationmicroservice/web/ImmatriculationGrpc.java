package org.sdia.immatriculationmicroservice.web;


import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.sdia.immatriculationmicroservice.entities.Proprietaire;
import org.sdia.immatriculationmicroservice.entities.Vehicule;
import org.sdia.immatriculationmicroservice.mappers.ProprietaireMapper;
import org.sdia.immatriculationmicroservice.mappers.VehiculeMapper;
import org.sdia.immatriculationmicroservice.repositories.ProprietaireRepository;
import org.sdia.immatriculationmicroservice.repositories.VehiculeRepository;
import org.sdia.immatriculationmicroservice.stub.Immatriculation;
import org.sdia.immatriculationmicroservice.stub.ImmutationGrpcServiceGrpc;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class ImmatriculationGrpc extends ImmutationGrpcServiceGrpc.ImmutationGrpcServiceImplBase {
    @Autowired
    private ProprietaireRepository proprietaireRepository;

    @Autowired
    private VehiculeRepository vehiculeRepository;

    @Autowired
    private VehiculeMapper vehiculeMapper;

    @Autowired
    private ProprietaireMapper proprietaireMapper;
    @Override
    public void savevehicule(Immatriculation.VehiculeRequestDTO request, StreamObserver<Immatriculation.VehiculeResponseDTO> responseObserver) {
        Vehicule vehicule=new Vehicule();

        vehicule.setNumeroMatricule(request.getNumeroMatricule());
        vehicule.setMarque(request.getMarque());
        vehicule.setPuissanceFiscale(request.getPuissanceFiscale());
        vehicule.setModele(request.getModele());
        vehicule.setIdProprietaire(request.getIdProprietaire());

        Vehicule savedVehicule=vehiculeRepository.save(vehicule);

        Immatriculation.VehiculeResponseDTO responseDTO=vehiculeMapper.fromVehiculeToResponseDTOGRPC(savedVehicule);

        responseObserver.onNext(responseDTO);
        responseObserver.onCompleted();
    }

    @Override
    public void vehicules(Immatriculation.GetListVehiculeRequestDTO request, StreamObserver<Immatriculation.GetListVehiculeResponseDTO> responseObserver) {
        List<Vehicule> vehiculeList=vehiculeRepository.findAll();

        List<Immatriculation.Vehicule> collect = vehiculeList.stream().map(vehicule -> vehiculeMapper.fromVehiculeToVehiculeDTO(vehicule)).collect(Collectors.toList());

        Immatriculation.GetListVehiculeResponseDTO listVehiculeResponse=Immatriculation.GetListVehiculeResponseDTO.newBuilder()
                .addAllVehicule(collect)
                .build();

        responseObserver.onNext(listVehiculeResponse);
        responseObserver.onCompleted();

    }

    @Override
    public void proprietaire(Immatriculation.GetListProprietaireRequestDTO request, StreamObserver<Immatriculation.GetListProprietaireResponseDTO> responseObserver) {
        List<Proprietaire> proprietaireList=proprietaireRepository.findAll();

        List<Immatriculation.Proprietaire> collect = proprietaireList.stream().map(proprietaire -> proprietaireMapper.fromProprietaireToProprietaireDTO(proprietaire)).collect(Collectors.toList());

        Immatriculation.GetListProprietaireResponseDTO listProprietaireResponse=Immatriculation.GetListProprietaireResponseDTO.newBuilder()
                .addAllProprietaire(collect)
                .build();

        responseObserver.onNext(listProprietaireResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void saveProprietaire(Immatriculation.ProprietaireRequestDTO request, StreamObserver<Immatriculation.ProprietaireResponseDTO> responseObserver) {
        Proprietaire proprietaire=new Proprietaire();
        Date date=new Date();
        String dateString = request.getDateNaissance();
        String pattern = "yyyy-MM-dd HH:mm:ss";

        SimpleDateFormat sdf = new java.text.SimpleDateFormat(pattern);
        try {
            date = sdf.parse(dateString);
            System.out.println(date);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }

        proprietaire.setDateNaissance(date);
        proprietaire.setEmail(request.getEmail());
        proprietaire.setNom(request.getNom());

        Proprietaire savedProprietaire=proprietaireRepository.save(proprietaire);

        Immatriculation.ProprietaireResponseDTO responseDTO=proprietaireMapper.fromProprietaireToResponseDTOGRPC(savedProprietaire);

        responseObserver.onNext(responseDTO);
        responseObserver.onCompleted();
    }
}
