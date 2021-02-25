package com.garfield.classloader;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.concurrent.TimeUnit;

/**
 * @author jingliyuan
 * @date 2021/2/25
 */
public class LoaderTest {
    public static void main(String[] args) throws Exception {
        URL classUrl = new URL("file:H:\\");
        URLClassLoader loader = new URLClassLoader(new URL[]{classUrl});
        while (true){
            //如果每次都是创建新的URLClassLoader,则相当于热加载，每次都会获取到最新修改的内容
//            URLClassLoader loader = new URLClassLoader(new URL[]{classUrl});
            //HelloService是编译后的class文件
            Class<?> clazz = loader.loadClass("HelloService");
            System.out.println("类加载器:"+clazz.getClassLoader());

            Object o = clazz.newInstance();
            Object test = clazz.getMethod("test").invoke(o);
            System.out.println(test);

            TimeUnit.SECONDS.sleep(3);
            System.out.println();
        }
    }
}
