package com.garfield.log.starter.config;

import com.garfield.log.GarfieldLog;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jingliyuan
 * @date 2020/12/17
 */
@Configuration
public class GarfieldLogConfig {

    @Bean
    public GarfieldLog getCustomLog(LogProperties logProperties) {
        GarfieldLog garfieldLog = new GarfieldLog();
        garfieldLog.setCode(logProperties.getCode());
        garfieldLog.setMessage(logProperties.getMessage());
        return garfieldLog;
    }

    @Bean
    @ConditionalOnMissingBean(value = LogAspect.class)
    public LogAspect logAspect(){
        return new LogAspect();
    }

}
