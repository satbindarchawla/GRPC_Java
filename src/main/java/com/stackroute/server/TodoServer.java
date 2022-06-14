package com.stackroute.server;


import com.stackroute.service.TodoService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class TodoServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Todo Grpc");

        Server server = ServerBuilder.forPort(5051)
                .addService(new TodoService())
                .build();
        server.start();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutdown requested!");
        }));
        server.awaitTermination();
    }
}
