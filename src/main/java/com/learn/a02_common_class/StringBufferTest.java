package com.learn.a02_common_class;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("abc"); //abc
        buffer.insert(1,"x");//axbc
        buffer.delete(0,2);//bc
        buffer.replace(0,2,"abc");//abc
        buffer.reverse();//cba

        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        change(a, b);
        System.out.println(a); //AB
        System.out.println(b); //B
    }

    static void change(StringBuffer x, StringBuffer y)  {
        x.append(y);
        y = x;
    }
}
