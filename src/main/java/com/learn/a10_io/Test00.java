package com.learn.a10_io;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * 测试FileFilte和FilenameFilter
 * 功能：过滤出指定目录下的xml文件
 * 为了直观这里不写Lambda
 */
public class Test00 {
    public static void main(String[] args) {
        /*FileFilter过滤出指定目录下的.xml文档*/
        File file = new File("E:\\Jetbrins\\idea\\workspace\\a0-1-java-base\\.idea");
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                //pathname是.idea下的所有文件
                if (pathname.getName().endsWith(".xml")) {
                    return true;
                }
                return false;
            }
        });
        for (File f : files) {
            System.out.println(f.getName());
        }
        System.out.println("################");
        /*FilenameFilter过滤出指定目录下的.xml文档*/
        File[] files1 = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                //dir是.idea文件夹，name是.idea文件夹下的所有文件名
                if (name.endsWith(".xml")) {
                    return true;
                }
                return false;
            }
        });
        for (File f1 : files1) {
            System.out.println(f1.getName());
        }
    }
}
