package com.learn.a03_oop.a03_polymorphism;
/**
 * 多态子类（三角形）
 * @author adouer
 *
 */
public class Triangle extends Shape {
	
	
	private int height;
	private int width;
	
	public Triangle(String name , int width , int height) {
		super(name);
		this.height = height;
		this.width = width;
		
	}
	@Override
	public float getArea() {
		return width * height /2;
	}

}
