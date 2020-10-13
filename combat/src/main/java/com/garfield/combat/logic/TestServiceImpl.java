package com.garfield.combat.logic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jingliyuan
 * @date 2020/9/25
 */
@Service
public class TestServiceImpl {
    List<String> list1 = new ArrayList<>();
    List<String> list2 = new ArrayList<>();

    public void test(){
        list1.clear();
        list1.add("aa");
        list2.add("bb");
    }

    public List<String> getList1() {
        return list1;
    }

    public void setList1(List<String> list1) {
        this.list1 = list1;
    }

    public List<String> getList2() {
        return list2;
    }

    public void setList2(List<String> list2) {
        this.list2 = list2;
    }
}
