package com.stackroute.server;

import java.io.IOException;

import com.stackroute.service.UserCredCheckService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class UserCredCheckServer {
    public static void main(String[] args) throws IOException, InterruptedException{
        System.out.println("Server Started");
        Server server = ServerBuilder.forPort(5052).addService(new UserCredCheckService()).build();
        server.start();
        System.out.println("Server started at "+server.getPort());
        server.awaitTermination();
    }
    
}
