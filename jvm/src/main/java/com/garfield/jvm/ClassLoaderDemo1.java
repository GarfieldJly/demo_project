package com.garfield.jvm;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author jingliyuan
 * @date 2020/9/1
 */
public class ClassLoaderDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {


        //BootstrapLoader  在jre/lib 目录里的jar包
        ClassLoader classLoader1 = ClassLoaderDemo1.class.getClassLoader().loadClass("java.lang.String").getClassLoader();
        System.out.println("核心类加载器:"+classLoader1);
        //ExtensionClassLoader  拓展类库加载器， 在jre/lib/ext 目录里的jar包
        ClassLoader classLoader2 = ClassLoaderDemo1.class.getClassLoader().loadClass("com.sun.nio.zipfs.ZipCoder").getClassLoader();
        System.out.println("拓展类加载器:"+classLoader2);
        //ApplicationClassLoader 系统类加载器
        System.out.println(ClassLoader.getSystemClassLoader());

        System.out.println("请输入：");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
