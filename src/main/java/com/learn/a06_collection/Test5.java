package com.learn.a06_collection;

import com.learn.a10_io.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections+Comparator
 */
public class Test5 {
    public static void main(String[] args) {
        List<User> list = new ArrayList<User>();
        User user0 = new User("张三", 1);
        User user1 = new User("李四", 9);
        User user2 = new User("王五", 6);
        list.add(user0);
        list.add(user1);
        list.add(user2);
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge(); //升序
            }
        });
        System.out.println("list = " + list); //list = [User [name=张三, age=1], User [name=王五, age=6], User [name=李四, age=9]]
    }
}
