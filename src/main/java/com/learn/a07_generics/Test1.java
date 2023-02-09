package com.learn.a07_generics;

import com.learn.a10_io.User;

import java.util.ArrayList;

/**
 * 泛型的一个作用：限定集合的数据类型
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("aa");
        list.add(1);
        list.add(new User("张三",1));
    }
}
