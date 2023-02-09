package com.learn.a00_base;

/**
 * 三目运算符
 */
public class Ternary {
    public static void main(String[] args) {
        int a = 11, b = 30;
        System.out.println((a++ & ++b) > 10 ? a++ : ++b);//12
        System.out.println("a=" + a + " b=" + b);//a=13 b=31

        int x = 6;
        System.out.println(x > 10 ? 9.9 : 9);//表达式，有整数有小数，所以把最后的9转化成9.0[【小数默认是double，8位，整数4位，所以转大的，所以结果是小数】
    }
}
