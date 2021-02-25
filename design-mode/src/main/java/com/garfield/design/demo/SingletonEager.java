package com.garfield.design.demo;

import javax.swing.*;
import java.awt.*;

/**
 * @author jingliyuan
 * @date 2021/1/8
 */
public class SingletonEager {
    public static void main(String[] args) {
        JFrame jf = new JFrame("饿汉单例模式测试");
        jf.setLayout(new GridLayout(1, 2));
        Container contentPane = jf.getContentPane();
        ZhuBaJie obj1 = ZhuBaJie.getInstance();
        contentPane.add(obj1);
        ZhuBaJie obj2 = ZhuBaJie.getInstance();
        contentPane.add(obj2);
        if (obj1 == obj2) {
            System.out.println("他们是同一人！");
        } else {
            System.out.println("他们不是同一人！");
        }
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
