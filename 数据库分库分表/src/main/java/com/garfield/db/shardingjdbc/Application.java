package com.garfield.db.shardingjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jingliyuan
 * @date 2020/11/13
 */
@SpringBootApplication
@MapperScan("com.garfield.db.shardingjdbc.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
