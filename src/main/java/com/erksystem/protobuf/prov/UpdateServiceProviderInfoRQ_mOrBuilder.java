// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ErkProvMsg.proto

// Protobuf Java Version: 3.25.0
package com.erksystem.protobuf.prov;

public interface UpdateServiceProviderInfoRQ_mOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UpdateServiceProviderInfoRQ_m)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string OrgName = 1;</code>
   * @return The orgName.
   */
  java.lang.String getOrgName();
  /**
   * <code>string OrgName = 1;</code>
   * @return The bytes for orgName.
   */
  com.google.protobuf.ByteString
      getOrgNameBytes();

  /**
   * <code>string Old_OrgPwd = 2;</code>
   * @return The oldOrgPwd.
   */
  java.lang.String getOldOrgPwd();
  /**
   * <code>string Old_OrgPwd = 2;</code>
   * @return The bytes for oldOrgPwd.
   */
  com.google.protobuf.ByteString
      getOldOrgPwdBytes();

  /**
   * <code>string Old_ServiceDuration = 3;</code>
   * @return The oldServiceDuration.
   */
  java.lang.String getOldServiceDuration();
  /**
   * <code>string Old_ServiceDuration = 3;</code>
   * @return The bytes for oldServiceDuration.
   */
  com.google.protobuf.ByteString
      getOldServiceDurationBytes();

  /**
   * <code>int32 Old_UserNumber = 4;</code>
   * @return The oldUserNumber.
   */
  int getOldUserNumber();

  /**
   * <code>.ServiceType_e Old_ServiceType = 5;</code>
   * @return The enum numeric value on the wire for oldServiceType.
   */
  int getOldServiceTypeValue();
  /**
   * <code>.ServiceType_e Old_ServiceType = 5;</code>
   * @return The oldServiceType.
   */
  com.erksystem.protobuf.prov.ServiceType_e getOldServiceType();

  /**
   * <code>string New_OrgPwd = 6;</code>
   * @return The newOrgPwd.
   */
  java.lang.String getNewOrgPwd();
  /**
   * <code>string New_OrgPwd = 6;</code>
   * @return The bytes for newOrgPwd.
   */
  com.google.protobuf.ByteString
      getNewOrgPwdBytes();

  /**
   * <code>string New_ServiceDuration = 7;</code>
   * @return The newServiceDuration.
   */
  java.lang.String getNewServiceDuration();
  /**
   * <code>string New_ServiceDuration = 7;</code>
   * @return The bytes for newServiceDuration.
   */
  com.google.protobuf.ByteString
      getNewServiceDurationBytes();

  /**
   * <code>int32 New_UserNumber = 8;</code>
   * @return The newUserNumber.
   */
  int getNewUserNumber();

  /**
   * <code>.ServiceType_e New_ServiceType = 9;</code>
   * @return The enum numeric value on the wire for newServiceType.
   */
  int getNewServiceTypeValue();
  /**
   * <code>.ServiceType_e New_ServiceType = 9;</code>
   * @return The newServiceType.
   */
  com.erksystem.protobuf.prov.ServiceType_e getNewServiceType();
}
