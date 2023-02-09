package com.learn.a02_common_class;

public class ObjectTest {
    public static void main(String[] args) {
        /*
         *测试toString
         */
        int[] a = {1,2};
        System.out.println(a);
        System.out.println(a.getClass().getName() + '@' + Integer.toHexString(a.hashCode()) );

        byte[] bytes = {97};
        String s = new String(bytes);
        System.out.println(s);

        char[] chars = {65};
        String c = new String(chars);
        System.out.println(c);
    }
}
