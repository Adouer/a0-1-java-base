package com.learn.a06_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 测试Map接口及遍历
 */
public class Test4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "张三");
        map.put(2, "李四");
        map.put(3, "王五");

        /* 遍历方式一：keySet()*/
        Set<Integer> keySet = map.keySet();
        for (Integer k : keySet) {
            String v = map.get(k);
            System.out.println("k = " + k + ",v=" + v);
        }
        /*keySet()+迭代器*/
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Integer k = iterator.next();
            System.out.println("k = " + k + "v=" + map.get(k));
        }
        /*遍历方式二：entrySet*/
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key = " + key + ",v=" + value);
        }
        /*entrySet()+迭代器*/
        Iterator<Map.Entry<Integer, String>> ei = entrySet.iterator();
        while (ei.hasNext()) {
            Map.Entry<Integer, String> entry = ei.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key = " + key + ",v=" + value);
        }
    }
}
