package 单例模式;

import javax.swing.*;
import java.awt.*;

/**
 * @author jingliyuan
 * @date 2021/1/8
 */
public class 饿汉式单例模式 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("饿汉单例模式测试");
        jf.setLayout(new GridLayout(1, 2));
        Container contentPane = jf.getContentPane();
        ZhuBaJie obj1 = ZhuBaJie.getInstance();
        contentPane.add(obj1);
        ZhuBaJie obj2 = ZhuBaJie.getInstance();
        contentPane.add(obj2);
        //会输出“他们是同一人”，因为饿汉模式在类实例化之前已经创建了
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
