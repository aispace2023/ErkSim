package com.aispace.rmq;

import com.erksystem.protobuf.api.ErkApiMsg;
import com.google.protobuf.Message;
import com.google.protobuf.Struct;
import com.google.protobuf.util.JsonFormat;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;
import java.util.OptionalLong;

/**
 * Created by Ai_Space
 */
@Slf4j
public class RmqLogPrinter {
    private RmqLogPrinter() {
    }

    private static final JsonFormat.Printer jsonPrinter = JsonFormat.printer().includingDefaultValueFields();

    public static Optional<String> proto2Json(Message msg) {
        try {
            return Optional.of(jsonPrinter.print(msg));
        } catch (Exception e) {
            log.warn("Err Occurs", e);
            return Optional.empty();
        }
    }

    public static Optional<Message> fromJson(String json) {
        try {
            ErkApiMsg.Builder builder = ErkApiMsg.newBuilder();
            JsonFormat.parser().merge(json, builder);
            return Optional.of(builder.build());
        } catch (Exception e){
            return Optional.empty();
        }
    }
}
