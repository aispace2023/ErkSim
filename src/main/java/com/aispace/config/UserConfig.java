package com.aispace.config;

import com.aispace.config.base.ConfigValue;
import com.aispace.config.base.yaml.YamlConfig;
import com.aispace.scenario.step.PauseStep;
import com.aispace.scenario.step.SendStep;
import com.aispace.scenario.step.Step;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author kangmoo Heo
 */
@Getter
public class UserConfig extends YamlConfig {
    @ConfigValue("rmq.host")
    String rmqHost;
    @ConfigValue("rmq.user")
    String rmqUser;
    @ConfigValue("rmq.password")
    String rmqPassword;
    @ConfigValue("rmq.port")
    int rmqPort;
    @ConfigValue("rmq.incoming-queue.api")
    String rmqIncomingQueueApi;
    @ConfigValue("rmq.incoming-queue.per-queue")
    String rmqIncomingPerQueue;
    @ConfigValue("rmq.incoming-queue.ser-queue")
    String rmqIncomingSerQueue;
    @ConfigValue("rmq.incoming-queue.fer-queue")
    String rmqIncomingFerQueue;
    @ConfigValue("rmq.incoming-queue.ekm-queue")
    String rmqIncomingEkmQueue;
    @ConfigValue("rmq.outgoing-queue.api")
    String rmqOutgoingQueueApi;
    @ConfigValue("rmq.outgoing-queue.subsystem")
    String rmqOutgoingQueueSubsystem;

    @ConfigValue("scenario.steps")
    List<String> stepsStrs;
    List<Step> steps = new ArrayList<>();

    @Override
    protected void afterFieldSetting() {
        steps = stepsStrs.stream()
                .map(o -> o.split(";", 2))
                .map(o -> {
                    try {
                        String command = o[0].trim();
                        String[] arguments = o[1].trim().split(";");

                        return switch (command) {
                            case "send" -> new SendStep(arguments);
                            case "pause" -> new PauseStep(arguments);
                            default -> null;
                        };
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                })
                .filter(Objects::nonNull)
                .toList();
    }
}
