package com.garfield.pape;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jingliyuan
 * @date 2020/11/24
 */
@SpringBootApplication
@MapperScan(basePackages = "com.garfield.pape.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
