package com.learn.a01_array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Arrays工具类学习
 */
public class LearnArrays {
    public static void main(String[] args) {

        User user0 = new User("张三", 1);
        User user1 = new User("张三", 9);
        User user2 = new User("张三", 6);
        User[] users = {user0, user1, user2};

        /* Arrays.sort+Comparator */
        Arrays.sort(users, new Comparator<User>() {
            @Override
            public int compare(User u0, User u1) {
                return u0.getAge() - u1.getAge(); //按照年龄升序
            }
        });
        /*toString和asList*/
        System.out.println(users); //[Lcom.learn.a01_array.User;@14ae5a5
        System.out.println(Arrays.toString(users)); //[User{name='张三', age=1}, User{name='张三', age=6}, User{name='张三', age=9}]
        System.out.println(Arrays.asList(users)); //[User{name='张三', age=1}, User{name='张三', age=6}, User{name='张三', age=9}]
    }
}

class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}