package com.learn.a10_io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * File类
 */
public class Test0 {
    public static void main(String[] args) throws IOException {
        /*1.构造方法*/
        System.out.println("构造方法：");
        /*1.1路径*/
        File file = new File("/");
        System.out.println(file.getAbsolutePath()); //E:\
        File file1 = new File(".");
        System.out.println(file1.getAbsolutePath()); //E:\Jetbrins\idea\workspace\a0-1-java-base\.
        /*1.2路径分隔符*/
        File file2 = new File("E:/1.txt");
        File file3 = new File("E" + File.separator + "1.txt");

        /*2.创建*/
        System.out.println("创建：");
        System.out.println(file2.createNewFile());//true
        /*2.1创建一级目录*/
        File file4 = new File("E:/1");
        file4.mkdir();
        /*2.2创建多级目录*/
        File file5 = new File("E:/1/2/3");

        file5.mkdirs();
        /*3.改名和删除*/
        System.out.println("删除修改：");
        System.out.println(file4.delete()); //false 【非空文件夹不能直接删除】
        System.out.println(file5.delete()); //true
        File file6 = new File("E:/1/2");
        System.out.println(file6.renameTo(new File("E:/1/22")));//true【文件夹2该为22】

        /*4.判断*/
        System.out.println("判断：");
        System.out.println(file6.exists());//true
        System.out.println(file2.exists());//true
        System.out.println(file6.isDirectory());//true
        System.out.println(file2.isFile());//true

        /*5.获取*/
        System.out.println("获取：");
        /*5.1获取文件或文件夹名*/
        System.out.println(file3.getName());//1.txt
        /*5.2获取文件或文件夹的绝对路径*/
        System.out.println(file2.getAbsolutePath());//E:\1.txt
        /*5.3获取文件的字节大小*/
        System.out.println(file3.length());//0
        /*5.4获取父目录的路径名*/
        System.out.println(file2.getParent());//E:\
        /*5.5获取最后一次被修改的时间*/
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date(file4.lastModified());
        System.out.println(df.format(date));

        /*6.文件夹操作*/
        /*6.1返回指定目录下的所有文件名和目录名，保存在String数组中   常用*/
        String[] list = file1.list();
        for (String fileName : list) {
            System.out.println(fileName);
        }
        /*6.2返回指定目录下的文件对象和目录对象，保存在File数组中     常用*/
        File[] files = file1.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                System.out.println("文件名称" + f.getName()+"文件字节数" + f.length());
            }
            if (f.isDirectory()) {
                System.out.println("文件夹名称" + f.getName());
            }

        }
    }
}
