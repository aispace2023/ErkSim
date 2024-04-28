// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ErkApiMsg.proto

// Protobuf Java Version: 3.25.3
package com.erksystem.protobuf.api;

public interface UpdateUserInfoRP_mOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UpdateUserInfoRP_m)
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
   * <code>string UserName = 4;</code>
   * @return The userName.
   */
  java.lang.String getUserName();
  /**
   * <code>string UserName = 4;</code>
   * @return The bytes for userName.
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <code>.UserProfileResult_e ResultType = 5;</code>
   * @return The enum numeric value on the wire for resultType.
   */
  int getResultTypeValue();
  /**
   * <code>.UserProfileResult_e ResultType = 5;</code>
   * @return The resultType.
   */
  com.erksystem.protobuf.api.UserProfileResult_e getResultType();

  /**
   * <code>string Old_UserPwd = 6;</code>
   * @return The oldUserPwd.
   */
  java.lang.String getOldUserPwd();
  /**
   * <code>string Old_UserPwd = 6;</code>
   * @return The bytes for oldUserPwd.
   */
  com.google.protobuf.ByteString
      getOldUserPwdBytes();

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
   * <code>int32 Old_Age = 8;</code>
   * @return The oldAge.
   */
  int getOldAge();

  /**
   * <code>.SexType_e Old_Sex = 9;</code>
   * @return The enum numeric value on the wire for oldSex.
   */
  int getOldSexValue();
  /**
   * <code>.SexType_e Old_Sex = 9;</code>
   * @return The oldSex.
   */
  com.erksystem.protobuf.api.SexType_e getOldSex();

  /**
   * <code>.MbtiType_e Old_MbtiType = 10;</code>
   * @return The enum numeric value on the wire for oldMbtiType.
   */
  int getOldMbtiTypeValue();
  /**
   * <code>.MbtiType_e Old_MbtiType = 10;</code>
   * @return The oldMbtiType.
   */
  com.erksystem.protobuf.api.MbtiType_e getOldMbtiType();

  /**
   * <code>.UserType_e Old_UserType = 11;</code>
   * @return The enum numeric value on the wire for oldUserType.
   */
  int getOldUserTypeValue();
  /**
   * <code>.UserType_e Old_UserType = 11;</code>
   * @return The oldUserType.
   */
  com.erksystem.protobuf.api.UserType_e getOldUserType();

  /**
   * <code>.ServiceType_e Old_ServiceType = 12;</code>
   * @return The enum numeric value on the wire for oldServiceType.
   */
  int getOldServiceTypeValue();
  /**
   * <code>.ServiceType_e Old_ServiceType = 12;</code>
   * @return The oldServiceType.
   */
  com.erksystem.protobuf.api.ServiceType_e getOldServiceType();

  /**
   * <code>string New_UserPwd = 13;</code>
   * @return The newUserPwd.
   */
  java.lang.String getNewUserPwd();
  /**
   * <code>string New_UserPwd = 13;</code>
   * @return The bytes for newUserPwd.
   */
  com.google.protobuf.ByteString
      getNewUserPwdBytes();

  /**
   * <code>string New_ServiceDuration = 14;</code>
   * @return The newServiceDuration.
   */
  java.lang.String getNewServiceDuration();
  /**
   * <code>string New_ServiceDuration = 14;</code>
   * @return The bytes for newServiceDuration.
   */
  com.google.protobuf.ByteString
      getNewServiceDurationBytes();

  /**
   * <code>int32 New_Age = 15;</code>
   * @return The newAge.
   */
  int getNewAge();

  /**
   * <code>.SexType_e New_Sex = 16;</code>
   * @return The enum numeric value on the wire for newSex.
   */
  int getNewSexValue();
  /**
   * <code>.SexType_e New_Sex = 16;</code>
   * @return The newSex.
   */
  com.erksystem.protobuf.api.SexType_e getNewSex();

  /**
   * <code>.MbtiType_e New_MbtiType = 17;</code>
   * @return The enum numeric value on the wire for newMbtiType.
   */
  int getNewMbtiTypeValue();
  /**
   * <code>.MbtiType_e New_MbtiType = 17;</code>
   * @return The newMbtiType.
   */
  com.erksystem.protobuf.api.MbtiType_e getNewMbtiType();

  /**
   * <code>.UserType_e New_UserType = 18;</code>
   * @return The enum numeric value on the wire for newUserType.
   */
  int getNewUserTypeValue();
  /**
   * <code>.UserType_e New_UserType = 18;</code>
   * @return The newUserType.
   */
  com.erksystem.protobuf.api.UserType_e getNewUserType();

  /**
   * <code>.ServiceType_e New_ServiceType = 19;</code>
   * @return The enum numeric value on the wire for newServiceType.
   */
  int getNewServiceTypeValue();
  /**
   * <code>.ServiceType_e New_ServiceType = 19;</code>
   * @return The newServiceType.
   */
  com.erksystem.protobuf.api.ServiceType_e getNewServiceType();
}
