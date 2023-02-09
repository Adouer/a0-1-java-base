package com.learn.a8_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 * @author adouer
 *
 */
public class Test3 {
	@MyAnnotation2(test = "没有默认值需要在这里赋值")
	public void test1() {}
	@MyAnnotation3("adouer")
	public void test2() {}
	
	@Target({ElementType.TYPE,ElementType.METHOD})
	@Retention(RetentionPolicy.RUNTIME)
	@interface MyAnnotation2{
		//参数类型+参数名称+default+默认值
		String name() default "";
		String test();
		int age() default 18;
		int id() default -1 ;//如果默认-1，表示不存在
	}
	
	@Target({ElementType.TYPE,ElementType.METHOD})
	@Retention(RetentionPolicy.RUNTIME)
	@interface MyAnnotation3{
		String value();		//如果参数名称为value，调用时可以不写value
	}
}
