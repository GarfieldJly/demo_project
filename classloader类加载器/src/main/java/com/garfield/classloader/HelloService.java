package com.garfield.classloader;

/**
 * @author jingliyuan
 * @date 2021/2/25
 */
public class HelloService {
    public static String value = getValue();
    static {
        System.out.println("############static code");
    }

    private static String getValue(){
        System.out.println("*********static method");
        return "*******getValue";
    }

    public void test(){
        System.out.println("**** test:"+value);
    }
}
