package com.aispace.service;

import com.aispace.config.UserConfig;
import com.aispace.rmq.RmqStreamModule;
import lombok.Getter;
import lombok.Setter;

/**
 * @author kangmoo Heo
 */
@Getter
@Setter
public class AppInstance {
    UserConfig userConfig = new UserConfig();
    RmqStreamModule rmqStreamModule;

    private AppInstance() {
    }

    private static class SingletonInstance {
        private static final AppInstance INSTANCE = new AppInstance();
    }

    public static AppInstance getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
