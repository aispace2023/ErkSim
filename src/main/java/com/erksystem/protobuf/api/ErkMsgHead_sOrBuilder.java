// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ErkApiMsg.proto

// Protobuf Java Version: 3.25.0
package com.erksystem.protobuf.api;

public interface ErkMsgHead_sOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ErkMsgHead_s)
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
   * <code>int32 OrgId = 3;</code>
   * @return The orgId.
   */
  int getOrgId();

  /**
   * <code>int32 UserId = 4;</code>
   * @return The userId.
   */
  int getUserId();
}