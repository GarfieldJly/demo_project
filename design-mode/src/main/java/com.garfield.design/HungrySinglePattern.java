package com.garfield.design;

/**
 * @author jingliyuan
 * @date 2021/1/8
 * 饿汉式 单例模式
 * 饿汉式单例在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，
 * 所以是线程安全的，可以直接用于多线程而不会出现问题。
 */
public class HungrySinglePattern {
    //在类实例化的时候创建好对象
    private static final HungrySinglePattern hungrySingleMode = new HungrySinglePattern();
    private HungrySinglePattern(){

    }

    public static HungrySinglePattern getInstance(){
        return hungrySingleMode;
    }
}
