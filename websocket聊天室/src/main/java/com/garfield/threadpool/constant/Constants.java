package com.garfield.threadpool.constant;

import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author jingliyuan
 * @date 2020/8/12
 */
public class Constants {
    public static CopyOnWriteArraySet<Integer> idSet = new CopyOnWriteArraySet();
    static {
        idSet.add(1);
        idSet.add(2);
        idSet.add(3);
        idSet.add(4);
        idSet.add(5);
    }
}
