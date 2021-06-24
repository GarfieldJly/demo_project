package com.garfield.collectors.数据收集;

import com.garfield.collectors.bean.Student;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Test1
 *
 * @author zhaojian
 * @date 2021/6/17
 */
public class Test1 {
    public static void main(String[] args) {
//        buildCollection();
        buildMap();
    }

    private static void buildCollection() {
        //得到list
        List<Integer> list = Stream.of(1, 3, 5, 7, 9, 3).collect(Collectors.toList());
        System.out.println("list 的 size:" + list.size());
        //得到set
        Set<Integer> set = Stream.of(1, 3, 5, 7, 9, 3).collect(Collectors.toSet());
        System.out.println("set 的 size:" + set.size());
    }

    private static void buildMap() {
        Student s1 = new Student(1, "Amy");
        Student s2 = new Student(2, "Jone");
        Student s3 = new Student(3, "Rose");
        Student s4 = new Student(2, "Bruin");
        Student s5 = new Student();
        s5.setId(5).setName("Garfield");

        //串行得到map
        Map<Integer, Student> map1 = Stream.of(s1, s2, s3).collect(Collectors.toMap(Student::getId, Function.identity()));
        System.out.println("map1的值:" + map1);
        //并行得到map
        ConcurrentMap<Integer, Student> map2 = Stream.of(s1, s2, s3).parallel().collect(Collectors.toConcurrentMap(Student::getId, Function.identity()));
        System.out.println("map2的值:" + map2);
        //如果key重复的该怎么处理？这里我们假设有两个id相同Student，
        // 如果他们id相同，在转成Map的时候，取name大一个，小的将会被丢弃
        Map<Integer, Student> map3 = Stream.of(s1, s2, s3, s4).collect(Collectors.toMap(Student::getId, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(Student::getName))));
        System.out.println("map3的值:" + map3);
        //得到自定义的map
        LinkedHashMap<Integer, Student> map4 = Stream.of(s1, s4, s3, s2).collect(Collectors.toMap(Student::getId, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(Student::getName)), LinkedHashMap::new));
        System.out.println("map4的值:" + map4);
    }

}
