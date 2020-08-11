package com.garfield.testthread.close;

/**
 * @author jingliyuan
 * @date 2020/8/11
 * 见图片: 线程封闭的实现ThreadLocal.png
 * 线程封闭的实现-局部变量.png
 *
 * 线程封闭的两种实现：1. ThreadLocal  2. 局部变量
 */
public class TestThreadLocal {
    private static String value = "";

    public static void main(String[] args) {
        value = "garfield";
        System.out.println(Thread.currentThread().getName() + "中value 的值是:" + value);
        ThreadLocal<String> threadLocal = new ThreadLocal<String>() {
            @Override
            public void set(String value) {
                value = "cat";
                System.out.println("threadLocal 中 value的值:" + value);
            }

            @Override
            protected String initialValue() {
                value = "tree";
                System.out.println("threadLocal 中initialValue里的value的值:" + value);
                return value;
            }
        };
        threadLocal.set(value);
        System.out.println("value的值:" + value);
    }
}
