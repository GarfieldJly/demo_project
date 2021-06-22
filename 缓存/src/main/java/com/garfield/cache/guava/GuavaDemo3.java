package com.garfield.cache.guava;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;

import javax.swing.text.html.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;

/**
 * Guava 的使用 https://blog.csdn.net/wwwdc1012/article/details/82228458
 *
 * @author zhaojian
 * @date 2021/6/22
 */
public class GuavaDemo3 {
    public static void main(String[] args) {
//        testMap1();
//        testMap2();
//        testCollection();
        testJoin();
//        testFilter();
    }

    //当我们需要一个map中包含key为String类型，value为List类型的时候
    private static void testMap1(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Map<String,List> map = new HashMap<>();
        map.put("garfield",list);
        System.out.println(map);
    }

    //使用guava包里的类
    private static void testMap2(){
        Multimap<String,Integer> multimap = ArrayListMultimap.create();
        multimap.put("garfield",1);
        multimap.put("garfield",2);
        System.out.println(multimap);
    }

    private static void testCollection(){
        //MultiSet: 无序+可重复   count()方法获取单词的次数  增强了可读性+操作简单
        Multiset<Integer> multiset = HashMultiset.create();
        multiset.add(2);
        multiset.add(3);
        multiset.add(2);
        System.out.println(multiset.count(2));

        //Multimap: key-value  key可以重复
//        Multimap<String ,Integer> multimap = HashMultimap.create();
        Multimap<String ,Integer> multimap = ArrayListMultimap.create();
        multimap.put("garfield",8);
        multimap.put("garfield",9);
        System.out.println(multimap);

//        BiMap: 双向Map(Bidirectional Map) 键与值都不能重复
        BiMap biMap = HashBiMap.create();
        biMap.put("garfield",7);
        biMap.put("garfield",7);
        System.out.println(biMap);

    }

    private static void testJoin(){
        ///str 为-aa-bb-cc
        ////use guava
        List<String> list = new ArrayList<String>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        String join = Joiner.on("-").join(list);
        System.out.println(join);

        // result为 xiaoming=12,xiaohong=13
        Map<String, Integer> map = Maps.newHashMap();
        map.put("xiaoming", 12);
        map.put("xiaohong",13);
        String join1 = Joiner.on(",").withKeyValueSeparator("=").join(map);
        System.out.println(join1);

        //将String转换为特定的集合,list为  [1, 2, 3, 4, 5, 6]
        String str = "1-2-3-4-5-6";
        List<String> listSplitter = Splitter.on(",").splitToList(str);
        System.out.println(listSplitter);
    }

    private static void testFilter(){
//        set的交集, 并集, 差集
        HashSet setA = Sets.newHashSet(1,2,3,4,5);
        HashSet setB = Sets.newHashSet(4,5,6,7,8);

        //求并集
        Sets.SetView setViewUnion = Sets.union(setA,setB);
        System.out.println("并集:"+setViewUnion);

        Sets.SetView difference = Sets.difference(setA, setB);
        System.out.println("差集:"+difference);

        Sets.SetView intersection = Sets.intersection(setA, setB);
        System.out.println("交集:"+intersection);


        //map的交集，并集，差集
        HashMap<String, Integer> mapA = Maps.newHashMap();
        mapA.put("a", 1);
        mapA.put("b", 2);
        mapA.put("c", 3);

        HashMap<String, Integer> mapB = Maps.newHashMap();
        mapB.put("b", 20);
        mapB.put("c", 3);
        mapB.put("d", 4);

        MapDifference<String, Integer> differenceMap = Maps.difference(mapA, mapB);
        Map entriesDiffering = differenceMap.entriesDiffering();
        Map entriesOnlyLeft = differenceMap.entriesOnlyOnLeft();
        Map entriesOnlyRight = differenceMap.entriesOnlyOnRight();
        Map entriesInCommon = differenceMap.entriesInCommon();

        System.out.println(entriesDiffering);   // {b=(2, 20)}
        System.out.println(entriesOnlyLeft);    // {a=1}
        System.out.println(entriesOnlyRight);   // {d=4}
        System.out.println(entriesInCommon);    // {c=3}

    }

}
