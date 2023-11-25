package com.aispace.config.base.yaml;

import com.aispace.config.base.ConfigReader;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * Created by Ai_Space
 */
@Slf4j
public class YamlConfig extends ConfigReader {

    @Override
    protected final void fieldSetting() throws IOException, NoSuchFieldException {
        YamlConfigInjector.inject(this, filePath.toString());
    }
}
