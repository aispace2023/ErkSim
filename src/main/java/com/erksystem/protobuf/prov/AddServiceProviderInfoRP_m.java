// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ErkProvMsg.proto

// Protobuf Java Version: 3.25.0
package com.erksystem.protobuf.prov;

/**
 * Protobuf type {@code AddServiceProviderInfoRP_m}
 */
public final class AddServiceProviderInfoRP_m extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AddServiceProviderInfoRP_m)
    AddServiceProviderInfoRP_mOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddServiceProviderInfoRP_m.newBuilder() to construct.
  private AddServiceProviderInfoRP_m(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddServiceProviderInfoRP_m() {
    orgName_ = "";
    resultType_ = 0;
    orgPwd_ = "";
    serviceDuration_ = "";
    serviceType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddServiceProviderInfoRP_m();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.erksystem.protobuf.prov.ErkProvMsg.internal_static_AddServiceProviderInfoRP_m_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.erksystem.protobuf.prov.ErkProvMsg.internal_static_AddServiceProviderInfoRP_m_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m.class, com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m.Builder.class);
  }

  public static final int ORGNAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orgName_ = "";
  /**
   * <code>string OrgName = 1;</code>
   * @return The orgName.
   */
  @java.lang.Override
  public java.lang.String getOrgName() {
    java.lang.Object ref = orgName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orgName_ = s;
      return s;
    }
  }
  /**
   * <code>string OrgName = 1;</code>
   * @return The bytes for orgName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrgNameBytes() {
    java.lang.Object ref = orgName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orgName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESULTTYPE_FIELD_NUMBER = 2;
  private int resultType_ = 0;
  /**
   * <code>.OrgProfileResult_e ResultType = 2;</code>
   * @return The enum numeric value on the wire for resultType.
   */
  @java.lang.Override public int getResultTypeValue() {
    return resultType_;
  }
  /**
   * <code>.OrgProfileResult_e ResultType = 2;</code>
   * @return The resultType.
   */
  @java.lang.Override public com.erksystem.protobuf.prov.OrgProfileResult_e getResultType() {
    com.erksystem.protobuf.prov.OrgProfileResult_e result = com.erksystem.protobuf.prov.OrgProfileResult_e.forNumber(resultType_);
    return result == null ? com.erksystem.protobuf.prov.OrgProfileResult_e.UNRECOGNIZED : result;
  }

  public static final int ORGID_FIELD_NUMBER = 3;
  private int orgId_ = 0;
  /**
   * <code>int32 OrgId = 3;</code>
   * @return The orgId.
   */
  @java.lang.Override
  public int getOrgId() {
    return orgId_;
  }

  public static final int ORGPWD_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orgPwd_ = "";
  /**
   * <code>string OrgPwd = 4;</code>
   * @return The orgPwd.
   */
  @java.lang.Override
  public java.lang.String getOrgPwd() {
    java.lang.Object ref = orgPwd_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orgPwd_ = s;
      return s;
    }
  }
  /**
   * <code>string OrgPwd = 4;</code>
   * @return The bytes for orgPwd.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrgPwdBytes() {
    java.lang.Object ref = orgPwd_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orgPwd_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICEDURATION_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object serviceDuration_ = "";
  /**
   * <code>string ServiceDuration = 5;</code>
   * @return The serviceDuration.
   */
  @java.lang.Override
  public java.lang.String getServiceDuration() {
    java.lang.Object ref = serviceDuration_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceDuration_ = s;
      return s;
    }
  }
  /**
   * <code>string ServiceDuration = 5;</code>
   * @return The bytes for serviceDuration.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServiceDurationBytes() {
    java.lang.Object ref = serviceDuration_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceDuration_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERNUMBER_FIELD_NUMBER = 6;
  private int userNumber_ = 0;
  /**
   * <code>int32 UserNumber = 6;</code>
   * @return The userNumber.
   */
  @java.lang.Override
  public int getUserNumber() {
    return userNumber_;
  }

  public static final int SERVICETYPE_FIELD_NUMBER = 7;
  private int serviceType_ = 0;
  /**
   * <code>.ServiceType_e ServiceType = 7;</code>
   * @return The enum numeric value on the wire for serviceType.
   */
  @java.lang.Override public int getServiceTypeValue() {
    return serviceType_;
  }
  /**
   * <code>.ServiceType_e ServiceType = 7;</code>
   * @return The serviceType.
   */
  @java.lang.Override public com.erksystem.protobuf.prov.ServiceType_e getServiceType() {
    com.erksystem.protobuf.prov.ServiceType_e result = com.erksystem.protobuf.prov.ServiceType_e.forNumber(serviceType_);
    return result == null ? com.erksystem.protobuf.prov.ServiceType_e.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, orgName_);
    }
    if (resultType_ != com.erksystem.protobuf.prov.OrgProfileResult_e.OrgProfileResult_unknown.getNumber()) {
      output.writeEnum(2, resultType_);
    }
    if (orgId_ != 0) {
      output.writeInt32(3, orgId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgPwd_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, orgPwd_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceDuration_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, serviceDuration_);
    }
    if (userNumber_ != 0) {
      output.writeInt32(6, userNumber_);
    }
    if (serviceType_ != com.erksystem.protobuf.prov.ServiceType_e.ServiceType_unknown.getNumber()) {
      output.writeEnum(7, serviceType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, orgName_);
    }
    if (resultType_ != com.erksystem.protobuf.prov.OrgProfileResult_e.OrgProfileResult_unknown.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, resultType_);
    }
    if (orgId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, orgId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgPwd_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, orgPwd_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceDuration_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, serviceDuration_);
    }
    if (userNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, userNumber_);
    }
    if (serviceType_ != com.erksystem.protobuf.prov.ServiceType_e.ServiceType_unknown.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(7, serviceType_);
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
    if (!(obj instanceof com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m)) {
      return super.equals(obj);
    }
    com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m other = (com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m) obj;

    if (!getOrgName()
        .equals(other.getOrgName())) return false;
    if (resultType_ != other.resultType_) return false;
    if (getOrgId()
        != other.getOrgId()) return false;
    if (!getOrgPwd()
        .equals(other.getOrgPwd())) return false;
    if (!getServiceDuration()
        .equals(other.getServiceDuration())) return false;
    if (getUserNumber()
        != other.getUserNumber()) return false;
    if (serviceType_ != other.serviceType_) return false;
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
    hash = (37 * hash) + ORGNAME_FIELD_NUMBER;
    hash = (53 * hash) + getOrgName().hashCode();
    hash = (37 * hash) + RESULTTYPE_FIELD_NUMBER;
    hash = (53 * hash) + resultType_;
    hash = (37 * hash) + ORGID_FIELD_NUMBER;
    hash = (53 * hash) + getOrgId();
    hash = (37 * hash) + ORGPWD_FIELD_NUMBER;
    hash = (53 * hash) + getOrgPwd().hashCode();
    hash = (37 * hash) + SERVICEDURATION_FIELD_NUMBER;
    hash = (53 * hash) + getServiceDuration().hashCode();
    hash = (37 * hash) + USERNUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getUserNumber();
    hash = (37 * hash) + SERVICETYPE_FIELD_NUMBER;
    hash = (53 * hash) + serviceType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m parseFrom(
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
  public static Builder newBuilder(com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m prototype) {
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
   * Protobuf type {@code AddServiceProviderInfoRP_m}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AddServiceProviderInfoRP_m)
      com.erksystem.protobuf.prov.AddServiceProviderInfoRP_mOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.erksystem.protobuf.prov.ErkProvMsg.internal_static_AddServiceProviderInfoRP_m_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.erksystem.protobuf.prov.ErkProvMsg.internal_static_AddServiceProviderInfoRP_m_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m.class, com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m.Builder.class);
    }

    // Construct using com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      orgName_ = "";
      resultType_ = 0;
      orgId_ = 0;
      orgPwd_ = "";
      serviceDuration_ = "";
      userNumber_ = 0;
      serviceType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.erksystem.protobuf.prov.ErkProvMsg.internal_static_AddServiceProviderInfoRP_m_descriptor;
    }

    @java.lang.Override
    public com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m getDefaultInstanceForType() {
      return com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m.getDefaultInstance();
    }

    @java.lang.Override
    public com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m build() {
      com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m buildPartial() {
      com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m result = new com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.orgName_ = orgName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.resultType_ = resultType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.orgId_ = orgId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.orgPwd_ = orgPwd_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.serviceDuration_ = serviceDuration_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.userNumber_ = userNumber_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.serviceType_ = serviceType_;
      }
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
      if (other instanceof com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m) {
        return mergeFrom((com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m other) {
      if (other == com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m.getDefaultInstance()) return this;
      if (!other.getOrgName().isEmpty()) {
        orgName_ = other.orgName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.resultType_ != 0) {
        setResultTypeValue(other.getResultTypeValue());
      }
      if (other.getOrgId() != 0) {
        setOrgId(other.getOrgId());
      }
      if (!other.getOrgPwd().isEmpty()) {
        orgPwd_ = other.orgPwd_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getServiceDuration().isEmpty()) {
        serviceDuration_ = other.serviceDuration_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (other.getUserNumber() != 0) {
        setUserNumber(other.getUserNumber());
      }
      if (other.serviceType_ != 0) {
        setServiceTypeValue(other.getServiceTypeValue());
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
              orgName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              resultType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              orgId_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              orgPwd_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              serviceDuration_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 48: {
              userNumber_ = input.readInt32();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            case 56: {
              serviceType_ = input.readEnum();
              bitField0_ |= 0x00000040;
              break;
            } // case 56
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

    private java.lang.Object orgName_ = "";
    /**
     * <code>string OrgName = 1;</code>
     * @return The orgName.
     */
    public java.lang.String getOrgName() {
      java.lang.Object ref = orgName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orgName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string OrgName = 1;</code>
     * @return The bytes for orgName.
     */
    public com.google.protobuf.ByteString
        getOrgNameBytes() {
      java.lang.Object ref = orgName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orgName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string OrgName = 1;</code>
     * @param value The orgName to set.
     * @return This builder for chaining.
     */
    public Builder setOrgName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      orgName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string OrgName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrgName() {
      orgName_ = getDefaultInstance().getOrgName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string OrgName = 1;</code>
     * @param value The bytes for orgName to set.
     * @return This builder for chaining.
     */
    public Builder setOrgNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      orgName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int resultType_ = 0;
    /**
     * <code>.OrgProfileResult_e ResultType = 2;</code>
     * @return The enum numeric value on the wire for resultType.
     */
    @java.lang.Override public int getResultTypeValue() {
      return resultType_;
    }
    /**
     * <code>.OrgProfileResult_e ResultType = 2;</code>
     * @param value The enum numeric value on the wire for resultType to set.
     * @return This builder for chaining.
     */
    public Builder setResultTypeValue(int value) {
      resultType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.OrgProfileResult_e ResultType = 2;</code>
     * @return The resultType.
     */
    @java.lang.Override
    public com.erksystem.protobuf.prov.OrgProfileResult_e getResultType() {
      com.erksystem.protobuf.prov.OrgProfileResult_e result = com.erksystem.protobuf.prov.OrgProfileResult_e.forNumber(resultType_);
      return result == null ? com.erksystem.protobuf.prov.OrgProfileResult_e.UNRECOGNIZED : result;
    }
    /**
     * <code>.OrgProfileResult_e ResultType = 2;</code>
     * @param value The resultType to set.
     * @return This builder for chaining.
     */
    public Builder setResultType(com.erksystem.protobuf.prov.OrgProfileResult_e value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      resultType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.OrgProfileResult_e ResultType = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearResultType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      resultType_ = 0;
      onChanged();
      return this;
    }

    private int orgId_ ;
    /**
     * <code>int32 OrgId = 3;</code>
     * @return The orgId.
     */
    @java.lang.Override
    public int getOrgId() {
      return orgId_;
    }
    /**
     * <code>int32 OrgId = 3;</code>
     * @param value The orgId to set.
     * @return This builder for chaining.
     */
    public Builder setOrgId(int value) {

      orgId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int32 OrgId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrgId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      orgId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object orgPwd_ = "";
    /**
     * <code>string OrgPwd = 4;</code>
     * @return The orgPwd.
     */
    public java.lang.String getOrgPwd() {
      java.lang.Object ref = orgPwd_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orgPwd_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string OrgPwd = 4;</code>
     * @return The bytes for orgPwd.
     */
    public com.google.protobuf.ByteString
        getOrgPwdBytes() {
      java.lang.Object ref = orgPwd_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orgPwd_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string OrgPwd = 4;</code>
     * @param value The orgPwd to set.
     * @return This builder for chaining.
     */
    public Builder setOrgPwd(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      orgPwd_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string OrgPwd = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrgPwd() {
      orgPwd_ = getDefaultInstance().getOrgPwd();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string OrgPwd = 4;</code>
     * @param value The bytes for orgPwd to set.
     * @return This builder for chaining.
     */
    public Builder setOrgPwdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      orgPwd_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object serviceDuration_ = "";
    /**
     * <code>string ServiceDuration = 5;</code>
     * @return The serviceDuration.
     */
    public java.lang.String getServiceDuration() {
      java.lang.Object ref = serviceDuration_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceDuration_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ServiceDuration = 5;</code>
     * @return The bytes for serviceDuration.
     */
    public com.google.protobuf.ByteString
        getServiceDurationBytes() {
      java.lang.Object ref = serviceDuration_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceDuration_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ServiceDuration = 5;</code>
     * @param value The serviceDuration to set.
     * @return This builder for chaining.
     */
    public Builder setServiceDuration(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      serviceDuration_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string ServiceDuration = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearServiceDuration() {
      serviceDuration_ = getDefaultInstance().getServiceDuration();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string ServiceDuration = 5;</code>
     * @param value The bytes for serviceDuration to set.
     * @return This builder for chaining.
     */
    public Builder setServiceDurationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      serviceDuration_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private int userNumber_ ;
    /**
     * <code>int32 UserNumber = 6;</code>
     * @return The userNumber.
     */
    @java.lang.Override
    public int getUserNumber() {
      return userNumber_;
    }
    /**
     * <code>int32 UserNumber = 6;</code>
     * @param value The userNumber to set.
     * @return This builder for chaining.
     */
    public Builder setUserNumber(int value) {

      userNumber_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>int32 UserNumber = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserNumber() {
      bitField0_ = (bitField0_ & ~0x00000020);
      userNumber_ = 0;
      onChanged();
      return this;
    }

    private int serviceType_ = 0;
    /**
     * <code>.ServiceType_e ServiceType = 7;</code>
     * @return The enum numeric value on the wire for serviceType.
     */
    @java.lang.Override public int getServiceTypeValue() {
      return serviceType_;
    }
    /**
     * <code>.ServiceType_e ServiceType = 7;</code>
     * @param value The enum numeric value on the wire for serviceType to set.
     * @return This builder for chaining.
     */
    public Builder setServiceTypeValue(int value) {
      serviceType_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <code>.ServiceType_e ServiceType = 7;</code>
     * @return The serviceType.
     */
    @java.lang.Override
    public com.erksystem.protobuf.prov.ServiceType_e getServiceType() {
      com.erksystem.protobuf.prov.ServiceType_e result = com.erksystem.protobuf.prov.ServiceType_e.forNumber(serviceType_);
      return result == null ? com.erksystem.protobuf.prov.ServiceType_e.UNRECOGNIZED : result;
    }
    /**
     * <code>.ServiceType_e ServiceType = 7;</code>
     * @param value The serviceType to set.
     * @return This builder for chaining.
     */
    public Builder setServiceType(com.erksystem.protobuf.prov.ServiceType_e value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000040;
      serviceType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.ServiceType_e ServiceType = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearServiceType() {
      bitField0_ = (bitField0_ & ~0x00000040);
      serviceType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:AddServiceProviderInfoRP_m)
  }

  // @@protoc_insertion_point(class_scope:AddServiceProviderInfoRP_m)
  private static final com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m();
  }

  public static com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddServiceProviderInfoRP_m>
      PARSER = new com.google.protobuf.AbstractParser<AddServiceProviderInfoRP_m>() {
    @java.lang.Override
    public AddServiceProviderInfoRP_m parsePartialFrom(
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

  public static com.google.protobuf.Parser<AddServiceProviderInfoRP_m> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddServiceProviderInfoRP_m> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.erksystem.protobuf.prov.AddServiceProviderInfoRP_m getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

