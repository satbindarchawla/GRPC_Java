package com.stackroute.service;



import io.grpc.stub.StreamObserver;
import todoapp.TodoGrpc;
import todoapp.TodoOuterClass;

import java.util.ArrayList;
import java.util.List;

public class TodoService extends TodoGrpc.TodoImplBase {

    private  List<TodoOuterClass.TodoItem> todos = new ArrayList<>();

    @Override
    public void addTodo(TodoOuterClass.TodoItem todo, StreamObserver<TodoOuterClass.TodoItem> responseObserver) {
        System.out.println(todo.getId()+"=>"+todo.getTask()+"=>"+todo.getDone());
        todos.add(todo);
      //  super.addTodo(todo, responseObserver);
        responseObserver.onNext(todo);
        responseObserver.onCompleted();
    }

    @Override
    public void getTodos(TodoOuterClass.Void request, StreamObserver<TodoOuterClass.TodoItems> responseObserver) {
        TodoOuterClass.TodoItems todosResult = TodoOuterClass.TodoItems.newBuilder().addAllTodos(todos).build();
        responseObserver.onNext(todosResult);
        responseObserver.onCompleted();
    }
}
