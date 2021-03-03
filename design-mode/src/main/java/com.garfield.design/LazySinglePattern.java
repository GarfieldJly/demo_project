package com.garfield.design;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jingliyuan
 * @date 2021/1/8
 * 懒汉式单例 单例模式
 * 缺点：加锁后比较消耗内存
 */
public class LazySinglePattern {
    // 保证在所有线程中同步
    private static volatile LazySinglePattern singleMode;

    //私有的构造方法，避免外部类实例化
    private LazySinglePattern(){

    }

    public synchronized LazySinglePattern getInstance(){
        if(singleMode == null){
            singleMode = new LazySinglePattern();
        }
        return singleMode;
    }

    public static void main(String[] args) {
        /**
         * 个数超过1000的处理
         */
        int count = 2;
        List<String> idList = new ArrayList<>();
        idList.add("1");
        idList.add("2");
        idList.add("3");
        idList.add("4");
        idList.add("5");

        int listSize = idList.size();
        for (int i = 0; i < listSize; i+= count) {
            int toIndex = (i + count > listSize ) ? listSize : (i + count);
            List<String> subIdList = idList.subList(i,toIndex);
            for(String temp : subIdList){
                System.out.println(temp);
            }
        }

    }


}
