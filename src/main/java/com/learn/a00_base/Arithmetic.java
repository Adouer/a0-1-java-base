package com.learn.a00_base;

/**
 * 算数运算符
 */
public class Arithmetic {
    public static void main(String[] args) {
        /*测试字符拼接*/
        System.out.println(1 + 2 + 3 + "a" + 4 + 5 + 6);//6a456

        /*测试除法*/
        System.out.println(10/3);//3
        System.out.println(1/3);//0
        System.out.println(10.0/3); //3.3333333333333335
        System.out.println(10/3.0); //3.3333333333333335

        /*测试取模*/
        System.out.println(10%3);//1
        System.out.println(1%3);//1
        System.out.println(10.0%3); //1.0
        System.out.println(10%3.0); //1.0
        System.out.println(-10%3); //-1
        System.out.println(10%-3); //1
    }
}
