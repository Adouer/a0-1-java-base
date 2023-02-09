package com.learn.a03_oop.a01_encapsulation;

/**
 * 单例
 * 1.构造方法私有化
 * 2.创建实例
 * 3.对外提供获取实例的方法
 */
public class Singleton {

    /**
     * 1.构造方法私有化
     */
    private Singleton() {
    }

    /**
     * 2.创建实例
     */
    private static Singleton instance; //懒汉模式
//    private static Singleton instance = new Singleton(); // 饿汉模式

    /**
     * 3.对外提供获取实例的方法【懒汉模式】
     *
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * 3.对外提供获取实例的方法【饿汉模式】
     * @return
     */
/*
    public static Singleton getInstance() {
        return instance;
    }
*/

}
