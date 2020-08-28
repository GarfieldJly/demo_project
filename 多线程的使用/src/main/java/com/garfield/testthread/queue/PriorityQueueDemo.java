package com.garfield.testthread.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author jingliyuan
 * @date 2020/8/27
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() > o2.age ? -1 : 1;
            }
        });
        priorityQueue.add(new Student(19, "bb"));
        priorityQueue.add(new Student(20, "aa"));

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

    }
}

class Student {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
