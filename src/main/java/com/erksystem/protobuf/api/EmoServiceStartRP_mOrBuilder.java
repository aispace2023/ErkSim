// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ErkApiMsg.proto

// Protobuf Java Version: 3.25.3
package com.erksystem.protobuf.api;

public interface EmoServiceStartRP_mOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EmoServiceStartRP_m)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ErkMsgHead_s ErkMsgHead = 1;</code>
   * @return Whether the erkMsgHead field is set.
   */
  boolean hasErkMsgHead();
  /**
   * <code>.ErkMsgHead_s ErkMsgHead = 1;</code>
   * @return The erkMsgHead.
   */
  com.erksystem.protobuf.api.ErkMsgHead_s getErkMsgHead();
  /**
   * <code>.ErkMsgHead_s ErkMsgHead = 1;</code>
   */
  com.erksystem.protobuf.api.ErkMsgHead_sOrBuilder getErkMsgHeadOrBuilder();

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
   * <code>.ErkEngineInfo_s PhysioEngineInfo = 4;</code>
   * @return Whether the physioEngineInfo field is set.
   */
  boolean hasPhysioEngineInfo();
  /**
   * <code>.ErkEngineInfo_s PhysioEngineInfo = 4;</code>
   * @return The physioEngineInfo.
   */
  com.erksystem.protobuf.api.ErkEngineInfo_s getPhysioEngineInfo();
  /**
   * <code>.ErkEngineInfo_s PhysioEngineInfo = 4;</code>
   */
  com.erksystem.protobuf.api.ErkEngineInfo_sOrBuilder getPhysioEngineInfoOrBuilder();

  /**
   * <code>.ErkEngineInfo_s SpeechEngineInfo = 5;</code>
   * @return Whether the speechEngineInfo field is set.
   */
  boolean hasSpeechEngineInfo();
  /**
   * <code>.ErkEngineInfo_s SpeechEngineInfo = 5;</code>
   * @return The speechEngineInfo.
   */
  com.erksystem.protobuf.api.ErkEngineInfo_s getSpeechEngineInfo();
  /**
   * <code>.ErkEngineInfo_s SpeechEngineInfo = 5;</code>
   */
  com.erksystem.protobuf.api.ErkEngineInfo_sOrBuilder getSpeechEngineInfoOrBuilder();

  /**
   * <code>.ErkEngineInfo_s FaceEngineInfo = 6;</code>
   * @return Whether the faceEngineInfo field is set.
   */
  boolean hasFaceEngineInfo();
  /**
   * <code>.ErkEngineInfo_s FaceEngineInfo = 6;</code>
   * @return The faceEngineInfo.
   */
  com.erksystem.protobuf.api.ErkEngineInfo_s getFaceEngineInfo();
  /**
   * <code>.ErkEngineInfo_s FaceEngineInfo = 6;</code>
   */
  com.erksystem.protobuf.api.ErkEngineInfo_sOrBuilder getFaceEngineInfoOrBuilder();

  /**
   * <code>.ErkEngineInfo_s KnowledgeEngineInfo = 7;</code>
   * @return Whether the knowledgeEngineInfo field is set.
   */
  boolean hasKnowledgeEngineInfo();
  /**
   * <code>.ErkEngineInfo_s KnowledgeEngineInfo = 7;</code>
   * @return The knowledgeEngineInfo.
   */
  com.erksystem.protobuf.api.ErkEngineInfo_s getKnowledgeEngineInfo();
  /**
   * <code>.ErkEngineInfo_s KnowledgeEngineInfo = 7;</code>
   */
  com.erksystem.protobuf.api.ErkEngineInfo_sOrBuilder getKnowledgeEngineInfoOrBuilder();

  /**
   * <code>.ErkEngineInfo_s ServiceEngineInfo = 8;</code>
   * @return Whether the serviceEngineInfo field is set.
   */
  boolean hasServiceEngineInfo();
  /**
   * <code>.ErkEngineInfo_s ServiceEngineInfo = 8;</code>
   * @return The serviceEngineInfo.
   */
  com.erksystem.protobuf.api.ErkEngineInfo_s getServiceEngineInfo();
  /**
   * <code>.ErkEngineInfo_s ServiceEngineInfo = 8;</code>
   */
  com.erksystem.protobuf.api.ErkEngineInfo_sOrBuilder getServiceEngineInfoOrBuilder();
}
