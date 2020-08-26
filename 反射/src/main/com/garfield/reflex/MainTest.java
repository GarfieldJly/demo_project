package com.garfield.reflex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author jingliyuan
 * @date 2020/8/26
 */
public class MainTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //获取HeroPlus 类的main() 并使用
        HeroPlus heroPlus = new HeroPlus();
        Class<? extends HeroPlus> heroPlusClass = heroPlus.getClass();
        Method method = heroPlusClass.getMethod("main", String[].class);
        method.setAccessible(true);
        //第一个参数，对象类型，因为方法是static静态的，所以为null可以，第二个参数是String数组，
        // 这里要注意在jdk1.4时是数组，jdk1.5之后是可变参数
        //这里拆的时候将  new String[]{"a","b","c"} 拆成3个对象。所以需要将它强转。
        method.invoke(null,(Object) new String[]{"蓝猫","布偶猫"});
    }
}
