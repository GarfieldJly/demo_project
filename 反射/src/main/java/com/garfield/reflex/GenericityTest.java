package com.garfield.reflex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author jingliyuan
 * @date 2020/8/26
 * 通过反射越过泛型检查
 *   https://blog.csdn.net/lililuni/article/details/83449088
 */
public class GenericityTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");

        Class clazz = list.getClass();
        Method method = clazz.getMethod("add",Object.class);
        method.invoke(list,88);
//    //Consumer是个消费型函数,两个::是引用一个类的方法,就是把print方法当做参数传过去了
        //会报类型转换错误
        list.forEach(System.out::println);
        //遍历集合
        for (Object obj : list) {
            System.out.println(obj);
        }

//        ArrayList<String> list = new ArrayList<>();
//        list.add("this");
//        list.add("is");
//
//        //	strList.add(5);报错
//
//        /********** 越过泛型检查    **************/
//
//        //获取ArrayList的Class对象，反向的调用add()方法，添加数据
//        Class listClass = list.getClass();
//        //获取add()方法
//        Method m = listClass.getMethod("add", Object.class);
//        //调用add()方法
//        m.invoke(list, 5);
//
//        //遍历集合
//        for (Object obj : list) {
//            System.out.println(obj);
//        }
    }
}
