// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ErkApiMsg.proto

// Protobuf Java Version: 3.25.0
package com.erksystem.protobuf.api;

public interface ErkServiceConnRP_mOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ErkServiceConnRP_m)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ErkMsgHeader ErkMsgHead = 1;</code>
   * @return Whether the erkMsgHead field is set.
   */
  boolean hasErkMsgHead();
  /**
   * <code>.ErkMsgHeader ErkMsgHead = 1;</code>
   * @return The erkMsgHead.
   */
  com.erksystem.protobuf.api.ErkMsgHeader getErkMsgHead();
  /**
   * <code>.ErkMsgHeader ErkMsgHead = 1;</code>
   */
  com.erksystem.protobuf.api.ErkMsgHeaderOrBuilder getErkMsgHeadOrBuilder();

  /**
   * <code>int64 MsgTime = 2;</code>
   * @return The msgTime.
   */
  long getMsgTime();

  /**
   * <code>.ReturnCode_e ReturnCode = 3;</code>
   * @return The enum numeric value on the wire for returnCode.
   */
  int getReturnCodeValue();
  /**
   * <code>.ReturnCode_e ReturnCode = 3;</code>
   * @return The returnCode.
   */
  com.erksystem.protobuf.api.ReturnCode_e getReturnCode();

  /**
   * <code>.ServiceType_e ServiceType = 4;</code>
   * @return The enum numeric value on the wire for serviceType.
   */
  int getServiceTypeValue();
  /**
   * <code>.ServiceType_e ServiceType = 4;</code>
   * @return The serviceType.
   */
  com.erksystem.protobuf.api.ServiceType_e getServiceType();
}
