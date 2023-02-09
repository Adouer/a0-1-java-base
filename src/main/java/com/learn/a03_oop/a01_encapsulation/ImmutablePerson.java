package com.learn.a03_oop.a01_encapsulation;
/**
 * 不变类
 * 1.属性定义成final
 * 2.不对外提供setter方法
 * @author adouer
 *
 */
public class ImmutablePerson {
	private final String name;
	private final Integer age;
	
	private ImmutablePerson(String name , Integer age) {
		this.name = name;
		this.age= age;
	}
	
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	
	public ImmutablePerson addAge(Integer age) {
		return new ImmutablePerson(this.name ,this.age+age);
	}
	
	@Override
	public String toString() {
	
		return "ImmutablePerson [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		ImmutablePerson person = new ImmutablePerson("张三",10);
		//打印person: ImmutablePerson [name=张三, age=10]
		System.out.println(person);
		//打印新对象：ImmutablePerson [name=张三, age=20]
		System.out.println(person.addAge(10));
		//打印person:ImmutablePerson [name=张三, age=10]
		System.out.println(person);
		//结论：addAge没有改变person的属性值，而是产生了新对象
	}
}
