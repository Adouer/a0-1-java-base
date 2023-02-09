package com.learn.a10_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 缓冲字符输入输出流
 * BufferedReader(缓冲字符输入流):Reader-->BufferedReader
 * BufferedWriter(缓冲字符输出流):Writer-->BufferedWriter
 * (1)BufferedReader/BufferedWriter内部维护8k数组
 * (2)BufferedReader增加readline(),BufferedWriter增加newLine()
 * 
 * @author adouer
 *
 */
public class Test91 {

	public static void main(String[] args) throws Exception {
		/*从9.txt读出来，写到10.txt中*/
		BufferedReader br = new BufferedReader(new FileReader("d:/9.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("d:/10.txt"));
		String line;
		while ((line=br.readLine()) != null) {
			System.out.println(line);
			bw.write(line);
			bw.newLine();	//换行相当于“/n”
		}
		bw.close();
		br.close();
		
	}
}
