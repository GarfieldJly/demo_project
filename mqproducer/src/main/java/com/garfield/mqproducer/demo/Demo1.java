package com.garfield.mqproducer.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author jingliyuan
 * @date 2020/9/7
 */
@RestController
@RequestMapping("/test")
public class Demo1 {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @GetMapping(value = "/activemq")
    public void testMQ(){
        for (int i = 0; i < 10; i++) {
            jmsMessagingTemplate.convertAndSend("cat.queue","加菲猫" +i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
