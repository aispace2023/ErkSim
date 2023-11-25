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
    @ConfigValue("rmq.incoming-queue")
    String rmqIncomingQueue;
    @ConfigValue("rmq.outgoing-queue.provision")
    String rmqOutgoingQueueProvision;
    @ConfigValue("rmq.outgoing-queue.api")
    String rmqOutgoingQueueApi;

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
                        String argument = o[1].trim();

                        return switch (command) {
                            case "send" -> new SendStep(argument);
                            case "pause" -> new PauseStep(argument);
                            default -> null;
                        };
                    } catch (Exception e) {
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .toList();
    }
}
