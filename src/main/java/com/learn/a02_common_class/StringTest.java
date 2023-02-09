package com.learn.a02_common_class;

public class StringTest {
    public static void main(String[] args) {
        /*改变对象指向和改变对象内容*/
        String s = "good";
        char[] ch = {'a', 'b', 'c'};
        change(s, ch);
        System.out.println(s); //good
        System.out.println(ch); //xbc
        /*测试replace*/
        String o = s.replace('o', '1');
        String s1 = s.replaceAll("oo", "dd");
        System.out.println(o); //g11d
        System.out.println(s1); //gddd
        /*split*/
        String s3 = "g,o,o,d";
        String[] split = s3.split(",");
        for (String sp : split) {
            System.out.println(sp);
        }
    }

    static void change(String s, char ch[]) {
        s = "well";
        ch[0] = 'x';
    }
}
