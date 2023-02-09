package com.learn.a01_array;

import com.learn.a03_oop.a03_polymorphism.Circle;

/**
 *初始化数组的3种方式
 * @author adouer
 *
 */
public class LearnArray {

	public static void main(String[] args) {
		/**
		 * 数组初始化
		 */
		//定义
		String[] a = new String[3];
		//定义并初始化
		String[] c = new String[] {"1","1","1"};
		//简写
		String[] b = {"1","1","1"};

		
		a[1] = "1";
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		/**
		 * 数组存放引用数据类型
		 */
		Circle[] dd = new Circle[3];
		Circle bb = new Circle("园1", 6);
		dd[1] = bb;
		
	}
}
