package org.sdia.radarmicroservice.stub;

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
    comments = "Source: radar.proto")
public final class radarGrpcServiceGrpc {

  private radarGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "radarGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.sdia.radarmicroservice.stub.Radar.VehiculeRequest,
      org.sdia.radarmicroservice.stub.Radar.VehiculeResponse> getGetVehiculeByMatriculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehiculeByMatricule",
      requestType = org.sdia.radarmicroservice.stub.Radar.VehiculeRequest.class,
      responseType = org.sdia.radarmicroservice.stub.Radar.VehiculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sdia.radarmicroservice.stub.Radar.VehiculeRequest,
      org.sdia.radarmicroservice.stub.Radar.VehiculeResponse> getGetVehiculeByMatriculeMethod() {
    io.grpc.MethodDescriptor<org.sdia.radarmicroservice.stub.Radar.VehiculeRequest, org.sdia.radarmicroservice.stub.Radar.VehiculeResponse> getGetVehiculeByMatriculeMethod;
    if ((getGetVehiculeByMatriculeMethod = radarGrpcServiceGrpc.getGetVehiculeByMatriculeMethod) == null) {
      synchronized (radarGrpcServiceGrpc.class) {
        if ((getGetVehiculeByMatriculeMethod = radarGrpcServiceGrpc.getGetVehiculeByMatriculeMethod) == null) {
          radarGrpcServiceGrpc.getGetVehiculeByMatriculeMethod = getGetVehiculeByMatriculeMethod = 
              io.grpc.MethodDescriptor.<org.sdia.radarmicroservice.stub.Radar.VehiculeRequest, org.sdia.radarmicroservice.stub.Radar.VehiculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "radarGrpcService", "getVehiculeByMatricule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sdia.radarmicroservice.stub.Radar.VehiculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sdia.radarmicroservice.stub.Radar.VehiculeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new radarGrpcServiceMethodDescriptorSupplier("getVehiculeByMatricule"))
                  .build();
          }
        }
     }
     return getGetVehiculeByMatriculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sdia.radarmicroservice.stub.Radar.ProprietaireRequest,
      org.sdia.radarmicroservice.stub.Radar.ProprietaireResponse> getGetProprietaireByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProprietaireById",
      requestType = org.sdia.radarmicroservice.stub.Radar.ProprietaireRequest.class,
      responseType = org.sdia.radarmicroservice.stub.Radar.ProprietaireResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sdia.radarmicroservice.stub.Radar.ProprietaireRequest,
      org.sdia.radarmicroservice.stub.Radar.ProprietaireResponse> getGetProprietaireByIdMethod() {
    io.grpc.MethodDescriptor<org.sdia.radarmicroservice.stub.Radar.ProprietaireRequest, org.sdia.radarmicroservice.stub.Radar.ProprietaireResponse> getGetProprietaireByIdMethod;
    if ((getGetProprietaireByIdMethod = radarGrpcServiceGrpc.getGetProprietaireByIdMethod) == null) {
      synchronized (radarGrpcServiceGrpc.class) {
        if ((getGetProprietaireByIdMethod = radarGrpcServiceGrpc.getGetProprietaireByIdMethod) == null) {
          radarGrpcServiceGrpc.getGetProprietaireByIdMethod = getGetProprietaireByIdMethod = 
              io.grpc.MethodDescriptor.<org.sdia.radarmicroservice.stub.Radar.ProprietaireRequest, org.sdia.radarmicroservice.stub.Radar.ProprietaireResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "radarGrpcService", "getProprietaireById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sdia.radarmicroservice.stub.Radar.ProprietaireRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sdia.radarmicroservice.stub.Radar.ProprietaireResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new radarGrpcServiceMethodDescriptorSupplier("getProprietaireById"))
                  .build();
          }
        }
     }
     return getGetProprietaireByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sdia.radarmicroservice.stub.Radar.infractionRequest,
      org.sdia.radarmicroservice.stub.Radar.infractionResponse> getSaveInfractionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveInfraction",
      requestType = org.sdia.radarmicroservice.stub.Radar.infractionRequest.class,
      responseType = org.sdia.radarmicroservice.stub.Radar.infractionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sdia.radarmicroservice.stub.Radar.infractionRequest,
      org.sdia.radarmicroservice.stub.Radar.infractionResponse> getSaveInfractionMethod() {
    io.grpc.MethodDescriptor<org.sdia.radarmicroservice.stub.Radar.infractionRequest, org.sdia.radarmicroservice.stub.Radar.infractionResponse> getSaveInfractionMethod;
    if ((getSaveInfractionMethod = radarGrpcServiceGrpc.getSaveInfractionMethod) == null) {
      synchronized (radarGrpcServiceGrpc.class) {
        if ((getSaveInfractionMethod = radarGrpcServiceGrpc.getSaveInfractionMethod) == null) {
          radarGrpcServiceGrpc.getSaveInfractionMethod = getSaveInfractionMethod = 
              io.grpc.MethodDescriptor.<org.sdia.radarmicroservice.stub.Radar.infractionRequest, org.sdia.radarmicroservice.stub.Radar.infractionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "radarGrpcService", "saveInfraction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sdia.radarmicroservice.stub.Radar.infractionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sdia.radarmicroservice.stub.Radar.infractionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new radarGrpcServiceMethodDescriptorSupplier("saveInfraction"))
                  .build();
          }
        }
     }
     return getSaveInfractionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static radarGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new radarGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static radarGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new radarGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static radarGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new radarGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class radarGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getVehiculeByMatricule(org.sdia.radarmicroservice.stub.Radar.VehiculeRequest request,
        io.grpc.stub.StreamObserver<org.sdia.radarmicroservice.stub.Radar.VehiculeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehiculeByMatriculeMethod(), responseObserver);
    }

    /**
     */
    public void getProprietaireById(org.sdia.radarmicroservice.stub.Radar.ProprietaireRequest request,
        io.grpc.stub.StreamObserver<org.sdia.radarmicroservice.stub.Radar.ProprietaireResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProprietaireByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveInfraction(org.sdia.radarmicroservice.stub.Radar.infractionRequest request,
        io.grpc.stub.StreamObserver<org.sdia.radarmicroservice.stub.Radar.infractionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveInfractionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetVehiculeByMatriculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sdia.radarmicroservice.stub.Radar.VehiculeRequest,
                org.sdia.radarmicroservice.stub.Radar.VehiculeResponse>(
                  this, METHODID_GET_VEHICULE_BY_MATRICULE)))
          .addMethod(
            getGetProprietaireByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sdia.radarmicroservice.stub.Radar.ProprietaireRequest,
                org.sdia.radarmicroservice.stub.Radar.ProprietaireResponse>(
                  this, METHODID_GET_PROPRIETAIRE_BY_ID)))
          .addMethod(
            getSaveInfractionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sdia.radarmicroservice.stub.Radar.infractionRequest,
                org.sdia.radarmicroservice.stub.Radar.infractionResponse>(
                  this, METHODID_SAVE_INFRACTION)))
          .build();
    }
  }

  /**
   */
  public static final class radarGrpcServiceStub extends io.grpc.stub.AbstractStub<radarGrpcServiceStub> {
    private radarGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private radarGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected radarGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new radarGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void getVehiculeByMatricule(org.sdia.radarmicroservice.stub.Radar.VehiculeRequest request,
        io.grpc.stub.StreamObserver<org.sdia.radarmicroservice.stub.Radar.VehiculeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehiculeByMatriculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProprietaireById(org.sdia.radarmicroservice.stub.Radar.ProprietaireRequest request,
        io.grpc.stub.StreamObserver<org.sdia.radarmicroservice.stub.Radar.ProprietaireResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProprietaireByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveInfraction(org.sdia.radarmicroservice.stub.Radar.infractionRequest request,
        io.grpc.stub.StreamObserver<org.sdia.radarmicroservice.stub.Radar.infractionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveInfractionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class radarGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<radarGrpcServiceBlockingStub> {
    private radarGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private radarGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected radarGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new radarGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.sdia.radarmicroservice.stub.Radar.VehiculeResponse getVehiculeByMatricule(org.sdia.radarmicroservice.stub.Radar.VehiculeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVehiculeByMatriculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sdia.radarmicroservice.stub.Radar.ProprietaireResponse getProprietaireById(org.sdia.radarmicroservice.stub.Radar.ProprietaireRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProprietaireByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sdia.radarmicroservice.stub.Radar.infractionResponse saveInfraction(org.sdia.radarmicroservice.stub.Radar.infractionRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveInfractionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class radarGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<radarGrpcServiceFutureStub> {
    private radarGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private radarGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected radarGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new radarGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sdia.radarmicroservice.stub.Radar.VehiculeResponse> getVehiculeByMatricule(
        org.sdia.radarmicroservice.stub.Radar.VehiculeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehiculeByMatriculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sdia.radarmicroservice.stub.Radar.ProprietaireResponse> getProprietaireById(
        org.sdia.radarmicroservice.stub.Radar.ProprietaireRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProprietaireByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sdia.radarmicroservice.stub.Radar.infractionResponse> saveInfraction(
        org.sdia.radarmicroservice.stub.Radar.infractionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveInfractionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VEHICULE_BY_MATRICULE = 0;
  private static final int METHODID_GET_PROPRIETAIRE_BY_ID = 1;
  private static final int METHODID_SAVE_INFRACTION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final radarGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(radarGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VEHICULE_BY_MATRICULE:
          serviceImpl.getVehiculeByMatricule((org.sdia.radarmicroservice.stub.Radar.VehiculeRequest) request,
              (io.grpc.stub.StreamObserver<org.sdia.radarmicroservice.stub.Radar.VehiculeResponse>) responseObserver);
          break;
        case METHODID_GET_PROPRIETAIRE_BY_ID:
          serviceImpl.getProprietaireById((org.sdia.radarmicroservice.stub.Radar.ProprietaireRequest) request,
              (io.grpc.stub.StreamObserver<org.sdia.radarmicroservice.stub.Radar.ProprietaireResponse>) responseObserver);
          break;
        case METHODID_SAVE_INFRACTION:
          serviceImpl.saveInfraction((org.sdia.radarmicroservice.stub.Radar.infractionRequest) request,
              (io.grpc.stub.StreamObserver<org.sdia.radarmicroservice.stub.Radar.infractionResponse>) responseObserver);
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

  private static abstract class radarGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    radarGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.sdia.radarmicroservice.stub.Radar.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("radarGrpcService");
    }
  }

  private static final class radarGrpcServiceFileDescriptorSupplier
      extends radarGrpcServiceBaseDescriptorSupplier {
    radarGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class radarGrpcServiceMethodDescriptorSupplier
      extends radarGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    radarGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (radarGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new radarGrpcServiceFileDescriptorSupplier())
              .addMethod(getGetVehiculeByMatriculeMethod())
              .addMethod(getGetProprietaireByIdMethod())
              .addMethod(getSaveInfractionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
