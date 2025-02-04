package com.aispace.scenario.step;

import com.aispace.config.UserConfig;
import com.aispace.service.AppInstance;
import com.aispace.service.RecvMsgUtil;
import com.google.protobuf.Message;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import static com.aispace.rmq.RmqLogPrinter.fromJson;

/**
 * @author kangmoo Heo
 */
@ToString
@Slf4j
public class SendStep implements Step {
    private static final AppInstance appInstance = AppInstance.getInstance();
    private static final UserConfig userConfig = appInstance.getUserConfig();
    private static final RecvMsgUtil recvMsgUtil = RecvMsgUtil.getInstance();
    String targetQueue;
    String jsonMsg;

    public SendStep(String[] arguments) {
        this(arguments[0].trim(), arguments[1].trim());
    }

    public SendStep(String targetQueue, String filePath) {
        if (targetQueue.equalsIgnoreCase("api")) {
            this.targetQueue = userConfig.getRmqOutgoingQueueApi();
        } else if (targetQueue.equalsIgnoreCase("subsystem")) {
            this.targetQueue = userConfig.getRmqOutgoingQueueSubsystem();
        } else {
            throw new RuntimeException("Unknwon QueueName [" + targetQueue + "]");
        }
        try {
            this.jsonMsg = Files.readString(Path.of(filePath));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void action() {
        try {
            jsonMsg = msgConvert(jsonMsg);
            Message message = fromJson(jsonMsg).orElseThrow();

            appInstance.getRmqModule().sendMessage(targetQueue, message.toByteArray());

            log.info("[RMQ MESSAGE] ERK_SIM --> ERK_SYSTEM({}) [{}]", targetQueue, jsonMsg);
        } catch (Exception e) {
            log.warn("Err Occurs", e);
        }
    }

    private String msgConvert(String jsonMsg) {
        if (jsonMsg.contains("[NOW]")) {
            jsonMsg = jsonMsg.replace("[NOW]", String.valueOf(System.currentTimeMillis()));
        }

        if (jsonMsg.contains("[RANDOM_UUID]")) {
            jsonMsg = jsonMsg.replace("[RANDOM_UUID]", UUID.randomUUID().toString());
        }

        if (jsonMsg.contains("[RECENT_RCV_TID]")) {
            jsonMsg = jsonMsg.replace("[RECENT_RCV_TID]", recvMsgUtil.getRecentTid());
        }

        return jsonMsg;
    }
}
