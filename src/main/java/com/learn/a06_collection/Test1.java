package com.learn.a06_collection;


import java.util.*;

/**
 * 遍历collection接口下集合的方法【List和Set】
 * <p>
 * 以ArrayList为例
 */
public class Test1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        /*第一种:利用重写的toString*/
        System.out.println(list);
        /*第二种：转数组*/
        for (Object o : list.toArray()) {
            System.out.println(o);
        }
        /*第三种：list.get(i)*/
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        /*第四种：增强for循环*/
        for (String s : list) {
            System.out.println(s);
        }
        /*第五种：迭代器*/
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        /*测试反向遍历*/
        System.out.println("###########");
        ListIterator<String> listIterator = list.listIterator();
        //将指针移到最后
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
            listIterator.add("11"); //可以添加
            //list.add("22"); // 报错 ConcurrentModificationException,ArrayList源码中add方法，通过modCount变量，控制版本
        }
        //反向遍历
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }


    }
}
