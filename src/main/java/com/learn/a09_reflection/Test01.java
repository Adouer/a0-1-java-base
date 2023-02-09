package com.learn.a09_reflection;
/**
 * 反射定义
 * （为了获取class对象，进而获取类信息，同一个类的class对象相同）
 * @author adouer
 *
 */
@SuppressWarnings("all")
public class Test01 {

	public static void main(String[] args) throws ClassNotFoundException {
		//通过反射创建Class对象
		Class c1 = Class.forName("com.learn.a09_reflection.User");
		Class c2 = Class.forName("com.learn.a09_reflection.User");

		System.out.println(c1);
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));	//true
	}
	
}
 
 class User{
	private String name;
	private int age;
	public User() {}
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
}