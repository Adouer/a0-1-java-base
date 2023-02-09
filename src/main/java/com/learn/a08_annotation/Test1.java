package com.learn.a08_annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 元注解
 *
 * @author adouer
 */
public class Test1 {
    /**
     * 自定义见简单注解
     *
     * @author adouer
     */
    //Target表示@myAnnotation注解使用范围
    @Target({ElementType.METHOD, ElementType.TYPE})
    //retention表示@myAnnotation注解在什么地方有效
    //runtime>class>source
    @Retention(RetentionPolicy.RUNTIME)
    //Documented表示@myAnnotation注解是否生成在javadoc中
    @Documented
    //Inherited表示@myAnnotation注解 子类是否可以继承
    @Inherited
    @interface myAnnotation {
    }
}
