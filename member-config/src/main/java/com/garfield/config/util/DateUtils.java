package com.garfield.config.util;

import com.garfield.config.bean.Student;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

/**
 * @author jingliyuan
 * @date 2021/1/19
 */
public class DateUtils {
    /**
     * Date 转LocalDate
     * @param date
     * @return
     */
    public static LocalDate dateToLocalDate(Date date){
        if(ObjectUtils.isEmpty(date)){
            return null;
        }
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static void main(String[] args) {
//        Date date = new Date();
//        LocalDate localDate = dateToLocalDate(date);
//        System.out.println(localDate);

//        String female = "yuanyuan";
//        String male = "xiongzai";
//        String female2 = "yuanyuan";
//        String male2 = "xiongzai";
//        List<String> list = new ArrayList<>();
//        list.add(female);
//        list.add(male);
//        list.add(female2);
//        list.add(male2);
//        String joinValue = getJoinValue(list);
//        System.out.println("joinValue 的值是:"+joinValue);

//        List<String> removeList = removeValue(list, "yuanyuan");
//        removeList.stream().forEach(System.out::println);

//        Student student1 = new Student();
//        student1.setName("yuanyuan");
//        student1.setAge(30);
//
//        Student student2 = new Student();
//        student2.setName("xiongzai");
//        student2.setAge(34);
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(student1);
//        studentList.add(student2);
//        List<String> studentNameList = getStudentNameList(studentList);
//        studentNameList.stream().forEach(System.out::println);

//        String item = null;
//        boolean flag = stringHasText(item);
//        System.out.println("测试hasText方法:"+flag);

        Object obj = "{}";
        if(obj instanceof String){
            System.out.println("String");
        }
        HashMap<String,String> map = (HashMap<String, String>) obj;
        System.out.println(map);

    }

    public static String getJoinValue(List<String> list){
        return String.join("@",list);
    }

    /**
     * 删除list里的元素
     */
    public static List<String> removeValue(List<String> list,String removeValue){
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.addAll(list);
        //todo 有问题
//        for (int i = 0; i < list.size(); i++) {
//            String item = (String) copyOnWriteArrayList.get(i);
//            if(removeValue.equals(item)){
//                copyOnWriteArrayList.remove(item);
//            }
//        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            String item = (String) iterator.next();
            if(removeValue.equals(item)){
                iterator.remove();
            }
        }
        return list;
    }

    /**
     * 返回id
     */
    public static String setId(){
        return  String.valueOf(UUID.randomUUID());
    }

    /**
     * List 对象转成 List<String>
     */
    public static List<String> getStudentNameList(List<Student> list){
        return list.stream().filter(s-> !StringUtils.isEmpty(s.getName())).map(student -> student.getName()).collect(Collectors.toList());
    }

    public static boolean stringHasText(String item){
        return StringUtils.hasText(item);
    }

}
