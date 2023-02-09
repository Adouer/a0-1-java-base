package com.learn.a10_io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * BufferedInputStream(缓冲输入字节流)：字节流-->InputputStream-->FilterInputStream(节点流\过滤流)-->BufferedInputStream
 * (1)内部维护8k数组，减少读外存，提高效率
 * (2)本身不能读写文件、通过FileInputStream读文件，装饰设计模式
 * @author adouer
 *
 */
public class Test3 {

	public static void main(String[] args) throws Exception {
		/*一、read()读一个字节*/
		FileInputStream fis = new FileInputStream("d:/1.txt");	//1.txt:abcde哈哈嘿嘿
		BufferedInputStream bis = new BufferedInputStream(fis);
		int ab = bis.read();
		System.out.println((char)ab);	//a
		bis.close();
		
		/*二、read(buf),读取多个（2）byte字节*/
		byte[] buf = new byte[2];
		FileInputStream fis2 = new FileInputStream("d:/1.txt");	//1.txt:abcde哈哈嘿嘿
		BufferedInputStream bis2 = new BufferedInputStream(fis2);
		int ab2 = bis2.read(buf);
		System.out.println("长度："+ab2);	//2
		System.out.println("内容："+new String(buf));	//ab
		bis2.close();
		
		/*三、while循环读所有内容*/
		byte[] buf3 = new byte[1024];
		FileInputStream fis3 = new FileInputStream("d:/1.txt");	//1.txt:abcde哈哈嘿嘿
		BufferedInputStream bis3 = new BufferedInputStream(fis3);
		int len = 0;
		while ((len= bis3.read(buf3)) != -1) {
			System.out.println(new String(buf3 , 0 , len));
		}
		bis3.close();
	}
}
