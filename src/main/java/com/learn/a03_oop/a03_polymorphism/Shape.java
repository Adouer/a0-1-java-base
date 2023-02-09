package com.learn.a03_oop.a03_polymorphism;

/**
 * 多态抽象类（形状）
 *
 * @author adouer
 */
public abstract class Shape {
	/**
	 * The Name.
	 */
	String name;

	/**
	 * Instantiates a new Shape.
	 *
	 * @param name the name
	 */
	public Shape(String name) {
		super();
		this.name = name;
	}

	/**
	 * Gets area.
	 *
	 * @return the area
	 */
	public abstract float getArea();
}
