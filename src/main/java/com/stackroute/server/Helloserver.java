package com.stackroute.server;

import hello.Hello;
import hello.HelloServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class Helloserver extends HelloServiceGrpc.HelloServiceImplBase {

   @Override
   public void sayHello(Hello.HelloReq request, StreamObserver<Hello.HelloResp> responseObserver) {
       responseObserver.onNext(Hello.HelloResp.newBuilder().setResult("Hello " +request.getName() +"!").build());
       responseObserver.onCompleted();
   }

   @Override
   public void sayHelloStrict(Hello.HelloReq request, StreamObserver<Hello.HelloResp> responseObserver) {

       if(request.getName().length()<=10)
       {
           Status status = Status.INVALID_ARGUMENT.withDescription("Length of Name must be more than 10 characters");
           responseObserver.onError(status.asRuntimeException());
           return;
       }
       responseObserver.onNext(Hello.HelloResp.newBuilder().setResult("Hello " +request.getName() +"!").build());
       responseObserver.onCompleted();
   }

   public static void main(String[] args) throws IOException, InterruptedException {
       System.out.println("Hello Grpc");

       Server server = ServerBuilder.forPort(50052)
               .addService(new Helloserver())
               .build();
       server.start();
       Runtime.getRuntime().addShutdownHook(new Thread(() -> {
           System.out.println("Shutdown requested!");
       }));
       server.awaitTermination();
   }
}
