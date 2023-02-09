package com.learn.a03_oop.a03_polymorphism;

/**
 * 多态子类（圆）
 *
 * @author adouer
 */
public class Circle extends Shape {
	/**
	 * 半径
	 */
	private int r;

	/**
	 * 构造方法
	 *
	 * @param name the name
	 * @param r    the r
	 */
	public Circle(String name , int r) {
		super(name);
		this.r = r;
	} 
	
	/**
	 * 求面积
	 */
	@Override
	public float getArea() {
		return (float) (3.14*r*r);
	}
	
}
