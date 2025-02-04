package com.aispace;

import com.aispace.config.UserConfig;
import com.aispace.rmq.RmqLogPrinter;
import com.aispace.rmq.RmqModule;
import com.aispace.scenario.step.Step;
import com.aispace.service.AppInstance;
import com.aispace.service.RecvMsgUtil;
import com.erksystem.protobuf.api.ErkApiMsg;
import com.google.protobuf.Message;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeoutException;

/**
 * @author kangmoo Heo
 */
@Slf4j
public class ErkSimMain {
    private static final AppInstance appInstance = AppInstance.getInstance();
    private static final RecvMsgUtil recvMsgUtil = RecvMsgUtil.getInstance();
    public static void main(String[] args) throws IOException, NoSuchFieldException, TimeoutException {
        try {
            UserConfig userConfig = appInstance.getUserConfig();
            userConfig.init(args[0]);

            RmqModule rmqModule = new RmqModule(userConfig.getRmqHost(), userConfig.getRmqUser(), userConfig.getRmqPassword(), userConfig.getRmqPort(), 64);
            appInstance.setRmqModule(rmqModule);
            rmqModule.connect(() -> log.info("RMQ Connected!"), () -> log.warn("RMQ Disconnected!"));

            List<String> rmqIncomingQueues = List.of(
                    userConfig.getRmqIncomingQueueApi(),
                    userConfig.getRmqIncomingPerQueue(),
                    userConfig.getRmqIncomingSerQueue(),
                    userConfig.getRmqIncomingFerQueue(),
                    userConfig.getRmqIncomingEkmQueue());
            for (String rmqIncomingQueue : rmqIncomingQueues) {
                try {
                    rmqModule.queueDeclare(rmqIncomingQueue);
                } catch (Exception e) {
                    // ignore
                }
            }

            for (String rmqIncomingQueue : rmqIncomingQueues) {
                rmqModule.registerConsumer(rmqIncomingQueue, msg -> {
                    try {
                        Message protoMsg = ErkApiMsg.parseFrom(msg);
                        String jsonMsg = RmqLogPrinter.proto2Json(protoMsg).orElse(null);

                        recvMsgUtil.setRecentRecvMsg(jsonMsg);
                        log.info("[RMQ MESSAGE] ERK_SIM({}) <-- ERK_SYSTEM [{}]", rmqIncomingQueue, jsonMsg);
                    } catch (Exception e) {
                        log.warn("Err Occurs", e);
                    }

                });
            }
            for (Step step : userConfig.getSteps()) {
                step.action();
            }
            rmqModule.close();
        } catch (Exception e) {
            log.error("Err Occurs", e);
            throw e;
        }

    }
}
