package com.garfield.classloader;

import java.io.IOException;

/**
 * @author jingliyuan
 * @date 2021/2/25
 */
public class ClassLoaderView {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        ClassLoader classLoader = ClassLoaderView.class.getClassLoader().loadClass("java.lang.String").getClassLoader();
        System.out.println("核心类库加载器:"+classLoader);

        ClassLoader classLoader1 = ClassLoaderView.class.getClassLoader().loadClass("com.sun.nio.zipfs.ZipCoder").getClassLoader();
        System.out.println("拓展类库加载器:"+classLoader1);

        ClassLoader classLoader2 = ClassLoaderView.class.getClassLoader();
        System.out.println("应用程序加载器:"+classLoader2);

        ClassLoader parent = ClassLoaderView.class.getClassLoader().getParent();
        System.out.println("应用程序加载器的父类:"+parent);

        ClassLoader parent1 = ClassLoaderView.class.getClassLoader().getParent().getParent();
        System.out.println("应用程序加载器的父类的父类:"+parent1);

        System.in.read();


    }

}
