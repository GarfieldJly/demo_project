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

    @GetMapping(value = "/sendDirectMessage2")
    public void sendDirectMessage2(){
        rabbitTemplate.convertAndSend("TestTopicExchange","topic.man","哈喽man，测试TestTopicExchange");
    }

    @GetMapping(value = "/sendDirectMessage3")
    public void sendDirectMessage3(){
        rabbitTemplate.convertAndSend("TestTopicExchange","topic.woman","哈喽woman，测试TestTopicExchange");
    }

    @GetMapping(value = "/sendDirectMessage4")
    public void sendDirectMessage4(){
        rabbitTemplate.convertAndSend("testFanoutExchange",null,"哈喽,测试TestFanoutExchange");
    }

}
