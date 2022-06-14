package com.stackroute.service;

import io.grpc.stub.StreamObserver;
import userApp.Schema.LoginResp;
import userApp.UserCredCheckGrpc.UserCredCheckImplBase;

public class UserCredCheckService extends UserCredCheckImplBase  {

    @Override
    public void login(userApp.Schema.LoginReq request, StreamObserver<userApp.Schema.LoginResp> responseObserver) {
        System.out.println("Inside Login");
        String userName = request.getUsername();
        String password = request.getPassword();
        LoginResp.Builder Response = LoginResp.newBuilder();
        if(userName.equals(password)){
            Response.setResponseCode(0).setResponseMessage("SUCCESS");
    
        }
        else{
            Response.setResponseCode(100).setResponseMessage("INVALID PASSWORD");
    
        }
        responseObserver.onNext(Response.build());  
        responseObserver.onCompleted();
    }
    
    @Override
    public void logout(userApp.Schema.Empty request, StreamObserver<userApp.Schema.LoginResp> responseObserver) {
        
    }
    

}