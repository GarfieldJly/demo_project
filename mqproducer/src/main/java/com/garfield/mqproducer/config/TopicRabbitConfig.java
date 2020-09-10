package com.garfield.mqproducer.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author jingliyuan
 * @date 2020/9/10
 */
@Component
public class TopicRabbitConfig {
    private static final String MAN = "topic.man";
    private static final String WOMAN = "topic.woman";

    @Bean
    public Queue FirstQueue(){
        return new Queue(MAN,true);
    }

    @Bean
    public Queue SecondQueue(){
        return new Queue(WOMAN,true);
    }
    @Bean
    public TopicExchange TestTopicExchange(){
        return new TopicExchange("TestTopicExchange");
    }

    //绑定
    @Bean
    Binding bindFirstQueue(){
        return BindingBuilder.bind(FirstQueue()).to(TestTopicExchange()).with(TopicRabbitConfig.MAN);
    }

}
