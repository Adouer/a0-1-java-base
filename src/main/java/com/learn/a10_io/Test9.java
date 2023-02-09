package com.learn.a10_io;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * 文件输入输出字符流
 * FileReader(文件输入字符流)：Reader-->InputStreamReader-->FileReader
 * FileWriter(文件输出字符流)：Writer-->outputStreamWriter-->FileWriter
 * (1)FileReader: read()/read(char[] c)/read(char[] c , 0 , len)
 * 	FileWriter:   write(int c)/ write(char[] c)/write(char[] c , 0 , len)
 * (2)FileWriter内部维护1k字符数组,所以必须fw.close();
 * 
 * @author adouer
 *
 */
public class Test9 {

	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("d:/FileWriter.txt"); 
		fw.write('x');
		fw.write("Adouer你好！");
		fw.close();
		
		FileReader fr = new FileReader("d:/FileWriter.txt");
		char[] c = new char[1024];
		int len = 0;
		while ((len = fr.read(c))!=-1) {
			System.out.println(new String(c , 0 , len));
		}
		fr.close();	
	}
}
