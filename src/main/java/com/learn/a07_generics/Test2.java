package com.learn.a07_generics;

/**
 * 泛型方法
 * 定义一个方法可以接收任意类型的参数，打印其内容后，返回该数据
 */
public class Test2 {

    /**
     * 使用泛型
     *  1、不需要强转
     * @param t
     * @return
     * @param <T>
     */
    public static <T> T print1(T t) {
        System.out.println(t);
        return t;
    }

    /**
     * 不使用泛型
     *   1、只能借助object类
     *   2、返回类型需要强转才能用
     * @param o
     * @return
     */
    public static Object print2(Object o) {
        System.out.println(o);
        return o;
    }

    public static void main(String[] args) {
        Float o = (Float)print2(3.14f);
        String str1 = (String)print2("str1");
        System.out.println("##############################");
        Float aFloat = print1(3.14f);
        String str11 = print1("str1");
    }
}
