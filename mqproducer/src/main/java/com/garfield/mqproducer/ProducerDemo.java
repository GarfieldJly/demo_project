package com.garfield.mqproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.core.JmsMessagingTemplate;

/**
 * @author jingliyuan
 * @date 2020/9/7
 * 生产者
 */
@SpringBootApplication
public class ProducerDemo {

    public static void main(String[] args) {
        SpringApplication.run(ProducerDemo.class);
    }

}
