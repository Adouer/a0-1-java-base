package com.learn.a03_oop.a01_encapsulation;

/**
 * 枚举类
 */
public enum EnumPerson1 {
    // 相当于：public static final EnumPerson MALE = new EnumPerson("男"，18);
    MALE("男",18),FEMALE("女",17);
    private String gender;
    private int age;

    // 相当于private EnumPerson1(String gender){xx}
    EnumPerson1(String gender) {
        this.gender = gender;
    }

    EnumPerson1(String gender, int age) {
        this(gender);
        this.age = age;
    }

    public static void main(String[] args) {
        System.out.println(EnumPerson1.valueOf("MALE"));
        System.out.println(EnumPerson1.FEMALE);
        for (EnumPerson1 value : EnumPerson1.values()) {
            System.out.println(value);
        }
    }
}
