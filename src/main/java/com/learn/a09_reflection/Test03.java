package com.learn.a09_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 获取类的运行时结构
 *
 * @author adouer
 */
public class Test03 {


    public static void main(String[] args) throws Exception {
        Class c1 = Class.forName("com.learn.a09_reflection.User");
        /**
         * 获取属性
         */
        System.out.println("获取属性");
        Field[] fields = c1.getFields();    //获取public的修饰的属性
        for (Field field : fields) {
            System.out.println("getFields--" + field);
        }
        Field[] declaredFields = c1.getDeclaredFields();    //获取全部属性
        for (Field field : declaredFields) {
            System.out.println("getDeclaredFields--" + field);
        }
        System.out.println("******");
        Field declaredField = c1.getDeclaredField("name");//获取指定属性
        System.out.println(declaredField);
        /**
         * 获取方法
         */
        System.out.println("获取方法");
        Method[] methods = c1.getMethods();        //获取本类及父类的public方法
        for (Method method : methods) {
            System.out.println("getMethods--" + method);
        }
        Method[] declaredMethods = c1.getDeclaredMethods();    //获取本类的全部方法
        for (Method method : declaredMethods) {
            System.out.println("getDeclaredMethods--" + method);
        }
        Method getName = c1.getDeclaredMethod("getName", null);    //获取指定方法
        Method setName = c1.getDeclaredMethod("setName", String.class);    //获取指定方法
        System.out.println(getName);
        System.out.println(setName);
        /**
         * 获取构造器
         */
        System.out.println("获取构造器");
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        Constructor[] declaredConstructors = c1.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructors) {
            System.out.println(constructor);
        }
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class);
        System.out.println(declaredConstructor);
    }
}
