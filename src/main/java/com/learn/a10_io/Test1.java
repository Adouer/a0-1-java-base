package com.learn.a10_io;

import java.io.FileInputStream;

/**
 * FileInputStream（文件输入字节流）：字节流-->InputStream-->FileInputStream 
 * (1)从硬盘读数据到内存 
 * (2)read()默认读一个字节，末尾返回-1
 * (3)需要调用close()方法关闭流对象 
 * (4)byte[] buf = new byte[2]; int read2 = fis2.read(buf); //把fis2流中的内容装到buf中
 * (5)不会先清空缓冲数组的内容，而是直接覆盖
 * 【 1.txt内容:abcde哈哈 嘿嘿】
 * @author adouer
 *f中
 * (5)不会先清空缓冲数组的内容，而是直接覆盖
 */
public class Test1 {

	public static void main(String[] args) throws Exception {
		/* 一、read()读一个字节 */
		FileInputStream fis = new FileInputStream("d:/1.txt");
		FileInputStream fis2 = new FileInputStream("d:/1.txt");
		FileInputStream fis3 = new FileInputStream("d:/1.txt");

		int read = fis.read();
		System.out.println((char)  read); // 输出：a
		fis.close();

		/* 二、read(buf),读取多个（2）byte字节 */
		byte[] buf = new byte[2]; // 缓冲数组
		int read2 = fis2.read(buf); // 把fis2流中的内容装到buf中
		System.out.println("长度：" + read2); // 2
		System.out.println("内容：" + new String(buf)); // ab

		int read4 = fis2.read(buf);
		System.out.println("长度：" + read4); // 2
		System.out.println("内容：" + new String(buf)); // cd
		fis2.close();

		/* 三、while循环读所有内容 */
		byte[] buf3 = new byte[1024];
		int length = 0;
		while ((length = fis3.read(buf3)) != -1) {
			// new String(buf3)默认字符数组长度
			System.out.println("全部输出:" + new String(buf3, 0, length));// abcde哈哈嘿嘿
		}

		fis3.close();
	}

}
