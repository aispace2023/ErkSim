// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ErkApiMsg.proto

// Protobuf Java Version: 3.25.0
package com.erksystem.protobuf.api;

/**
 * Protobuf type {@code PhysioEmoRecogRQ_m}
 */
public final class PhysioEmoRecogRQ_m extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PhysioEmoRecogRQ_m)
    PhysioEmoRecogRQ_mOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PhysioEmoRecogRQ_m.newBuilder() to construct.
  private PhysioEmoRecogRQ_m(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PhysioEmoRecogRQ_m() {
    msgDataFrame_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PhysioEmoRecogRQ_m();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.erksystem.protobuf.api.ErkApiMsgOuterClass.internal_static_PhysioEmoRecogRQ_m_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.erksystem.protobuf.api.ErkApiMsgOuterClass.internal_static_PhysioEmoRecogRQ_m_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.erksystem.protobuf.api.PhysioEmoRecogRQ_m.class, com.erksystem.protobuf.api.PhysioEmoRecogRQ_m.Builder.class);
  }

  private int bitField0_;
  public static final int ERKMSGDATAHEAD_FIELD_NUMBER = 1;
  private com.erksystem.protobuf.api.ErkMsgDataHeader erkMsgDataHead_;
  /**
   * <code>.ErkMsgDataHeader ErkMsgDataHead = 1;</code>
   * @return Whether the erkMsgDataHead field is set.
   */
  @java.lang.Override
  public boolean hasErkMsgDataHead() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.ErkMsgDataHeader ErkMsgDataHead = 1;</code>
   * @return The erkMsgDataHead.
   */
  @java.lang.Override
  public com.erksystem.protobuf.api.ErkMsgDataHeader getErkMsgDataHead() {
    return erkMsgDataHead_ == null ? com.erksystem.protobuf.api.ErkMsgDataHeader.getDefaultInstance() : erkMsgDataHead_;
  }
  /**
   * <code>.ErkMsgDataHeader ErkMsgDataHead = 1;</code>
   */
  @java.lang.Override
  public com.erksystem.protobuf.api.ErkMsgDataHeaderOrBuilder getErkMsgDataHeadOrBuilder() {
    return erkMsgDataHead_ == null ? com.erksystem.protobuf.api.ErkMsgDataHeader.getDefaultInstance() : erkMsgDataHead_;
  }

  public static final int DATATIMESTAMP_FIELD_NUMBER = 2;
  private long dataTimeStamp_ = 0L;
  /**
   * <code>int64 DataTimeStamp = 2;</code>
   * @return The dataTimeStamp.
   */
  @java.lang.Override
  public long getDataTimeStamp() {
    return dataTimeStamp_;
  }

  public static final int MSGDATALENGTH_FIELD_NUMBER = 3;
  private int msgDataLength_ = 0;
  /**
   * <code>int32 MsgDataLength = 3;</code>
   * @return The msgDataLength.
   */
  @java.lang.Override
  public int getMsgDataLength() {
    return msgDataLength_;
  }

  public static final int MSGDATAFRAME_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString msgDataFrame_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes MsgDataFrame = 4;</code>
   * @return The msgDataFrame.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMsgDataFrame() {
    return msgDataFrame_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getErkMsgDataHead());
    }
    if (dataTimeStamp_ != 0L) {
      output.writeInt64(2, dataTimeStamp_);
    }
    if (msgDataLength_ != 0) {
      output.writeInt32(3, msgDataLength_);
    }
    if (!msgDataFrame_.isEmpty()) {
      output.writeBytes(4, msgDataFrame_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getErkMsgDataHead());
    }
    if (dataTimeStamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, dataTimeStamp_);
    }
    if (msgDataLength_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, msgDataLength_);
    }
    if (!msgDataFrame_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, msgDataFrame_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.erksystem.protobuf.api.PhysioEmoRecogRQ_m)) {
      return super.equals(obj);
    }
    com.erksystem.protobuf.api.PhysioEmoRecogRQ_m other = (com.erksystem.protobuf.api.PhysioEmoRecogRQ_m) obj;

    if (hasErkMsgDataHead() != other.hasErkMsgDataHead()) return false;
    if (hasErkMsgDataHead()) {
      if (!getErkMsgDataHead()
          .equals(other.getErkMsgDataHead())) return false;
    }
    if (getDataTimeStamp()
        != other.getDataTimeStamp()) return false;
    if (getMsgDataLength()
        != other.getMsgDataLength()) return false;
    if (!getMsgDataFrame()
        .equals(other.getMsgDataFrame())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasErkMsgDataHead()) {
      hash = (37 * hash) + ERKMSGDATAHEAD_FIELD_NUMBER;
      hash = (53 * hash) + getErkMsgDataHead().hashCode();
    }
    hash = (37 * hash) + DATATIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDataTimeStamp());
    hash = (37 * hash) + MSGDATALENGTH_FIELD_NUMBER;
    hash = (53 * hash) + getMsgDataLength();
    hash = (37 * hash) + MSGDATAFRAME_FIELD_NUMBER;
    hash = (53 * hash) + getMsgDataFrame().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.erksystem.protobuf.api.PhysioEmoRecogRQ_m parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.erksystem.protobuf.api.PhysioEmoRecogRQ_m parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.erksystem.protobuf.api.PhysioEmoRecogRQ_m parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.erksystem.protobuf.api.PhysioEmoRecogRQ_m parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.erksystem.protobuf.api.PhysioEmoRecogRQ_m parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.erksystem.protobuf.api.PhysioEmoRecogRQ_m parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.erksystem.protobuf.api.PhysioEmoRecogRQ_m parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.erksystem.protobuf.api.PhysioEmoRecogRQ_m parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.erksystem.protobuf.api.PhysioEmoRecogRQ_m parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.erksystem.protobuf.api.PhysioEmoRecogRQ_m parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.erksystem.protobuf.api.PhysioEmoRecogRQ_m parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.erksystem.protobuf.api.PhysioEmoRecogRQ_m parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.erksystem.protobuf.api.PhysioEmoRecogRQ_m prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code PhysioEmoRecogRQ_m}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PhysioEmoRecogRQ_m)
      com.erksystem.protobuf.api.PhysioEmoRecogRQ_mOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.erksystem.protobuf.api.ErkApiMsgOuterClass.internal_static_PhysioEmoRecogRQ_m_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.erksystem.protobuf.api.ErkApiMsgOuterClass.internal_static_PhysioEmoRecogRQ_m_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.erksystem.protobuf.api.PhysioEmoRecogRQ_m.class, com.erksystem.protobuf.api.PhysioEmoRecogRQ_m.Builder.class);
    }

    // Construct using com.erksystem.protobuf.api.PhysioEmoRecogRQ_m.newBuilder()
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
        getErkMsgDataHeadFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      erkMsgDataHead_ = null;
      if (erkMsgDataHeadBuilder_ != null) {
        erkMsgDataHeadBuilder_.dispose();
        erkMsgDataHeadBuilder_ = null;
      }
      dataTimeStamp_ = 0L;
      msgDataLength_ = 0;
      msgDataFrame_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.erksystem.protobuf.api.ErkApiMsgOuterClass.internal_static_PhysioEmoRecogRQ_m_descriptor;
    }

    @java.lang.Override
    public com.erksystem.protobuf.api.PhysioEmoRecogRQ_m getDefaultInstanceForType() {
      return com.erksystem.protobuf.api.PhysioEmoRecogRQ_m.getDefaultInstance();
    }

    @java.lang.Override
    public com.erksystem.protobuf.api.PhysioEmoRecogRQ_m build() {
      com.erksystem.protobuf.api.PhysioEmoRecogRQ_m result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.erksystem.protobuf.api.PhysioEmoRecogRQ_m buildPartial() {
      com.erksystem.protobuf.api.PhysioEmoRecogRQ_m result = new com.erksystem.protobuf.api.PhysioEmoRecogRQ_m(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.erksystem.protobuf.api.PhysioEmoRecogRQ_m result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.erkMsgDataHead_ = erkMsgDataHeadBuilder_ == null
            ? erkMsgDataHead_
            : erkMsgDataHeadBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dataTimeStamp_ = dataTimeStamp_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.msgDataLength_ = msgDataLength_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.msgDataFrame_ = msgDataFrame_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.erksystem.protobuf.api.PhysioEmoRecogRQ_m) {
        return mergeFrom((com.erksystem.protobuf.api.PhysioEmoRecogRQ_m)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.erksystem.protobuf.api.PhysioEmoRecogRQ_m other) {
      if (other == com.erksystem.protobuf.api.PhysioEmoRecogRQ_m.getDefaultInstance()) return this;
      if (other.hasErkMsgDataHead()) {
        mergeErkMsgDataHead(other.getErkMsgDataHead());
      }
      if (other.getDataTimeStamp() != 0L) {
        setDataTimeStamp(other.getDataTimeStamp());
      }
      if (other.getMsgDataLength() != 0) {
        setMsgDataLength(other.getMsgDataLength());
      }
      if (other.getMsgDataFrame() != com.google.protobuf.ByteString.EMPTY) {
        setMsgDataFrame(other.getMsgDataFrame());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getErkMsgDataHeadFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              dataTimeStamp_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              msgDataLength_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              msgDataFrame_ = input.readBytes();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.erksystem.protobuf.api.ErkMsgDataHeader erkMsgDataHead_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.erksystem.protobuf.api.ErkMsgDataHeader, com.erksystem.protobuf.api.ErkMsgDataHeader.Builder, com.erksystem.protobuf.api.ErkMsgDataHeaderOrBuilder> erkMsgDataHeadBuilder_;
    /**
     * <code>.ErkMsgDataHeader ErkMsgDataHead = 1;</code>
     * @return Whether the erkMsgDataHead field is set.
     */
    public boolean hasErkMsgDataHead() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.ErkMsgDataHeader ErkMsgDataHead = 1;</code>
     * @return The erkMsgDataHead.
     */
    public com.erksystem.protobuf.api.ErkMsgDataHeader getErkMsgDataHead() {
      if (erkMsgDataHeadBuilder_ == null) {
        return erkMsgDataHead_ == null ? com.erksystem.protobuf.api.ErkMsgDataHeader.getDefaultInstance() : erkMsgDataHead_;
      } else {
        return erkMsgDataHeadBuilder_.getMessage();
      }
    }
    /**
     * <code>.ErkMsgDataHeader ErkMsgDataHead = 1;</code>
     */
    public Builder setErkMsgDataHead(com.erksystem.protobuf.api.ErkMsgDataHeader value) {
      if (erkMsgDataHeadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        erkMsgDataHead_ = value;
      } else {
        erkMsgDataHeadBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ErkMsgDataHeader ErkMsgDataHead = 1;</code>
     */
    public Builder setErkMsgDataHead(
        com.erksystem.protobuf.api.ErkMsgDataHeader.Builder builderForValue) {
      if (erkMsgDataHeadBuilder_ == null) {
        erkMsgDataHead_ = builderForValue.build();
      } else {
        erkMsgDataHeadBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ErkMsgDataHeader ErkMsgDataHead = 1;</code>
     */
    public Builder mergeErkMsgDataHead(com.erksystem.protobuf.api.ErkMsgDataHeader value) {
      if (erkMsgDataHeadBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          erkMsgDataHead_ != null &&
          erkMsgDataHead_ != com.erksystem.protobuf.api.ErkMsgDataHeader.getDefaultInstance()) {
          getErkMsgDataHeadBuilder().mergeFrom(value);
        } else {
          erkMsgDataHead_ = value;
        }
      } else {
        erkMsgDataHeadBuilder_.mergeFrom(value);
      }
      if (erkMsgDataHead_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.ErkMsgDataHeader ErkMsgDataHead = 1;</code>
     */
    public Builder clearErkMsgDataHead() {
      bitField0_ = (bitField0_ & ~0x00000001);
      erkMsgDataHead_ = null;
      if (erkMsgDataHeadBuilder_ != null) {
        erkMsgDataHeadBuilder_.dispose();
        erkMsgDataHeadBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ErkMsgDataHeader ErkMsgDataHead = 1;</code>
     */
    public com.erksystem.protobuf.api.ErkMsgDataHeader.Builder getErkMsgDataHeadBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getErkMsgDataHeadFieldBuilder().getBuilder();
    }
    /**
     * <code>.ErkMsgDataHeader ErkMsgDataHead = 1;</code>
     */
    public com.erksystem.protobuf.api.ErkMsgDataHeaderOrBuilder getErkMsgDataHeadOrBuilder() {
      if (erkMsgDataHeadBuilder_ != null) {
        return erkMsgDataHeadBuilder_.getMessageOrBuilder();
      } else {
        return erkMsgDataHead_ == null ?
            com.erksystem.protobuf.api.ErkMsgDataHeader.getDefaultInstance() : erkMsgDataHead_;
      }
    }
    /**
     * <code>.ErkMsgDataHeader ErkMsgDataHead = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.erksystem.protobuf.api.ErkMsgDataHeader, com.erksystem.protobuf.api.ErkMsgDataHeader.Builder, com.erksystem.protobuf.api.ErkMsgDataHeaderOrBuilder> 
        getErkMsgDataHeadFieldBuilder() {
      if (erkMsgDataHeadBuilder_ == null) {
        erkMsgDataHeadBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.erksystem.protobuf.api.ErkMsgDataHeader, com.erksystem.protobuf.api.ErkMsgDataHeader.Builder, com.erksystem.protobuf.api.ErkMsgDataHeaderOrBuilder>(
                getErkMsgDataHead(),
                getParentForChildren(),
                isClean());
        erkMsgDataHead_ = null;
      }
      return erkMsgDataHeadBuilder_;
    }

    private long dataTimeStamp_ ;
    /**
     * <code>int64 DataTimeStamp = 2;</code>
     * @return The dataTimeStamp.
     */
    @java.lang.Override
    public long getDataTimeStamp() {
      return dataTimeStamp_;
    }
    /**
     * <code>int64 DataTimeStamp = 2;</code>
     * @param value The dataTimeStamp to set.
     * @return This builder for chaining.
     */
    public Builder setDataTimeStamp(long value) {

      dataTimeStamp_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 DataTimeStamp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataTimeStamp() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dataTimeStamp_ = 0L;
      onChanged();
      return this;
    }

    private int msgDataLength_ ;
    /**
     * <code>int32 MsgDataLength = 3;</code>
     * @return The msgDataLength.
     */
    @java.lang.Override
    public int getMsgDataLength() {
      return msgDataLength_;
    }
    /**
     * <code>int32 MsgDataLength = 3;</code>
     * @param value The msgDataLength to set.
     * @return This builder for chaining.
     */
    public Builder setMsgDataLength(int value) {

      msgDataLength_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int32 MsgDataLength = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsgDataLength() {
      bitField0_ = (bitField0_ & ~0x00000004);
      msgDataLength_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString msgDataFrame_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes MsgDataFrame = 4;</code>
     * @return The msgDataFrame.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMsgDataFrame() {
      return msgDataFrame_;
    }
    /**
     * <code>bytes MsgDataFrame = 4;</code>
     * @param value The msgDataFrame to set.
     * @return This builder for chaining.
     */
    public Builder setMsgDataFrame(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      msgDataFrame_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bytes MsgDataFrame = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsgDataFrame() {
      bitField0_ = (bitField0_ & ~0x00000008);
      msgDataFrame_ = getDefaultInstance().getMsgDataFrame();
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:PhysioEmoRecogRQ_m)
  }

  // @@protoc_insertion_point(class_scope:PhysioEmoRecogRQ_m)
  private static final com.erksystem.protobuf.api.PhysioEmoRecogRQ_m DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.erksystem.protobuf.api.PhysioEmoRecogRQ_m();
  }

  public static com.erksystem.protobuf.api.PhysioEmoRecogRQ_m getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PhysioEmoRecogRQ_m>
      PARSER = new com.google.protobuf.AbstractParser<PhysioEmoRecogRQ_m>() {
    @java.lang.Override
    public PhysioEmoRecogRQ_m parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<PhysioEmoRecogRQ_m> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PhysioEmoRecogRQ_m> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.erksystem.protobuf.api.PhysioEmoRecogRQ_m getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

