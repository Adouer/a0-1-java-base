package com.learn.a03_oop.a03_polymorphism;

import org.junit.Test;
/**
 * 测试多态类
 * @author adouer
 *
 */
public class Test1 {
	@Test
	public void test() {
		Shape s = new Circle("圆形" , 2);
		print(s);
		s = new Triangle("三角形" , 3 , 4);
		print(s);
		
		print(getShape(1));
		print(getShape(2));
		print(getShape(3));
	}
	/**
	 *方法传参时，传入抽象类类型
	 * @param shape
	 */
	public void print(Shape shape) {
		System.out.println("形状：" + shape.name + " 面积：" + shape.getArea());
	}
	/**
	 * 方法返回时，返回抽象类型
	 * @param type
	 * @return
	 */
	public Shape getShape(int type) {
		
		switch (type) {
		case 1:
			return new Circle("圆形" , 2);
		case 2:
			return  new Triangle("三角形" , 3 , 4);
		default:
			System.out.println("选择正确 类型（1或者2）");
			return null;
		}
	}
}
