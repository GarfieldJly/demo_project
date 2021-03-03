package com.garfield.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * @author jingliyuan
 * @date 2021/1/5
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
