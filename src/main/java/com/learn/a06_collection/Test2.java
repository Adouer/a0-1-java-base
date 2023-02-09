package com.learn.a06_collection;

import java.util.ArrayList;
import java.util.Comparator;
import com.learn.a10_io.User;

/**
 * 自定义比较器Comparator + compare 方法
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<User>();
        User user0 = new User("张三", 1);
        User user1 = new User("李四", 9);
        User user2 = new User("王五", 6);
        list.add(user0);
        list.add(user1);
        list.add(user2);
        list.sort(new MyCompare());
        System.out.println("list = " + list); //list = [User [name=张三, age=1], User [name=王五, age=6], User [name=李四, age=9]]
    }
}

/**
 * 方法一：自定义比较器
 */
class MyCompare implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getAge() - o2.getAge();
    }
}

