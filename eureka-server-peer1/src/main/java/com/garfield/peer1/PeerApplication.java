package com.garfield.peer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author jingliyuan
 * @date 2020/12/25
 */
@SpringBootApplication
@EnableEurekaClient
public class PeerApplication {
    public static void main(String[] args) {
        SpringApplication.run(PeerApplication.class,args);
    }

}
