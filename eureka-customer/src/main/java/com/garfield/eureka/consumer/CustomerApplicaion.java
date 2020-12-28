package com.garfield.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author jingliyuan
 * @date 2020/12/25
 */
@SpringBootApplication
@EnableEurekaClient
public class CustomerApplicaion {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplicaion.class,args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
