package com.garfield.reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author jingliyuan
 * @date 2020/8/26
 */
public class Hero {
    public String name;
    public float hp; //血量
    public float armor; //护甲
    public int moveSpeed; //移动速度

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class的三种方式
        //在一个JVM中，一个类只会有一个类对象存在。所以以上三种方式取出来的类对象，都是一样。
        Class<?> hero = Class.forName("com.garfield.reflex.Hero");
        System.out.println(hero);
        Class<Hero> heroClass = Hero.class;
        System.out.println(heroClass);
        Class<? extends Hero> aClass = new Hero().getClass();
        System.out.println(aClass);

        //2.获取所有公有构造方法
        Constructor<?>[] constructors = heroClass.getConstructors();
        System.out.println(String.format("公有构造方法:%d个",constructors.length));

        System.out.println("************所有的构造方法(包括：私有、受保护、默认、公有)***************");
        Constructor<?>[] declaredConstructors = heroClass.getDeclaredConstructors();
        System.out.println(String.format("所有的构造方法:%d个",declaredConstructors.length));

        System.out.println("*****************获取公有、无参的构造方法*******************************");
        Constructor<Hero> constructor = heroClass.getConstructor(null);
        Hero hero1 = constructor.newInstance();
        System.out.println("公有、无参的构造方法" + hero1);

        System.out.println("******************获取私有构造方法，并调用*****************************");
        Constructor<Hero> declaredConstructor = heroClass.getDeclaredConstructor(float.class);
        declaredConstructor.setAccessible(true);
        Hero hero2 = declaredConstructor.newInstance(20f);

    }

    //---------------构造方法-------------------
    //（默认的构造方法）
    Hero(String str){
        System.out.println("(默认)的构造方法 s = " + str);
    }

    //无参构造方法
    public Hero(){
        System.out.println("调用了公有、无参构造方法执行了。。。");
    }

    //有一个参数的构造方法
    public Hero(char name){
        System.out.println("姓名：" + name);
    }

    //有多个参数的构造方法
    public Hero(String name ,float hp){
        System.out.println("姓名："+name+"血量："+ hp);
    }

    //受保护的构造方法
    protected Hero(boolean n){
        System.out.println("受保护的构造方法 n = " + n);
    }

    //私有构造方法
    private Hero(float hp){
        System.out.println("私有的构造方法   血量："+ hp);
    }

}
