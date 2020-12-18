package com.garfield.log.starter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author jingliyuan
 * @date 2020/12/17
 */
@ConfigurationProperties(prefix = "garfield")
public class LogProperties {
    private String message;
    private Integer code;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
