package com.garfield.function.demo;

import com.google.common.collect.ImmutableMap;

/**
 * @author jingliyuan
 * @date 2020/8/19
 */
public class ImmutableMapDemo {

    public static void main(String[] args) {
        //不可变的map
        ImmutableMap<String, String> immutableMap = ImmutableMap.of("a", "11", "b", "22", "c", "33");
        immutableMap.forEach((k,v) ->{
            System.out.println("key is:"+k);
            System.out.println("value is:"+v);
        });
    }
}
