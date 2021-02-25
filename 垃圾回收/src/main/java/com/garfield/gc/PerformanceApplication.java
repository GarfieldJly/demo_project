package com.garfield.gc;

import org.springframework.boot.SpringApplication;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author jingliyuan
 * @date 2021/2/25
 */
public class PerformanceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PerformanceApplication.class);

        Executors.newScheduledThreadPool(1).scheduleAtFixedRate((Runnable) () -> {
            for (int i = 0; i < 150; i++) {
                byte[] bytes = new byte[1024*512];
                try {
                    TimeUnit.SECONDS.sleep(new Random().nextInt(1));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },100,100,TimeUnit.MILLISECONDS);
    }
}
