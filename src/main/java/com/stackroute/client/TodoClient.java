package com.stackroute.client;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import todoapp.TodoGrpc;
import todoapp.TodoOuterClass;

public class TodoClient {

    public static void main(String[] args) {
        System.out.println("Client");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 5051).usePlaintext().build();
        System.out.println("Creating Stub");
        //DummyServiceGrpc.DummyServiceBlockingStub syncClient = DummyServiceGrpc.newBlockingStub(channel);

        TodoGrpc.TodoBlockingStub client = TodoGrpc.newBlockingStub(channel);
        for(int i = 0 ;i<10;i++) {
            TodoOuterClass.TodoItem todo = TodoOuterClass.TodoItem.newBuilder().setId(i).setTask("Watch News :"+i).setDone(false).build();
            TodoOuterClass.TodoItem response = client.addTodo(todo);
            System.out.println("Task Retuned:" + response.getTask());
        }

        System.out.println("Getting all Todos!");
        TodoOuterClass.Void voidInput = TodoOuterClass.Void.newBuilder().build();
        TodoOuterClass.TodoItems results = client.getTodos(voidInput);

        for (TodoOuterClass.TodoItem todo: results.getTodosList()) {
            System.out.println("Todo : "+ todo.getId() +"=>"+todo.getTask());
        }
        // do something
        System.out.println("Shutting down channnel ");
        channel.shutdown();
    }
}
