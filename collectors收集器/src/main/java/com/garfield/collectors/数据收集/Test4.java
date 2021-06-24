package com.garfield.collectors.数据收集;

import org.assertj.core.util.Lists;

import java.util.Iterator;
import java.util.List;

/**
 * Test4
 *
 * @author zhaojian
 * @date 2021/6/24
 */
public class Test4 {
    public static void main(String[] args) {
        removeList();
    }
    private static void removeList(){
        List list = Lists.list(1,3,8,46,9);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Integer next = (Integer) iterator.next();
            if(46 == next){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
