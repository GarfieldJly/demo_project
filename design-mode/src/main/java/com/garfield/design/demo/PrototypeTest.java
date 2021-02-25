package com.garfield.design.demo;

/**
 * @author jingliyuan
 * @date 2021/1/8
 */
public class PrototypeTest {
    public static void main(String[] args) {
        Realizetype realizetype1 = new Realizetype();
        try {
            Realizetype realizetype2 = (Realizetype) realizetype1.clone();
            if(realizetype1 == realizetype2){
                System.out.println("两个对象相同");
            }else{
                System.out.println("两个对象不同");
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
