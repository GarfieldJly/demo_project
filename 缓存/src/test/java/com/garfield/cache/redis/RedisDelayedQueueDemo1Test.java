package com.garfield.cache.redis;

import com.garfield.cache.Application;
import com.garfield.cache.redis.delayedqueue.RedisDelayedQueueDemo1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ObjectUtils;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @author jingliyuan
 * @date 2020/10/22
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class RedisDelayedQueueDemo1Test {
    @Autowired
    private RedisTemplate redisTemplate;

    private String queueName = "messageDelayedQueue";

    private String count = "count";

    private Integer initTime = 2;

    @Test
    public void test1() {
        redisTemplate.execute(new RedisCallback() {
            @Override
            public Object doInRedis(RedisConnection redisConnection) throws DataAccessException {
                redisConnection.subscribe((message, bytes) -> System.out.println("收到消息，使用redisTemplate收到的：" + message), "__keyevent@0__:expired".getBytes());
                return null;
            }
        });

        redisTemplate.opsForValue().set("name2", "jingliyuan", 5, TimeUnit.SECONDS);
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Object name2 = redisTemplate.delete("name2");
        System.out.println("6秒后取出的值为:" + name2);

    }


    // 隐藏功能~~黑科技~~当key被删除，或者key过期之后，也会有通知~
    @Test
    public void test2() throws InterruptedException {
        redisTemplate.execute(new RedisCallback<Long>() {
            @Override
            public Long doInRedis(RedisConnection connection) throws DataAccessException {
                connection.subscribe((message, pattern) -> {
                    System.out.println("收到消息，使用redisTemplate收到的：" + message);
                }, "__keyevent@0__:del".getBytes());
                return null;
            }
        });

        redisTemplate.opsForValue().set("hkkkk", "tony");
        Thread.sleep(1000L);
        redisTemplate.delete("hkkkk");
    }

    Scanner scanner = new Scanner(System.in);
    @Test
    public void test3(){
        final int[] times = {1};
        redisTemplate.execute(new RedisCallback() {
            @Override
            public Object doInRedis(RedisConnection redisConnection) throws DataAccessException {
                redisConnection.subscribe(new MessageListener() {
                    @Override
                    public void onMessage(Message message, byte[] bytes) {
                        System.out.println("测试是否收到消息 :" + message);
                        if(!ObjectUtils.isEmpty(message) && queueName.equals(String.valueOf(message.toString()))){

                            String cc = (String) redisTemplate.opsForValue().get(count);
                            if(Integer.valueOf(cc) < 5){
                                times[0]++;
                                redisTemplate.opsForValue().set(count,times+"");
                                redisTemplate.opsForValue().set(queueName,"媛媛",initTime * 2,TimeUnit.SECONDS);
//                                System.out.println("第"+times + "次");
                                System.out.println("收到的消息:"+message + ";;当前时间:"+ new Date());
                            }else{
                                scanner.close();
                            }
                        }
                    }
                },"__keyevent@0__:expired".getBytes());
                return null;
            }
        });

        redisTemplate.opsForValue().set(queueName,"媛媛",initTime,TimeUnit.SECONDS);
        redisTemplate.opsForValue().set(count,"1");
//        try {
//            TimeUnit.SECONDS.sleep(4);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        scanner.nextLine();
    }

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Test
    public void test4(){
        //increment方法必须是stringRedisTemplate模板才能使用
        Long count1 = stringRedisTemplate.opsForValue().increment("count1", 1);
        System.out.println(count1.longValue());
    }

    @Autowired
    private RedisDelayedQueueDemo1 redisDelayedQueueDemo1;
    @Test
    public void test5(){
        redisDelayedQueueDemo1.create();
    }

}
