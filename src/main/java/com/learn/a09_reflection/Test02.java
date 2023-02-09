package com.learn.a09_reflection;
/**
 * 获取Class对象的4种方式
 * @author adouer
 *
 */
@SuppressWarnings("all")
public class Test02 {

	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Student();
		//1--通过对象获取class
		Class c1 = person.getClass();
		System.out.println(c1);	//class com.learn.a09_reflection.Student【证明实际是子类】
		//2--包名反射获取class
		Class c2 = Class.forName("com.learn.a09_reflection.Student");
		System.out.println(c2);	//class com.learn.a09_reflection.Student
		//3--类直接获取class
		Class c3 = Student.class;
		System.out.println(c3);	//class com.learn.a09_reflection.Student
		//4--包装类的type属性
		Class tc = Integer.TYPE;
		//通过子类获取父类class
		Class superclass = c1.getSuperclass();//
		System.out.println(superclass); //class com.learn.a09_reflection.Person
	}
	
}
 class Person {
	protected String name;
	protected String age;
	
	public Person() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
	
}
 class Student extends Person {
	private String className;
	private String teacher;
	
	public Student() {}
	public Student(String className, String teacher) {
		super();
		this.className = className;
		this.teacher = teacher;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	
}