package com.learn.a06_collection;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 需要排序的实体类，实现Comparable接口+重写compareTo方法
 */
public class Test3 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<User>();
        User user0 = new User("张三", 1);
        User user1 = new User("李四", 9);
        User user2 = new User("王五", 6);
        list.add(user0);
        list.add(user1);
        list.add(user2);
        Object[] array = list.toArray();
        //使用数组工具类排序
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}

/**
 * 方法二：实现Comparable接口+重写compareTo方法
 */
class User implements Comparable<User> {
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

    @Override
    public int compareTo(User o) {
        return this.getAge() - o.getAge(); //升序
    }
}