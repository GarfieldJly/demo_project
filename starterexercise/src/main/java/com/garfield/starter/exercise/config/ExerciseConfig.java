package com.garfield.starter.exercise.config;

import com.garfield.log.GarfieldLog;
import com.garfield.log.starter.config.LogProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author jingliyuan
 * @date 2020/12/17
 */
@PropertySource(value = "application.properties")
@Configuration
@EnableConfigurationProperties(LogProperties.class)
public class ExerciseConfig {
    @Autowired
    private GarfieldLog garfieldLog;
    @Bean
    public void getGarfieldLogConfig(){
        System.out.println("Code: "+garfieldLog.getCode()+";;message: "+garfieldLog.getMessage());
    }


}
