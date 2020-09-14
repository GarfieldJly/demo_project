package com.garfield.mqconsumer.demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConsumer1 {
    @RabbitListener(queues = "storeQueue")
    public void receive(String message){
        System.out.println(message + "当前时间:"+System.currentTimeMillis());
    }
}
