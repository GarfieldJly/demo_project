package com.garfield.reflex;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author jingliyuan
 * @date 2020/8/26
 */
public class HeroPlus {
    public String name;
    public float hp;
    public int damage;
    public int id;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public HeroPlus(){

    }
    public HeroPlus(String string) {
        name =string;
    }

    @Override
    public String toString() {
        return "Hero [name=" + name + "]";
    }
    public boolean isDead() {
        // TODO Auto-generated method stub
        return false;
    }
    public void attackHero(HeroPlus h2) {
        System.out.println(this.name+ " 正在攻击 " + h2.getName());
    }

    /**
     *      getField和getDeclaredField的区别
     *    getField 只能获取public的，包括从父类继承来的字段。
     *    getDeclaredField 可以获取本类所有的字段，包括private的，但是 不能获取继承来的字段。
     *    (注： 这里只能获取到private的字段，但并不能访问该private字段的值,除非加上setAccessible(true))
     */
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //获取成员变量并使用
        HeroPlus heroPlus = new HeroPlus();
        heroPlus.setName("garfield");
        Class<? extends HeroPlus> heroPlusClass = heroPlus.getClass();
        Field nameField = heroPlusClass.getDeclaredField("name");
        nameField.set(heroPlus,"jiafeimao");
        System.out.println("得到的名称:"+heroPlus.getName());

        //获取成员方法并使用
        Method method = heroPlusClass.getMethod("setName", String.class);
        method.setAccessible(true);
        method.invoke(heroPlus,"蓝猫");
        System.out.println("获取成员方法并使用:"+heroPlus.getName());
    }
}

