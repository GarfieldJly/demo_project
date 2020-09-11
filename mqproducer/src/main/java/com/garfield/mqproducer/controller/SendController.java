package com.garfield.mqproducer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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
    public String sendDirectMessage(){
        rabbitTemplate.convertAndSend("TestDirectExchange","TestDirectRouting","哈喽，测试DirectExchange");
        return "ok";
    }

    @GetMapping(value = "/sendDirectMessage2")
    public String sendDirectMessage2(){
        rabbitTemplate.convertAndSend("TestTopicExchange","topic.man","哈喽man，测试TestTopicExchange");
        return "ok";
    }

    @GetMapping(value = "/sendDirectMessage3")
    public String sendDirectMessage3(){
        rabbitTemplate.convertAndSend("TestTopicExchange","topic.woman","哈喽woman，测试TestTopicExchange");
        return "ok";
    }

    @GetMapping(value = "/sendDirectMessage4")
    public String sendDirectMessage4(){
        rabbitTemplate.convertAndSend("testFanoutExchange",null,"哈喽,测试TestFanoutExchange");
        return "ok";
    }

    @GetMapping(value = "/sendDirectMessage5")
    public String sendDirectMessage5(){
        rabbitTemplate.convertAndSend("testFanoutExchange1",null,"testFanoutExchange1 不存在");
        return "ok";
    }

    @GetMapping("/TestMessageAck")
    public String TestMessageAck() {
        String messageId = String.valueOf(UUID.randomUUID());
        String messageData = "message: non-existent-exchange test message ";
        String createTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Map<String, Object> map = new HashMap<>();
        map.put("messageId", messageId);
        map.put("messageData", messageData);
        map.put("createTime", createTime);
        rabbitTemplate.convertAndSend("non-existent-exchange", "TestDirectRouting", map);
        return "ok";
    }

}
