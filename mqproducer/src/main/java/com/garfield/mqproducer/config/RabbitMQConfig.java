package com.garfield.mqproducer.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;

/**
 * @author jingliyuan
 * @date 2020/9/10
 * https://blog.csdn.net/qq_35387940/article/details/100514134
 */
//@Configuration
@Slf4j
public class RabbitMQConfig {
    @Bean
    public RabbitTemplate createRabbitTemplate(ConnectionFactory factory) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate();
        rabbitTemplate.setConnectionFactory(factory);

        rabbitTemplate.setConfirmCallback(new RabbitTemplate.ConfirmCallback() {
            @Override
            public void confirm(CorrelationData correlationData, boolean b, String s) {
                log.info("收到的消息: "+correlationData);
                log.info("是否发送成功:" + b);
                log.info("异常信息 ConfirmCallback : "+s);
            }
        });

        rabbitTemplate.setReturnCallback(new RabbitTemplate.ReturnCallback() {
            @Override
            public void returnedMessage(Message message, int i, String s, String s1, String s2) {
                log.info("响应回调 ReturnCallback : "+s);
                log.info("响应回调 ReturnCallback: "+ i);
                log.info("响应回调 ReturnCallback: "+s);
                log.info("响应回调 ReturnCallback: "+s1);
                log.info("响应回调 ReturnCallback: "+s2);
            }
        });
        return rabbitTemplate;
    }
}
