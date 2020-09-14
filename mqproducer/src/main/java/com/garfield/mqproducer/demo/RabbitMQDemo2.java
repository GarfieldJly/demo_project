package com.garfield.mqproducer.demo;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class RabbitMQDemo2 {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostConstruct
    public void createDelayedQueue(){

        for (int i = 0; i < 10; i++) {
            MessageProperties messageProperties = new MessageProperties();
            messageProperties.setExpiration(String.valueOf((10-i)*1000));
            String value = "加菲猫"+i;
            Message message = new Message(value.getBytes(),messageProperties);

            rabbitTemplate.convertAndSend("deadDirectExchange","dead",message);
        }
    }
}
