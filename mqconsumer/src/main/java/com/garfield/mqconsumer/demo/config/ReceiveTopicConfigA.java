package com.garfield.mqconsumer.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * @author jingliyuan
 * @date 2020/9/10
 */
//@Configuration
@RabbitListener(queues = "queueA")
@Slf4j
public class ReceiveTopicConfigA {
    @RabbitHandler
    public void receive1(String msg){
        log.info( "queueA:"+( msg));
    }
}
