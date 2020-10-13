package com.garfield.function.demo;

import com.garfield.function.config.ReetrantInterface;
import lombok.Data;

/**
 * @author jingliyuan
 * @date 2020/8/19
 */
@Data
public class Student {
    private String name;

    public String getCustomName(ReetrantInterface reetrantInterface){
        return reetrantInterface.getName();
    }

    public static void main(String[] args) {
        Student student = new Student();
        //没有传参，有返回值
        String name = student.getCustomName(() ->{
           return "gafield";
        });
        student.setName(name);
        System.out.println("name is ："+student.getName());
    }
}
