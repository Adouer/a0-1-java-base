package com.learn.a05_exception;

/**
 * 测试throw 、finally执行顺序
 */
public class TestException {

    public static String output = "";

    public static void foo(int i) {

        try {

            if (i == 7) {
                throw new Exception();
               // output += "A";//始终不执行，因为，前一句是throw，如果被捕获，则跳过这句执行捕获的语句，如果没有捕获，则抛出去，也不会执行这句话
            }

            output += "A";

        } catch (Exception e) {

            output += "B";
            return;

        } finally {

            output += "C";
        }

        output += "D";
    }

    public static void main(String[] args) {

        foo(7);
        foo(8);
        System.out.println(output); //BCACD

    }
}