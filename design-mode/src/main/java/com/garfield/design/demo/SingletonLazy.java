package com.garfield.design.demo;

/**
 * @author jingliyuan
 * @date 2021/1/8
 * 单例模式的实现
 */
public class SingletonLazy {
    public static void main(String[] args) {
        President president1 =  President.getInstance();
        president1.getName();

        President president2 =  President.getInstance();
        president2.getName();

        if(president1.equals(president2)){
            System.out.println("他们是同一个人");
        }else{
            System.out.println("他们是不同的人");
        }


    }
}
