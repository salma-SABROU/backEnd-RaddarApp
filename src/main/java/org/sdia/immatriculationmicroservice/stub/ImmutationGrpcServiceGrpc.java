package org.sdia.immatriculationmicroservice.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Immatriculation.proto")
public final class ImmutationGrpcServiceGrpc {

  private ImmutationGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "ImmutationGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeRequestDTO,
      org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeResponseDTO> getSavevehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "savevehicule",
      requestType = org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeRequestDTO.class,
      responseType = org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeResponseDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeRequestDTO,
      org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeResponseDTO> getSavevehiculeMethod() {
    io.grpc.MethodDescriptor<org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeRequestDTO, org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeResponseDTO> getSavevehiculeMethod;
    if ((getSavevehiculeMethod = ImmutationGrpcServiceGrpc.getSavevehiculeMethod) == null) {
      synchronized (ImmutationGrpcServiceGrpc.class) {
        if ((getSavevehiculeMethod = ImmutationGrpcServiceGrpc.getSavevehiculeMethod) == null) {
          ImmutationGrpcServiceGrpc.getSavevehiculeMethod = getSavevehiculeMethod = 
              io.grpc.MethodDescriptor.<org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeRequestDTO, org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeResponseDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmutationGrpcService", "savevehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeRequestDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeResponseDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmutationGrpcServiceMethodDescriptorSupplier("savevehicule"))
                  .build();
          }
        }
     }
     return getSavevehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeRequestDTO,
      org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeResponseDTO> getVehiculesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "vehicules",
      requestType = org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeRequestDTO.class,
      responseType = org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeResponseDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeRequestDTO,
      org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeResponseDTO> getVehiculesMethod() {
    io.grpc.MethodDescriptor<org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeRequestDTO, org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeResponseDTO> getVehiculesMethod;
    if ((getVehiculesMethod = ImmutationGrpcServiceGrpc.getVehiculesMethod) == null) {
      synchronized (ImmutationGrpcServiceGrpc.class) {
        if ((getVehiculesMethod = ImmutationGrpcServiceGrpc.getVehiculesMethod) == null) {
          ImmutationGrpcServiceGrpc.getVehiculesMethod = getVehiculesMethod = 
              io.grpc.MethodDescriptor.<org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeRequestDTO, org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeResponseDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmutationGrpcService", "vehicules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeRequestDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeResponseDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmutationGrpcServiceMethodDescriptorSupplier("vehicules"))
                  .build();
          }
        }
     }
     return getVehiculesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireRequestDTO,
      org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireResponseDTO> getSaveProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveProprietaire",
      requestType = org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireRequestDTO.class,
      responseType = org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireResponseDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireRequestDTO,
      org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireResponseDTO> getSaveProprietaireMethod() {
    io.grpc.MethodDescriptor<org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireRequestDTO, org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireResponseDTO> getSaveProprietaireMethod;
    if ((getSaveProprietaireMethod = ImmutationGrpcServiceGrpc.getSaveProprietaireMethod) == null) {
      synchronized (ImmutationGrpcServiceGrpc.class) {
        if ((getSaveProprietaireMethod = ImmutationGrpcServiceGrpc.getSaveProprietaireMethod) == null) {
          ImmutationGrpcServiceGrpc.getSaveProprietaireMethod = getSaveProprietaireMethod = 
              io.grpc.MethodDescriptor.<org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireRequestDTO, org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireResponseDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmutationGrpcService", "saveProprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireRequestDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireResponseDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmutationGrpcServiceMethodDescriptorSupplier("saveProprietaire"))
                  .build();
          }
        }
     }
     return getSaveProprietaireMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireRequestDTO,
      org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireResponseDTO> getProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "proprietaire",
      requestType = org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireRequestDTO.class,
      responseType = org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireResponseDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireRequestDTO,
      org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireResponseDTO> getProprietaireMethod() {
    io.grpc.MethodDescriptor<org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireRequestDTO, org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireResponseDTO> getProprietaireMethod;
    if ((getProprietaireMethod = ImmutationGrpcServiceGrpc.getProprietaireMethod) == null) {
      synchronized (ImmutationGrpcServiceGrpc.class) {
        if ((getProprietaireMethod = ImmutationGrpcServiceGrpc.getProprietaireMethod) == null) {
          ImmutationGrpcServiceGrpc.getProprietaireMethod = getProprietaireMethod = 
              io.grpc.MethodDescriptor.<org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireRequestDTO, org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireResponseDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmutationGrpcService", "proprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireRequestDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireResponseDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmutationGrpcServiceMethodDescriptorSupplier("proprietaire"))
                  .build();
          }
        }
     }
     return getProprietaireMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImmutationGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new ImmutationGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImmutationGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImmutationGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImmutationGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImmutationGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ImmutationGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void savevehicule(org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeRequestDTO request,
        io.grpc.stub.StreamObserver<org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeResponseDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getSavevehiculeMethod(), responseObserver);
    }

    /**
     */
    public void vehicules(org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeRequestDTO request,
        io.grpc.stub.StreamObserver<org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeResponseDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getVehiculesMethod(), responseObserver);
    }

    /**
     */
    public void saveProprietaire(org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireRequestDTO request,
        io.grpc.stub.StreamObserver<org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireResponseDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveProprietaireMethod(), responseObserver);
    }

    /**
     */
    public void proprietaire(org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireRequestDTO request,
        io.grpc.stub.StreamObserver<org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireResponseDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getProprietaireMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSavevehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeRequestDTO,
                org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeResponseDTO>(
                  this, METHODID_SAVEVEHICULE)))
          .addMethod(
            getVehiculesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeRequestDTO,
                org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeResponseDTO>(
                  this, METHODID_VEHICULES)))
          .addMethod(
            getSaveProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireRequestDTO,
                org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireResponseDTO>(
                  this, METHODID_SAVE_PROPRIETAIRE)))
          .addMethod(
            getProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireRequestDTO,
                org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireResponseDTO>(
                  this, METHODID_PROPRIETAIRE)))
          .build();
    }
  }

  /**
   */
  public static final class ImmutationGrpcServiceStub extends io.grpc.stub.AbstractStub<ImmutationGrpcServiceStub> {
    private ImmutationGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmutationGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmutationGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmutationGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void savevehicule(org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeRequestDTO request,
        io.grpc.stub.StreamObserver<org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeResponseDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSavevehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void vehicules(org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeRequestDTO request,
        io.grpc.stub.StreamObserver<org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeResponseDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVehiculesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveProprietaire(org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireRequestDTO request,
        io.grpc.stub.StreamObserver<org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireResponseDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveProprietaireMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void proprietaire(org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireRequestDTO request,
        io.grpc.stub.StreamObserver<org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireResponseDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProprietaireMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ImmutationGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<ImmutationGrpcServiceBlockingStub> {
    private ImmutationGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmutationGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmutationGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmutationGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeResponseDTO savevehicule(org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeRequestDTO request) {
      return blockingUnaryCall(
          getChannel(), getSavevehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeResponseDTO vehicules(org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeRequestDTO request) {
      return blockingUnaryCall(
          getChannel(), getVehiculesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireResponseDTO saveProprietaire(org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireRequestDTO request) {
      return blockingUnaryCall(
          getChannel(), getSaveProprietaireMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireResponseDTO proprietaire(org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireRequestDTO request) {
      return blockingUnaryCall(
          getChannel(), getProprietaireMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ImmutationGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<ImmutationGrpcServiceFutureStub> {
    private ImmutationGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmutationGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmutationGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmutationGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeResponseDTO> savevehicule(
        org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeRequestDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getSavevehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeResponseDTO> vehicules(
        org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeRequestDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getVehiculesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireResponseDTO> saveProprietaire(
        org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireRequestDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveProprietaireMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireResponseDTO> proprietaire(
        org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireRequestDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getProprietaireMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVEVEHICULE = 0;
  private static final int METHODID_VEHICULES = 1;
  private static final int METHODID_SAVE_PROPRIETAIRE = 2;
  private static final int METHODID_PROPRIETAIRE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImmutationGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImmutationGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVEVEHICULE:
          serviceImpl.savevehicule((org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeRequestDTO) request,
              (io.grpc.stub.StreamObserver<org.sdia.immatriculationmicroservice.stub.Immatriculation.VehiculeResponseDTO>) responseObserver);
          break;
        case METHODID_VEHICULES:
          serviceImpl.vehicules((org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeRequestDTO) request,
              (io.grpc.stub.StreamObserver<org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListVehiculeResponseDTO>) responseObserver);
          break;
        case METHODID_SAVE_PROPRIETAIRE:
          serviceImpl.saveProprietaire((org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireRequestDTO) request,
              (io.grpc.stub.StreamObserver<org.sdia.immatriculationmicroservice.stub.Immatriculation.ProprietaireResponseDTO>) responseObserver);
          break;
        case METHODID_PROPRIETAIRE:
          serviceImpl.proprietaire((org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireRequestDTO) request,
              (io.grpc.stub.StreamObserver<org.sdia.immatriculationmicroservice.stub.Immatriculation.GetListProprietaireResponseDTO>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ImmutationGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImmutationGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.sdia.immatriculationmicroservice.stub.Immatriculation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImmutationGrpcService");
    }
  }

  private static final class ImmutationGrpcServiceFileDescriptorSupplier
      extends ImmutationGrpcServiceBaseDescriptorSupplier {
    ImmutationGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class ImmutationGrpcServiceMethodDescriptorSupplier
      extends ImmutationGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImmutationGrpcServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ImmutationGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImmutationGrpcServiceFileDescriptorSupplier())
              .addMethod(getSavevehiculeMethod())
              .addMethod(getVehiculesMethod())
              .addMethod(getSaveProprietaireMethod())
              .addMethod(getProprietaireMethod())
              .build();
        }
      }
    }
    return result;
  }
}
