package com.learn.a09_reflection;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

/**
 * 反射操作注解
 * @author adouer
 *
 */
public class Test05 {

	public static void main(String[] args) throws Exception {
		Class<?> c1 = Class.forName("com.learn.a09_reflection.User2");
		/*获取类上的注解*/
		Annotation[] annotations = c1.getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println(annotation);
		}
		/*获取类上指定注解*/
		Table table = c1.getDeclaredAnnotation(Table.class);
		System.out.println(table.value());
		/*获取字段的注解*/
		Field name = c1.getDeclaredField("name");	//获取字段
		TableField f = name.getAnnotation(TableField.class);	//获"name"字段的TableField注解
		System.out.println(f.name()+f.type()+f.length());

		Field age = c1.getDeclaredField("age");	//获取字段
		Annotation[] annotations2 = age.getAnnotations();
		for (Annotation annotation : annotations2) {
			TableField f1 = (TableField)annotation;
			System.out.println(f1.name());
			System.out.println(f1.type());
			System.out.println(f1.length());
		}
	}
}
@Table("user_table")
class User2 {
	@TableField(name = "user_name",type = "string",length = 20)
	private String name;
	@TableField(name = "user_age",type = "string",length = 10)
	private int age;
	public User2() {}
	public User2(String name, int age) {
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
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Table{
	String value();
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface TableField{
	String name();
	String type();
	int length();
}