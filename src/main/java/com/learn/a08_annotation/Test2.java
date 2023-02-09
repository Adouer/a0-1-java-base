package com.learn.a08_annotation;

/**
 * 内置注解
 *
 * @author adouer
 */
public class Test2 {

    public static void main(String[] args) {
        test1();
    }

    /**
     * @Override 重写注解
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * @Deprecated 废弃
     */
    @Deprecated
    public static void test1() {
        System.out.println("Deprecated");
    }

    /**
     * @SuppressWarnings 镇压警告
     */
    @SuppressWarnings("all")
    public static void test2() {
        System.out.println("SuppressWarnings");
    }


}
