package com.garfield.reflex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author jingliyuan
 * @date 2020/8/26
 * 需要在学习了Spring 的依赖注入，反转控制之后，才会对反射有更好的理解，所以先这里举两个例子，来演示一下反射的一种实际运用3。
 */
public class ReflectTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //从spring.txt中获取类名称和方法名称
        File springConfigFile = new File("H:\\demo_project\\spring.txt");
        Properties springConfig= new Properties();
        springConfig.load(new FileInputStream(springConfigFile));
        String className = (String) springConfig.get("class.name");
        String methodName = (String) springConfig.get("execute.method");
        System.out.println(className + ";;" + methodName);

        //根据类名称获取类对象
        Class clazz = Class.forName(className);
        //根据方法名称，获取方法对象
        Method m = clazz.getMethod(methodName);
        //获取构造器
        Constructor c = clazz.getConstructor();
        //根据构造器，实例化出对象
        Object service = c.newInstance();
        //调用对象的指定方法
        m.invoke(service);

    }
}
