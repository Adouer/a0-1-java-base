package com.learn.a00_base;

/**
 * 测试函数.
 */
public class FunctionTest {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

    }

    /**
     * 递归累和
     *
     * @param num the num
     * @return the int
     */
    public static int sum(int num) {
        if (num==1) {
            return 1;
        }else {
            return sum(num-1)+num;
        }
    }


    /**
     * 递归累乘
     *
     * @param num the num
     * @return the int
     */
    public static int mul(int num) {
        if (num==1) {
            return 1;
        }else {
            return mul(num-1)*num;
        }
    }
}
