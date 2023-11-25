package com.aispace.scenario.step;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * @author kangmoo Heo
 */
@ToString
@Slf4j
public class PauseStep implements Step {
    int timeMs;

    public PauseStep(String timeMs) {
        this(Integer.parseInt(timeMs));
    }

    public PauseStep(int timeMs) {
        this.timeMs = timeMs;
    }

    @Override
    public void action() {
        try {
            Thread.sleep(timeMs);
        } catch (InterruptedException e) {
            log.warn("Err Occurs", e);
        }
    }
}
