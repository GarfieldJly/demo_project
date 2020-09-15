package com.garfield.mqproducer.delay;

import lombok.Data;

import java.io.Serializable;

/**
 * @author jingliyuan
 * @date 2020/9/14
 */
@Data
public class DelayMessageBean implements Serializable {
    private String message;
    private Integer retryCount = 0;

    @Override
    public String toString() {
        return "DelayMessageBean{" +
                "message='" + message + '\'' +
                ", retryCount=" + retryCount +
                '}';
    }
}
