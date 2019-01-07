// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: job_master.proto

package alluxio.grpc;

/**
 * Protobuf type {@code alluxio.grpc.RunTaskCommand}
 */
public  final class RunTaskCommand extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.RunTaskCommand)
    RunTaskCommandOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RunTaskCommand.newBuilder() to construct.
  private RunTaskCommand(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RunTaskCommand() {
    jobId_ = 0L;
    taskId_ = 0;
    jobConfig_ = com.google.protobuf.ByteString.EMPTY;
    taskArgs_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RunTaskCommand(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            bitField0_ |= 0x00000001;
            jobId_ = input.readInt64();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            taskId_ = input.readInt32();
            break;
          }
          case 26: {
            bitField0_ |= 0x00000004;
            jobConfig_ = input.readBytes();
            break;
          }
          case 34: {
            bitField0_ |= 0x00000008;
            taskArgs_ = input.readBytes();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_RunTaskCommand_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_RunTaskCommand_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.RunTaskCommand.class, alluxio.grpc.RunTaskCommand.Builder.class);
  }

  private int bitField0_;
  public static final int JOBID_FIELD_NUMBER = 1;
  private long jobId_;
  /**
   * <code>optional int64 jobId = 1;</code>
   */
  public boolean hasJobId() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int64 jobId = 1;</code>
   */
  public long getJobId() {
    return jobId_;
  }

  public static final int TASKID_FIELD_NUMBER = 2;
  private int taskId_;
  /**
   * <code>optional int32 taskId = 2;</code>
   */
  public boolean hasTaskId() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int32 taskId = 2;</code>
   */
  public int getTaskId() {
    return taskId_;
  }

  public static final int JOBCONFIG_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString jobConfig_;
  /**
   * <code>optional bytes jobConfig = 3;</code>
   */
  public boolean hasJobConfig() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional bytes jobConfig = 3;</code>
   */
  public com.google.protobuf.ByteString getJobConfig() {
    return jobConfig_;
  }

  public static final int TASKARGS_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString taskArgs_;
  /**
   * <code>optional bytes taskArgs = 4;</code>
   */
  public boolean hasTaskArgs() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional bytes taskArgs = 4;</code>
   */
  public com.google.protobuf.ByteString getTaskArgs() {
    return taskArgs_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt64(1, jobId_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, taskId_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBytes(3, jobConfig_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeBytes(4, taskArgs_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, jobId_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, taskId_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, jobConfig_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, taskArgs_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof alluxio.grpc.RunTaskCommand)) {
      return super.equals(obj);
    }
    alluxio.grpc.RunTaskCommand other = (alluxio.grpc.RunTaskCommand) obj;

    boolean result = true;
    result = result && (hasJobId() == other.hasJobId());
    if (hasJobId()) {
      result = result && (getJobId()
          == other.getJobId());
    }
    result = result && (hasTaskId() == other.hasTaskId());
    if (hasTaskId()) {
      result = result && (getTaskId()
          == other.getTaskId());
    }
    result = result && (hasJobConfig() == other.hasJobConfig());
    if (hasJobConfig()) {
      result = result && getJobConfig()
          .equals(other.getJobConfig());
    }
    result = result && (hasTaskArgs() == other.hasTaskArgs());
    if (hasTaskArgs()) {
      result = result && getTaskArgs()
          .equals(other.getTaskArgs());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasJobId()) {
      hash = (37 * hash) + JOBID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getJobId());
    }
    if (hasTaskId()) {
      hash = (37 * hash) + TASKID_FIELD_NUMBER;
      hash = (53 * hash) + getTaskId();
    }
    if (hasJobConfig()) {
      hash = (37 * hash) + JOBCONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getJobConfig().hashCode();
    }
    if (hasTaskArgs()) {
      hash = (37 * hash) + TASKARGS_FIELD_NUMBER;
      hash = (53 * hash) + getTaskArgs().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.RunTaskCommand parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.RunTaskCommand parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.RunTaskCommand parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.RunTaskCommand parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.RunTaskCommand parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.RunTaskCommand parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.RunTaskCommand parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.RunTaskCommand parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.RunTaskCommand parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.RunTaskCommand parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.RunTaskCommand parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.RunTaskCommand parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(alluxio.grpc.RunTaskCommand prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code alluxio.grpc.RunTaskCommand}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.RunTaskCommand)
      alluxio.grpc.RunTaskCommandOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_RunTaskCommand_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_RunTaskCommand_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.RunTaskCommand.class, alluxio.grpc.RunTaskCommand.Builder.class);
    }

    // Construct using alluxio.grpc.RunTaskCommand.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      jobId_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      taskId_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      jobConfig_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      taskArgs_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_RunTaskCommand_descriptor;
    }

    public alluxio.grpc.RunTaskCommand getDefaultInstanceForType() {
      return alluxio.grpc.RunTaskCommand.getDefaultInstance();
    }

    public alluxio.grpc.RunTaskCommand build() {
      alluxio.grpc.RunTaskCommand result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public alluxio.grpc.RunTaskCommand buildPartial() {
      alluxio.grpc.RunTaskCommand result = new alluxio.grpc.RunTaskCommand(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.jobId_ = jobId_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.taskId_ = taskId_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.jobConfig_ = jobConfig_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      result.taskArgs_ = taskArgs_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof alluxio.grpc.RunTaskCommand) {
        return mergeFrom((alluxio.grpc.RunTaskCommand)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.RunTaskCommand other) {
      if (other == alluxio.grpc.RunTaskCommand.getDefaultInstance()) return this;
      if (other.hasJobId()) {
        setJobId(other.getJobId());
      }
      if (other.hasTaskId()) {
        setTaskId(other.getTaskId());
      }
      if (other.hasJobConfig()) {
        setJobConfig(other.getJobConfig());
      }
      if (other.hasTaskArgs()) {
        setTaskArgs(other.getTaskArgs());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      alluxio.grpc.RunTaskCommand parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.RunTaskCommand) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long jobId_ ;
    /**
     * <code>optional int64 jobId = 1;</code>
     */
    public boolean hasJobId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int64 jobId = 1;</code>
     */
    public long getJobId() {
      return jobId_;
    }
    /**
     * <code>optional int64 jobId = 1;</code>
     */
    public Builder setJobId(long value) {
      bitField0_ |= 0x00000001;
      jobId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 jobId = 1;</code>
     */
    public Builder clearJobId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      jobId_ = 0L;
      onChanged();
      return this;
    }

    private int taskId_ ;
    /**
     * <code>optional int32 taskId = 2;</code>
     */
    public boolean hasTaskId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 taskId = 2;</code>
     */
    public int getTaskId() {
      return taskId_;
    }
    /**
     * <code>optional int32 taskId = 2;</code>
     */
    public Builder setTaskId(int value) {
      bitField0_ |= 0x00000002;
      taskId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 taskId = 2;</code>
     */
    public Builder clearTaskId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      taskId_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString jobConfig_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes jobConfig = 3;</code>
     */
    public boolean hasJobConfig() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bytes jobConfig = 3;</code>
     */
    public com.google.protobuf.ByteString getJobConfig() {
      return jobConfig_;
    }
    /**
     * <code>optional bytes jobConfig = 3;</code>
     */
    public Builder setJobConfig(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      jobConfig_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes jobConfig = 3;</code>
     */
    public Builder clearJobConfig() {
      bitField0_ = (bitField0_ & ~0x00000004);
      jobConfig_ = getDefaultInstance().getJobConfig();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString taskArgs_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes taskArgs = 4;</code>
     */
    public boolean hasTaskArgs() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional bytes taskArgs = 4;</code>
     */
    public com.google.protobuf.ByteString getTaskArgs() {
      return taskArgs_;
    }
    /**
     * <code>optional bytes taskArgs = 4;</code>
     */
    public Builder setTaskArgs(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
      taskArgs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes taskArgs = 4;</code>
     */
    public Builder clearTaskArgs() {
      bitField0_ = (bitField0_ & ~0x00000008);
      taskArgs_ = getDefaultInstance().getTaskArgs();
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.RunTaskCommand)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.RunTaskCommand)
  private static final alluxio.grpc.RunTaskCommand DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.RunTaskCommand();
  }

  public static alluxio.grpc.RunTaskCommand getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<RunTaskCommand>
      PARSER = new com.google.protobuf.AbstractParser<RunTaskCommand>() {
    public RunTaskCommand parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RunTaskCommand(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RunTaskCommand> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RunTaskCommand> getParserForType() {
    return PARSER;
  }

  public alluxio.grpc.RunTaskCommand getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
