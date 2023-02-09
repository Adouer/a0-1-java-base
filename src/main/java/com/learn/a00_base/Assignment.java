package com.learn.a00_base;

/**
 * 赋值运算符
 */
public class Assignment {

    public static void main(String[] args) {
        int a = 2;
        a += a -= a * a;
        //a -= a*a; // 2-4=-2,
        //a += -2; //0 -2+2=0
        System.out.println(a); //0

        System.out.println(10<<3);
    }
}
