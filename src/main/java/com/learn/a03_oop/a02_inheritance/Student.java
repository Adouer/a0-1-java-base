package com.learn.a03_oop.a02_inheritance;

public class Student extends Person {

	@Override
	public void show() {
		super.show();
		System.out.println("Student--show");
	}

	public Student(String name, Integer age) {
		super(name, age);
	}
	
}
