package userApp;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: schema.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserCredCheckGrpc {

  private UserCredCheckGrpc() {}

  public static final String SERVICE_NAME = "userApp.UserCredCheck";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<userApp.Schema.LoginReq,
      userApp.Schema.LoginResp> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = userApp.Schema.LoginReq.class,
      responseType = userApp.Schema.LoginResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<userApp.Schema.LoginReq,
      userApp.Schema.LoginResp> getLoginMethod() {
    io.grpc.MethodDescriptor<userApp.Schema.LoginReq, userApp.Schema.LoginResp> getLoginMethod;
    if ((getLoginMethod = UserCredCheckGrpc.getLoginMethod) == null) {
      synchronized (UserCredCheckGrpc.class) {
        if ((getLoginMethod = UserCredCheckGrpc.getLoginMethod) == null) {
          UserCredCheckGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<userApp.Schema.LoginReq, userApp.Schema.LoginResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  userApp.Schema.LoginReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  userApp.Schema.LoginResp.getDefaultInstance()))
              .setSchemaDescriptor(new UserCredCheckMethodDescriptorSupplier("login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<userApp.Schema.Empty,
      userApp.Schema.LoginResp> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = userApp.Schema.Empty.class,
      responseType = userApp.Schema.LoginResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<userApp.Schema.Empty,
      userApp.Schema.LoginResp> getLogoutMethod() {
    io.grpc.MethodDescriptor<userApp.Schema.Empty, userApp.Schema.LoginResp> getLogoutMethod;
    if ((getLogoutMethod = UserCredCheckGrpc.getLogoutMethod) == null) {
      synchronized (UserCredCheckGrpc.class) {
        if ((getLogoutMethod = UserCredCheckGrpc.getLogoutMethod) == null) {
          UserCredCheckGrpc.getLogoutMethod = getLogoutMethod =
              io.grpc.MethodDescriptor.<userApp.Schema.Empty, userApp.Schema.LoginResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  userApp.Schema.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  userApp.Schema.LoginResp.getDefaultInstance()))
              .setSchemaDescriptor(new UserCredCheckMethodDescriptorSupplier("logout"))
              .build();
        }
      }
    }
    return getLogoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserCredCheckStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserCredCheckStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserCredCheckStub>() {
        @java.lang.Override
        public UserCredCheckStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserCredCheckStub(channel, callOptions);
        }
      };
    return UserCredCheckStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserCredCheckBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserCredCheckBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserCredCheckBlockingStub>() {
        @java.lang.Override
        public UserCredCheckBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserCredCheckBlockingStub(channel, callOptions);
        }
      };
    return UserCredCheckBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserCredCheckFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserCredCheckFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserCredCheckFutureStub>() {
        @java.lang.Override
        public UserCredCheckFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserCredCheckFutureStub(channel, callOptions);
        }
      };
    return UserCredCheckFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserCredCheckImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(userApp.Schema.LoginReq request,
        io.grpc.stub.StreamObserver<userApp.Schema.LoginResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void logout(userApp.Schema.Empty request,
        io.grpc.stub.StreamObserver<userApp.Schema.LoginResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                userApp.Schema.LoginReq,
                userApp.Schema.LoginResp>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getLogoutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                userApp.Schema.Empty,
                userApp.Schema.LoginResp>(
                  this, METHODID_LOGOUT)))
          .build();
    }
  }

  /**
   */
  public static final class UserCredCheckStub extends io.grpc.stub.AbstractAsyncStub<UserCredCheckStub> {
    private UserCredCheckStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserCredCheckStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserCredCheckStub(channel, callOptions);
    }

    /**
     */
    public void login(userApp.Schema.LoginReq request,
        io.grpc.stub.StreamObserver<userApp.Schema.LoginResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(userApp.Schema.Empty request,
        io.grpc.stub.StreamObserver<userApp.Schema.LoginResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserCredCheckBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserCredCheckBlockingStub> {
    private UserCredCheckBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserCredCheckBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserCredCheckBlockingStub(channel, callOptions);
    }

    /**
     */
    public userApp.Schema.LoginResp login(userApp.Schema.LoginReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public userApp.Schema.LoginResp logout(userApp.Schema.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserCredCheckFutureStub extends io.grpc.stub.AbstractFutureStub<UserCredCheckFutureStub> {
    private UserCredCheckFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserCredCheckFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserCredCheckFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<userApp.Schema.LoginResp> login(
        userApp.Schema.LoginReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<userApp.Schema.LoginResp> logout(
        userApp.Schema.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserCredCheckImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserCredCheckImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((userApp.Schema.LoginReq) request,
              (io.grpc.stub.StreamObserver<userApp.Schema.LoginResp>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((userApp.Schema.Empty) request,
              (io.grpc.stub.StreamObserver<userApp.Schema.LoginResp>) responseObserver);
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

  private static abstract class UserCredCheckBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserCredCheckBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return userApp.Schema.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserCredCheck");
    }
  }

  private static final class UserCredCheckFileDescriptorSupplier
      extends UserCredCheckBaseDescriptorSupplier {
    UserCredCheckFileDescriptorSupplier() {}
  }

  private static final class UserCredCheckMethodDescriptorSupplier
      extends UserCredCheckBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserCredCheckMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserCredCheckGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserCredCheckFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
