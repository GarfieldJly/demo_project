package com.garfield.collectors.聚合归约;

import com.garfield.collectors.bean.Student;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Test
 *
 * @author zhaojian
 * @date 2021/6/17
 */
public class Test2 {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
        test5();
    }

    private static void test1() {
        Student s1 = new Student(1, "Amy");
        Student s2 = new Student(2, "Jone");
        Student s3 = new Student(3, "Rose");
        Student s4 = new Student(2, "Bruin");
        //nameStr1 的值AmyJoneRoseBruin
        String nameStr1 = Stream.of(s1, s2, s3, s4).map(Student::getName).collect(Collectors.joining());
        System.out.println("nameStr1 的值" + nameStr1);

        //nameStr2的值:[Amy$Jone$Rose$Bruin]
        String nameStr2 = Stream.of(s1, s2, s3, s4).map(Student::getName).collect(Collectors.joining("$", "[", "]"));
        System.out.println("nameStr2的值:" + nameStr2);
    }

    private static void test2() {
        long count1 = Stream.of(1, 3, 4, 0, 8, 6, 9).count();
        System.out.println("count:" + count1);

        Stream.of(1, 3, 4, 8, 6, 9).min(Integer::compareTo).ifPresent(System.out::println);
        Stream.of(1, 3, 4, 8, 6, 9).collect(Collectors.minBy(Integer::compareTo)).ifPresent(System.out::println);

    }

    private static void test3() {
        //IntSummaryStatistics{count=6, sum=31, min=1, average=5.166667, max=9}
        IntSummaryStatistics intSummaryStatistics = Stream.of(1, 3, 4, 8, 6, 9).collect(Collectors.summarizingInt(Integer::valueOf));
        long sum = intSummaryStatistics.getSum();
        System.out.println("sum:" + sum);

        Double avg = Stream.of(1, 3, 4, 8, 6, 9).collect(Collectors.averagingDouble(Integer::valueOf));
        System.out.println("avg:" + avg);
    }

    private static void test4() {
        Map<String, List<Integer>> map1 = Stream.of(-6, -7, -8, -9, 0, 1, 2, 3, 4, 5, 6).collect(Collectors.groupingBy(integer -> {
            if (integer < 0) {
                return "小于";
            } else if (integer == 0) {
                return "等于";
            } else {
                return "大于";
            }
        }));
        System.out.println("map1:" + map1);

        LinkedHashMap<String, Set<Integer>> map2 = Stream.of(-6, -7, -6, -8, -9, 1, 2, 3, 4, 5, 6)
                .collect(Collectors.groupingBy(integer -> {
                            if (integer < 0) {
                                return "小于";
                            } else if (integer == 0) {
                                return "等于";
                            } else {
                                return "大于";
                            }
                        }
                        , LinkedHashMap::new, Collectors.toSet()));
        System.out.println("map2:" + map2);
    }

    private static void test5(){
        String moneyStr = "8.89";
        BigDecimal bigDecimal = new BigDecimal(moneyStr);
        int money = bigDecimal.multiply(new BigDecimal(100)).intValue();
        System.out.println(money);
    }


}
