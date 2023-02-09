package com.learn.a03_oop.a02_inheritance;

import org.junit.Test;

public class Test1 {

	@Test
	public void test() {
		Student s = new Student("hah",1);
		s.show();
		System.out.println(s.name);
	}

}
