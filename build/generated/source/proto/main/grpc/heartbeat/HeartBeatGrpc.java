package heartbeat;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: heartbeat.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HeartBeatGrpc {

  private HeartBeatGrpc() {}

  public static final String SERVICE_NAME = "heartbeat.HeartBeat";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<heartbeat.Heartbeat.Counter,
      heartbeat.Heartbeat.Counter> getBeatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Beats",
      requestType = heartbeat.Heartbeat.Counter.class,
      responseType = heartbeat.Heartbeat.Counter.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<heartbeat.Heartbeat.Counter,
      heartbeat.Heartbeat.Counter> getBeatsMethod() {
    io.grpc.MethodDescriptor<heartbeat.Heartbeat.Counter, heartbeat.Heartbeat.Counter> getBeatsMethod;
    if ((getBeatsMethod = HeartBeatGrpc.getBeatsMethod) == null) {
      synchronized (HeartBeatGrpc.class) {
        if ((getBeatsMethod = HeartBeatGrpc.getBeatsMethod) == null) {
          HeartBeatGrpc.getBeatsMethod = getBeatsMethod =
              io.grpc.MethodDescriptor.<heartbeat.Heartbeat.Counter, heartbeat.Heartbeat.Counter>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Beats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  heartbeat.Heartbeat.Counter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  heartbeat.Heartbeat.Counter.getDefaultInstance()))
              .setSchemaDescriptor(new HeartBeatMethodDescriptorSupplier("Beats"))
              .build();
        }
      }
    }
    return getBeatsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HeartBeatStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HeartBeatStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HeartBeatStub>() {
        @java.lang.Override
        public HeartBeatStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HeartBeatStub(channel, callOptions);
        }
      };
    return HeartBeatStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HeartBeatBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HeartBeatBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HeartBeatBlockingStub>() {
        @java.lang.Override
        public HeartBeatBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HeartBeatBlockingStub(channel, callOptions);
        }
      };
    return HeartBeatBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HeartBeatFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HeartBeatFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HeartBeatFutureStub>() {
        @java.lang.Override
        public HeartBeatFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HeartBeatFutureStub(channel, callOptions);
        }
      };
    return HeartBeatFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HeartBeatImplBase implements io.grpc.BindableService {

    /**
     */
    public void beats(heartbeat.Heartbeat.Counter request,
        io.grpc.stub.StreamObserver<heartbeat.Heartbeat.Counter> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBeatsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBeatsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                heartbeat.Heartbeat.Counter,
                heartbeat.Heartbeat.Counter>(
                  this, METHODID_BEATS)))
          .build();
    }
  }

  /**
   */
  public static final class HeartBeatStub extends io.grpc.stub.AbstractAsyncStub<HeartBeatStub> {
    private HeartBeatStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeartBeatStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HeartBeatStub(channel, callOptions);
    }

    /**
     */
    public void beats(heartbeat.Heartbeat.Counter request,
        io.grpc.stub.StreamObserver<heartbeat.Heartbeat.Counter> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getBeatsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HeartBeatBlockingStub extends io.grpc.stub.AbstractBlockingStub<HeartBeatBlockingStub> {
    private HeartBeatBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeartBeatBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HeartBeatBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<heartbeat.Heartbeat.Counter> beats(
        heartbeat.Heartbeat.Counter request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getBeatsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HeartBeatFutureStub extends io.grpc.stub.AbstractFutureStub<HeartBeatFutureStub> {
    private HeartBeatFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeartBeatFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HeartBeatFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_BEATS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HeartBeatImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HeartBeatImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BEATS:
          serviceImpl.beats((heartbeat.Heartbeat.Counter) request,
              (io.grpc.stub.StreamObserver<heartbeat.Heartbeat.Counter>) responseObserver);
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

  private static abstract class HeartBeatBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HeartBeatBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return heartbeat.Heartbeat.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HeartBeat");
    }
  }

  private static final class HeartBeatFileDescriptorSupplier
      extends HeartBeatBaseDescriptorSupplier {
    HeartBeatFileDescriptorSupplier() {}
  }

  private static final class HeartBeatMethodDescriptorSupplier
      extends HeartBeatBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HeartBeatMethodDescriptorSupplier(String methodName) {
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
      synchronized (HeartBeatGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HeartBeatFileDescriptorSupplier())
              .addMethod(getBeatsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
