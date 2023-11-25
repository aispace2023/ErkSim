package com.aispace.scenario.step;

import com.aispace.config.UserConfig;
import com.aispace.service.AppInstance;
import com.erksystem.protobuf.api.ErkApiMsg;
import com.google.protobuf.Message;
import java.nio.charset.StandardCharsets;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.nio.file.Files;
import java.nio.file.Path;

import static com.aispace.rmq.RmqLogPrinter.fromJson;

/**
 * @author kangmoo Heo
 */
@ToString
@Slf4j
public class SendStep implements Step {
    private static final AppInstance appInstance = AppInstance.getInstance();
    private static final UserConfig userConfig = appInstance.getUserConfig();
    Path filePath;

    public SendStep(String filePath) {
        this.filePath = Path.of(filePath);
    }

    @Override
    public void action() {
        try {
            String jsonMsg = new String(Files.readAllBytes(filePath), StandardCharsets.UTF_8);
            Message message = fromJson(jsonMsg).orElseThrow();

            String toQueue = message instanceof ErkApiMsg ?
                    userConfig.getRmqOutgoingQueueApi() :
                    userConfig.getRmqOutgoingQueueProvision();

            appInstance.getRmqStreamModule().sendMessage(toQueue, message.toByteArray());

            log.info("[RMQ MESSAGE] ERK_SIM --> ERK_SYSTEM({}) [{}]", toQueue, jsonMsg);
        } catch (Exception e) {
            log.warn("Err Occurs", e);
        }
    }
}
