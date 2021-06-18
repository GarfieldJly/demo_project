package com.garfield.config.bean;

/**
 * Person
 *
 * @author zhaojian
 * @date 2021/6/1
 */
public class Person {
    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Person() {
    }

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
        System.out.println(this);
    }
}
