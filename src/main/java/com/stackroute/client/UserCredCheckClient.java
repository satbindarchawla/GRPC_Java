package com.stackroute.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import userApp.UserCredCheckGrpc;
import userApp.Schema.LoginReq;
import userApp.Schema.LoginResp;
import userApp.UserCredCheckGrpc.UserCredCheckBlockingStub;

public class UserCredCheckClient {
    public static void main(String[] args) {
        System.out.println("Client Started");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 5052).usePlaintext().build();
        UserCredCheckBlockingStub userstub =UserCredCheckGrpc.newBlockingStub(channel);
        LoginReq loginreq = LoginReq.newBuilder().setUsername("SCHAWLA").setPassword("SCHAWLA").build();
        LoginResp response = userstub.login(loginreq);
        System.out.println(response.getResponseMessage());
    }
    
}
