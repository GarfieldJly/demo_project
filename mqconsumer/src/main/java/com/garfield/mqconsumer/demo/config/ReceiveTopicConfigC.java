package com.garfield.mqconsumer.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

/**
 * @author jingliyuan
 * @date 2020/9/10
 */
@Configuration
@RabbitListener(queues = "queueC")
@Slf4j
public class ReceiveTopicConfigC {
    @RabbitHandler
    public void receive1(String msg){
        log.info( "queueC: "+msg);
    }
}
