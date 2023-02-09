package com.learn.a09_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 动态创建对象
 * @author adouer
 *
 */
public class Test04 {

	public static void main(String[] args) throws Exception {
		Class c1 = Class.forName("com.learn.a09_reflection.User");
		/*
		 * 调用无参构造创建对象
		 */
		//获取class对象
		User user1 = (User) c1.newInstance();	
		System.out.println(user1);
		/*
		 * 调用有参构造创建对象
		 */
		Constructor constructor = c1.getConstructor(String.class,int.class);
		User user2 = (User) constructor.newInstance("adouer2",18);
		System.out.println(user2);
		/*
		 * 通过反射获取方法
		 */
		Method setName = c1.getDeclaredMethod("setName",String.class);
		setName.invoke(user1, "adouer1");	//invoke激活
		System.out.println(user1);
		/*
		 * 通过反射获取操作属性
		 */
		User user3 = (User) c1.newInstance();
		Field name = c1.getDeclaredField("name");
		name.setAccessible(true);	//类外不能直接操作私有属性，通过设置true，关闭安全检测
		name.set(user3, "adouer3");
		System.out.println(user3);
	}
}
