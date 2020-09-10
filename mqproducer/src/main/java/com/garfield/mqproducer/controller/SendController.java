package com.garfield.mqproducer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jingliyuan
 * @date 2020/9/10
 */
@RestController
@RequestMapping("/rabbitmq")
@Slf4j
public class SendController {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping(value = "/sendDirectMessage")
    public void sendDirectMessage(){
        rabbitTemplate.convertAndSend("TestDirectExchange","TestDirectRouting","哈喽，测试DirectExchange");
    }

}
