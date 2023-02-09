package com.learn.a03_oop.a02_inheritance;

public class Person {
    String name;
    Integer age;

    public Person(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("Person--show");
    }


}
