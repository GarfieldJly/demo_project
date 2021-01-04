package com.garfield.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author jingliyuan
 * @date 2020/12/25
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PeerApplication {
    public static void main(String[] args) {
        SpringApplication.run(PeerApplication.class,args);
    }

}
