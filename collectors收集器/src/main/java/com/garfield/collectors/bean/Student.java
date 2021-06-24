package com.garfield.collectors.bean;

/**
 * Student
 *
 * @author zhaojian
 * @date 2021/6/17
 */
public class Student {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }
    //return对象本身，可以连着set赋值
    public Student setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }
}
