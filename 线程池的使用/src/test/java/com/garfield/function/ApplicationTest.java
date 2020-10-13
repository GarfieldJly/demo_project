package com.garfield.function;

import com.garfield.function.controller.CompletableFutureTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RedisApplication.class)
public class ApplicationTest {
    @Autowired
    private CompletableFutureTest completableFutureTest;
    @Test
    public void testRequest(){
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Random random = new Random();
        for (int i = 0; i < 5000; i++) {
            Thread thread = new Thread(() ->{
                int randomInteger = random.nextInt(12);
                char param = (char)(97+randomInteger);
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String animalName = completableFutureTest.getAnimalName(String.valueOf(param));
                System.out.println("生肖:"+animalName+"  ;;;;请求参数："+param);
            });
            thread.start();
        }
        countDownLatch.countDown();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
