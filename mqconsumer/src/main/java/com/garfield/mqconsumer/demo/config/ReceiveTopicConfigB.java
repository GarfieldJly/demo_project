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
@RabbitListener(queues = "queueB")
@Slf4j
public class ReceiveTopicConfigB {
    @RabbitHandler
    public void receive1(String msg){
        log.info( "queueB:"+msg);
    }
}
