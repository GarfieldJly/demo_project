package com.garfield.combat.controller;

import com.garfield.combat.logic.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jingliyuan
 * @date 2020/9/25
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestServiceImpl testService;

    @GetMapping("/dog")
    public void dog() {
        testService.test();
        System.out.println(testService.getList1().size());
    }


    List list = new ArrayList<>();

    @GetMapping("/cat")
    public void test() {
        list.add("aa");
    }

    @GetMapping("/size")
    public Integer get() {
        return list.size();
    }
}
