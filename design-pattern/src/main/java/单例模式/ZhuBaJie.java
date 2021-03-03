package 单例模式;

import javax.swing.*;

/**
 * @author jingliyuan
 * @date 2021/1/8
 */
public class ZhuBaJie extends JPanel {
    private static ZhuBaJie instance = new ZhuBaJie();
    private ZhuBaJie() {
        JLabel l1 = new JLabel(new ImageIcon("H:\\workspace\\demo_project\\design-mode\\target\\BaJie.png"));
        this.add(l1);
    }
    public static ZhuBaJie getInstance() {
        return instance;
    }
}
