// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ErkProvMsg.proto

// Protobuf Java Version: 3.25.0
package com.erksystem.protobuf.prov;

public interface AddUserInfoRQ_mOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AddUserInfoRQ_m)
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
   * <code>string UserName = 2;</code>
   * @return The userName.
   */
  java.lang.String getUserName();
  /**
   * <code>string UserName = 2;</code>
   * @return The bytes for userName.
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <code>string UserPwd = 3;</code>
   * @return The userPwd.
   */
  java.lang.String getUserPwd();
  /**
   * <code>string UserPwd = 3;</code>
   * @return The bytes for userPwd.
   */
  com.google.protobuf.ByteString
      getUserPwdBytes();

  /**
   * <code>string ServiceDuration = 4;</code>
   * @return The serviceDuration.
   */
  java.lang.String getServiceDuration();
  /**
   * <code>string ServiceDuration = 4;</code>
   * @return The bytes for serviceDuration.
   */
  com.google.protobuf.ByteString
      getServiceDurationBytes();

  /**
   * <code>int32 Age = 5;</code>
   * @return The age.
   */
  int getAge();

  /**
   * <code>int32 Sex = 6;</code>
   * @return The sex.
   */
  int getSex();

  /**
   * <code>int32 UserType = 7;</code>
   * @return The userType.
   */
  int getUserType();

  /**
   * <code>.ServiceType_e ServiceType = 8;</code>
   * @return The enum numeric value on the wire for serviceType.
   */
  int getServiceTypeValue();
  /**
   * <code>.ServiceType_e ServiceType = 8;</code>
   * @return The serviceType.
   */
  com.erksystem.protobuf.prov.ServiceType_e getServiceType();
}
