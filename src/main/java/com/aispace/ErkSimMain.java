package com.aispace;

import com.aispace.config.UserConfig;
import com.aispace.rmq.RmqLogPrinter;
import com.aispace.rmq.RmqStreamModule;
import com.aispace.scenario.step.Step;
import com.aispace.service.AppInstance;
import com.erksystem.protobuf.api.ErkApiMsg;
import com.erksystem.protobuf.api.ErkInterApiMsg;
import com.google.protobuf.Message;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author kangmoo Heo
 */
@Slf4j
public class ErkSimMain {
    private static final AppInstance appInstance = AppInstance.getInstance();
    public static void main(String[] args) throws IOException, NoSuchFieldException, TimeoutException {
        try {
            UserConfig userConfig = appInstance.getUserConfig();
            userConfig.init(args[0]);

            RmqStreamModule rmqStreamModule = new RmqStreamModule(userConfig.getRmqHost(), userConfig.getRmqUser(), userConfig.getRmqPassword(), userConfig.getRmqPort());
            appInstance.setRmqStreamModule(rmqStreamModule);
            rmqStreamModule.connect(() -> log.info("RMQ Connected!"), () -> log.warn("RMQ Disconnected!"));
            try {
                rmqStreamModule.queueDeclare(userConfig.getRmqIncomingQueueApi());
            } catch (Exception e){

            }
            try {
                rmqStreamModule.queueDeclare(userConfig.getRmqIncomingQueueSubsystem());
            } catch (Exception e){

            }

            rmqStreamModule.registerByteConsumer(userConfig.getRmqIncomingQueueApi(), msg -> {
                try {
                    Message protoMsg = ErkApiMsg.parseFrom(msg);
                    String jsonMsg = RmqLogPrinter.proto2Json(protoMsg).orElse(null);
                    log.info("[RMQ MESSAGE] ERK_SIM <-- ERK_SYSTEM [{}]", jsonMsg);
                } catch (Exception e){
                    log.warn("Err Occurs", e);
                }
            });

            rmqStreamModule.registerByteConsumer(userConfig.getRmqIncomingQueueSubsystem(), msg -> {
                try {
                    Message protoMsg = ErkInterApiMsg.parseFrom(msg);
                    String jsonMsg = RmqLogPrinter.proto2Json(protoMsg).orElse(null);
                    log.info("[RMQ MESSAGE] ERK_SIM <-- ERK_SYSTEM [{}]", jsonMsg);
                } catch (Exception e){
                    log.warn("Err Occurs", e);
                }
            });

            for (Step step : userConfig.getSteps()) {
                step.action();
            }
            rmqStreamModule.close();
        } catch (Exception e) {
            log.error("Err Occurs", e);
            throw e;
        }

    }
}
