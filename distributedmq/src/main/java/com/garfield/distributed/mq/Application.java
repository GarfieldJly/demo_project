package com.garfield.distributed.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author jingliyuan
 * @date 2020/9/15
 */
@MapperScan(basePackages = "com.garfield.distributed.mq.dao")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
    @Bean
    public RestTemplate createRestTemplate(){
        return new RestTemplate();
    }
}
