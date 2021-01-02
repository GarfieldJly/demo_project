package com.garfield.hystrix.custom;

import java.util.Random;
import java.util.concurrent.*;

public class CustomHystrix {
    public static void main(String[] args)  {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,5,5000,TimeUnit.MILLISECONDS,new LinkedBlockingQueue<>());

        HystrixCommand hystrixCommand = new HystrixCommand();
        Future<String> future = threadPoolExecutor.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return hystrixCommand.run();
            }
        });

        String result;
        try {
            result = future.get(100, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
           result = hystrixCommand.fallback();
        }
        System.out.println(result);

        threadPoolExecutor.shutdown();

    }

    private static Random random = new Random();
    public  static class HystrixCommand implements Command{

        @Override
        public String run() {
            int count = random.nextInt(150);
            System.out.printf("休眠: %d 秒" , count);
            System.out.println();
            try {
                TimeUnit.MILLISECONDS.sleep(count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "执行成功";
        }

        @Override
        public String fallback() {
            return "出错了，服务降级";
        }
    }
}
