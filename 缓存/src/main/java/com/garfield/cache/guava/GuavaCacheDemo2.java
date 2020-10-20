package com.garfield.cache.guava;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.TimeUnit;

/**
 * @author jingliyuan
 * @date 2020/10/19
 */
public class GuavaCacheDemo2 {
    public static void main(String[] args) {
        Cache<String, String> build = CacheBuilder.newBuilder().recordStats().expireAfterWrite(5, TimeUnit.SECONDS).concurrencyLevel(5).build();
        build.put("name","garfield");

        String name1 = build.getIfPresent("name");
        System.out.println("从缓存中取出的值为:" + name1);

        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String name2 = build.getIfPresent("name");
        System.out.println("6秒后从缓存中取出的值为:" + name2);
    }

}
