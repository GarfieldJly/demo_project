package com.garfield.mqproducer.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author jingliyuan
 * @date 2020/9/10
 */
@Configuration
public class FanoutRabbitConfig {
    @Bean
    public Queue queueA(){
        return new Queue("queueA") ;
    }

    @Bean
    public Queue queueB(){
        return new Queue("queueB") ;
    }

    @Bean
    public Queue queueC(){
        return new Queue("queueC") ;
    }
    @Bean
    public FanoutExchange testFanoutExchange(){
        return new FanoutExchange("testFanoutExchange");
    }

    @Bean
    Binding bindingFanoutExchangeA(){
        return BindingBuilder.bind(queueA()).to(testFanoutExchange());
    }

    @Bean
    Binding bindingFanoutExchangeB(){
        return BindingBuilder.bind(queueB()).to(testFanoutExchange());
    }

    @Bean
    Binding bindingFanoutExchangeC(){
        return BindingBuilder.bind(queueC()).to(testFanoutExchange());
    }

}
