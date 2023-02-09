package com.learn.a10_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 对象输入输出字节流
 * ObjectInputStream(对象输入字节流)：InputStream-->ObjectInputStream
 * ObjectOutputStream(对象输出字节流)：OutputStream-->ObjectOutputStream
 * (1)ObjectInputStream--readObject()--基本数据类型和对象类型--外存反序列化到内存
 * (2)ObjectOutputStream--writeObject()--基本数据类型和对象类型--内存序列化到外存
 * (3)实体类实现Serializable接口（标识接口）
 * (4)serialVersionUID：
 * 	(4.1)序列化只有实例成员无静态成员
 * 	(4.2)不想参与序列化的字段(密码等字段)用transient
 * 	(4.3)serialVersionUID作用 ：序列化/反序列化版本一致性验证，不显示声明自动生成,序列化和反序列化对比serialVersionUID是否相同
 * 	(4.4)显示声明：private static final long serialVersionUID = 1L，JVM不计算serialVersionUID
 * 	
 * @author adouer
 *
 */
public class Test8 {

	public static void main(String[] args) throws Exception {
		/*写到硬盘*/
		User user = new User("张三", 10);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/obj.txt"));
		oos.writeObject(user);
		oos.close();
		/*读到内存*/
		ObjectInputStream  ois = new ObjectInputStream(new FileInputStream("d:/obj.txt"));
		User u= (User)ois.readObject();
		System.out.println(u);
		ois.close();
	}
	
}
