package com.learn.a10_io;

import java.io.PrintStream;

/**
 * PrintStream(打印字节流)：字节流-->OutputStream-->FilterOutputStream((节点流\过滤流))-->PrintStream
 * (1)可以打各种数据类型的字符串和对象
 * (2)System.setOut和ps.close();之间的会被但因到文件中
 *
 * @author adouer
 */
public class Test6 {

    public static void main(String[] args) throws Exception {
        PrintStream ps = new PrintStream("d:/5.txt");
        System.out.println("Aouer控制台");    //打印到控制台

        System.setOut(ps);
        System.out.println("Adouer文件夹 ");    //打印到文件
        System.out.println("Adouer文件夹1");    //打印到文件
        ps.close();

    }
}
