package todoapp;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: todo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TodoGrpc {

  private TodoGrpc() {}

  public static final String SERVICE_NAME = "todoapp.Todo";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<todoapp.TodoOuterClass.TodoItem,
      todoapp.TodoOuterClass.TodoItem> getAddTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addTodo",
      requestType = todoapp.TodoOuterClass.TodoItem.class,
      responseType = todoapp.TodoOuterClass.TodoItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<todoapp.TodoOuterClass.TodoItem,
      todoapp.TodoOuterClass.TodoItem> getAddTodoMethod() {
    io.grpc.MethodDescriptor<todoapp.TodoOuterClass.TodoItem, todoapp.TodoOuterClass.TodoItem> getAddTodoMethod;
    if ((getAddTodoMethod = TodoGrpc.getAddTodoMethod) == null) {
      synchronized (TodoGrpc.class) {
        if ((getAddTodoMethod = TodoGrpc.getAddTodoMethod) == null) {
          TodoGrpc.getAddTodoMethod = getAddTodoMethod =
              io.grpc.MethodDescriptor.<todoapp.TodoOuterClass.TodoItem, todoapp.TodoOuterClass.TodoItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  todoapp.TodoOuterClass.TodoItem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  todoapp.TodoOuterClass.TodoItem.getDefaultInstance()))
              .setSchemaDescriptor(new TodoMethodDescriptorSupplier("addTodo"))
              .build();
        }
      }
    }
    return getAddTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<todoapp.TodoOuterClass.Void,
      todoapp.TodoOuterClass.TodoItems> getGetTodosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTodos",
      requestType = todoapp.TodoOuterClass.Void.class,
      responseType = todoapp.TodoOuterClass.TodoItems.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<todoapp.TodoOuterClass.Void,
      todoapp.TodoOuterClass.TodoItems> getGetTodosMethod() {
    io.grpc.MethodDescriptor<todoapp.TodoOuterClass.Void, todoapp.TodoOuterClass.TodoItems> getGetTodosMethod;
    if ((getGetTodosMethod = TodoGrpc.getGetTodosMethod) == null) {
      synchronized (TodoGrpc.class) {
        if ((getGetTodosMethod = TodoGrpc.getGetTodosMethod) == null) {
          TodoGrpc.getGetTodosMethod = getGetTodosMethod =
              io.grpc.MethodDescriptor.<todoapp.TodoOuterClass.Void, todoapp.TodoOuterClass.TodoItems>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTodos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  todoapp.TodoOuterClass.Void.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  todoapp.TodoOuterClass.TodoItems.getDefaultInstance()))
              .setSchemaDescriptor(new TodoMethodDescriptorSupplier("getTodos"))
              .build();
        }
      }
    }
    return getGetTodosMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TodoStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TodoStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TodoStub>() {
        @java.lang.Override
        public TodoStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TodoStub(channel, callOptions);
        }
      };
    return TodoStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TodoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TodoBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TodoBlockingStub>() {
        @java.lang.Override
        public TodoBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TodoBlockingStub(channel, callOptions);
        }
      };
    return TodoBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TodoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TodoFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TodoFutureStub>() {
        @java.lang.Override
        public TodoFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TodoFutureStub(channel, callOptions);
        }
      };
    return TodoFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TodoImplBase implements io.grpc.BindableService {

    /**
     */
    public void addTodo(todoapp.TodoOuterClass.TodoItem request,
        io.grpc.stub.StreamObserver<todoapp.TodoOuterClass.TodoItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddTodoMethod(), responseObserver);
    }

    /**
     */
    public void getTodos(todoapp.TodoOuterClass.Void request,
        io.grpc.stub.StreamObserver<todoapp.TodoOuterClass.TodoItems> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTodosMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddTodoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                todoapp.TodoOuterClass.TodoItem,
                todoapp.TodoOuterClass.TodoItem>(
                  this, METHODID_ADD_TODO)))
          .addMethod(
            getGetTodosMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                todoapp.TodoOuterClass.Void,
                todoapp.TodoOuterClass.TodoItems>(
                  this, METHODID_GET_TODOS)))
          .build();
    }
  }

  /**
   */
  public static final class TodoStub extends io.grpc.stub.AbstractAsyncStub<TodoStub> {
    private TodoStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TodoStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TodoStub(channel, callOptions);
    }

    /**
     */
    public void addTodo(todoapp.TodoOuterClass.TodoItem request,
        io.grpc.stub.StreamObserver<todoapp.TodoOuterClass.TodoItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTodos(todoapp.TodoOuterClass.Void request,
        io.grpc.stub.StreamObserver<todoapp.TodoOuterClass.TodoItems> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTodosMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TodoBlockingStub extends io.grpc.stub.AbstractBlockingStub<TodoBlockingStub> {
    private TodoBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TodoBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TodoBlockingStub(channel, callOptions);
    }

    /**
     */
    public todoapp.TodoOuterClass.TodoItem addTodo(todoapp.TodoOuterClass.TodoItem request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddTodoMethod(), getCallOptions(), request);
    }

    /**
     */
    public todoapp.TodoOuterClass.TodoItems getTodos(todoapp.TodoOuterClass.Void request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTodosMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TodoFutureStub extends io.grpc.stub.AbstractFutureStub<TodoFutureStub> {
    private TodoFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TodoFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TodoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<todoapp.TodoOuterClass.TodoItem> addTodo(
        todoapp.TodoOuterClass.TodoItem request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddTodoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<todoapp.TodoOuterClass.TodoItems> getTodos(
        todoapp.TodoOuterClass.Void request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTodosMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_TODO = 0;
  private static final int METHODID_GET_TODOS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TodoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TodoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_TODO:
          serviceImpl.addTodo((todoapp.TodoOuterClass.TodoItem) request,
              (io.grpc.stub.StreamObserver<todoapp.TodoOuterClass.TodoItem>) responseObserver);
          break;
        case METHODID_GET_TODOS:
          serviceImpl.getTodos((todoapp.TodoOuterClass.Void) request,
              (io.grpc.stub.StreamObserver<todoapp.TodoOuterClass.TodoItems>) responseObserver);
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

  private static abstract class TodoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TodoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return todoapp.TodoOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Todo");
    }
  }

  private static final class TodoFileDescriptorSupplier
      extends TodoBaseDescriptorSupplier {
    TodoFileDescriptorSupplier() {}
  }

  private static final class TodoMethodDescriptorSupplier
      extends TodoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TodoMethodDescriptorSupplier(String methodName) {
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
      synchronized (TodoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TodoFileDescriptorSupplier())
              .addMethod(getAddTodoMethod())
              .addMethod(getGetTodosMethod())
              .build();
        }
      }
    }
    return result;
  }
}
