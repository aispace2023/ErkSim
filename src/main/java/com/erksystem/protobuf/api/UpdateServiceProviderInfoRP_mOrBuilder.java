// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ErkApiMsg.proto

// Protobuf Java Version: 3.25.3
package com.erksystem.protobuf.api;

public interface UpdateServiceProviderInfoRP_mOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UpdateServiceProviderInfoRP_m)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ErkMsgType_e MsgType = 1;</code>
   * @return The enum numeric value on the wire for msgType.
   */
  int getMsgTypeValue();
  /**
   * <code>.ErkMsgType_e MsgType = 1;</code>
   * @return The msgType.
   */
  com.erksystem.protobuf.api.ErkMsgType_e getMsgType();

  /**
   * <code>.QueueInfo_s QueueInfo = 2;</code>
   * @return Whether the queueInfo field is set.
   */
  boolean hasQueueInfo();
  /**
   * <code>.QueueInfo_s QueueInfo = 2;</code>
   * @return The queueInfo.
   */
  com.erksystem.protobuf.api.QueueInfo_s getQueueInfo();
  /**
   * <code>.QueueInfo_s QueueInfo = 2;</code>
   */
  com.erksystem.protobuf.api.QueueInfo_sOrBuilder getQueueInfoOrBuilder();

  /**
   * <code>string OrgName = 3;</code>
   * @return The orgName.
   */
  java.lang.String getOrgName();
  /**
   * <code>string OrgName = 3;</code>
   * @return The bytes for orgName.
   */
  com.google.protobuf.ByteString
      getOrgNameBytes();

  /**
   * <code>.OrgProfileResult_e ResultType = 4;</code>
   * @return The enum numeric value on the wire for resultType.
   */
  int getResultTypeValue();
  /**
   * <code>.OrgProfileResult_e ResultType = 4;</code>
   * @return The resultType.
   */
  com.erksystem.protobuf.api.OrgProfileResult_e getResultType();

  /**
   * <code>string Old_OrgPwd = 5;</code>
   * @return The oldOrgPwd.
   */
  java.lang.String getOldOrgPwd();
  /**
   * <code>string Old_OrgPwd = 5;</code>
   * @return The bytes for oldOrgPwd.
   */
  com.google.protobuf.ByteString
      getOldOrgPwdBytes();

  /**
   * <code>.ProviderType_e Old_ProviderType = 6;</code>
   * @return The enum numeric value on the wire for oldProviderType.
   */
  int getOldProviderTypeValue();
  /**
   * <code>.ProviderType_e Old_ProviderType = 6;</code>
   * @return The oldProviderType.
   */
  com.erksystem.protobuf.api.ProviderType_e getOldProviderType();

  /**
   * <code>string Old_ServiceDuration = 7;</code>
   * @return The oldServiceDuration.
   */
  java.lang.String getOldServiceDuration();
  /**
   * <code>string Old_ServiceDuration = 7;</code>
   * @return The bytes for oldServiceDuration.
   */
  com.google.protobuf.ByteString
      getOldServiceDurationBytes();

  /**
   * <code>int32 Old_UserNumber = 8;</code>
   * @return The oldUserNumber.
   */
  int getOldUserNumber();

  /**
   * <code>.ServiceType_e Old_ServiceType = 9;</code>
   * @return The enum numeric value on the wire for oldServiceType.
   */
  int getOldServiceTypeValue();
  /**
   * <code>.ServiceType_e Old_ServiceType = 9;</code>
   * @return The oldServiceType.
   */
  com.erksystem.protobuf.api.ServiceType_e getOldServiceType();

  /**
   * <code>string New_OrgPwd = 10;</code>
   * @return The newOrgPwd.
   */
  java.lang.String getNewOrgPwd();
  /**
   * <code>string New_OrgPwd = 10;</code>
   * @return The bytes for newOrgPwd.
   */
  com.google.protobuf.ByteString
      getNewOrgPwdBytes();

  /**
   * <code>.ProviderType_e New_ProviderType = 11;</code>
   * @return The enum numeric value on the wire for newProviderType.
   */
  int getNewProviderTypeValue();
  /**
   * <code>.ProviderType_e New_ProviderType = 11;</code>
   * @return The newProviderType.
   */
  com.erksystem.protobuf.api.ProviderType_e getNewProviderType();

  /**
   * <code>string New_ServiceDuration = 120;</code>
   * @return The newServiceDuration.
   */
  java.lang.String getNewServiceDuration();
  /**
   * <code>string New_ServiceDuration = 120;</code>
   * @return The bytes for newServiceDuration.
   */
  com.google.protobuf.ByteString
      getNewServiceDurationBytes();

  /**
   * <code>int32 New_UserNumber = 13;</code>
   * @return The newUserNumber.
   */
  int getNewUserNumber();

  /**
   * <code>.ServiceType_e New_ServiceType = 14;</code>
   * @return The enum numeric value on the wire for newServiceType.
   */
  int getNewServiceTypeValue();
  /**
   * <code>.ServiceType_e New_ServiceType = 14;</code>
   * @return The newServiceType.
   */
  com.erksystem.protobuf.api.ServiceType_e getNewServiceType();
}
