package org.sdia.immatriculationmicroservice.servers;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.sdia.immatriculationmicroservice.web.ImmatriculationGrpc;

import java.io.IOException;

public class serverGrpcTest {
    public static void main(String[] args) throws InterruptedException, IOException {
        Server server= ServerBuilder.forPort(6666)
                .addService(new ImmatriculationGrpc())
                .build();
        server.start();
        server.awaitTermination();
    }
}
