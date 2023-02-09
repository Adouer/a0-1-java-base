package com.learn.a07_generics;

import com.learn.a10_io.User;

import java.util.ArrayList;
import java.util.List;

/**
 * 通配符
 */
public class Test5 {
    public static void main(String[] args) {
        //自定义集合
        ArrayList<User> users = new ArrayList<>();
        //Integer是Number的子类
        ArrayList<Integer> integers = new ArrayList<>();
        /*任意类型都能传入*/
        print1(users);
        print1(integers);
        /*能传入Number类型及子类*/
        print2(integers);
    }

    /**
     * ?表示任意类型
     * @param list
     */
    static void print1(List<?> list){
    }

    /**
     * Number及其子类【设置上限】
     * @param list
     */
    static void print2(List<? extends Number> list){
    }
}
