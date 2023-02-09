package com.learn.a10_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * SequenceInputStream(顺序字节流)-->InputStream-->SequenceInputStream
 * (1)Vector类可以合并多个流 v.elements()
 * 
 * @author adouer
 *
 */
public class Test7 {

	public static void main(String[] args) throws Exception {

		FileInputStream fis1 = new FileInputStream("d:/6.txt");
		FileInputStream fis2 = new FileInputStream("d:/7.txt");
		FileOutputStream fos = new FileOutputStream("d:8.txt");

		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

		byte[] buf = new byte[1024];
		int len = 0;
		while ((len = sis.read(buf)) != -1) {
			System.out.println(1); // 最少输出两次，因为有两个文件
			fos.write(buf, 0, len);
		}

		fis1.close();
		fis2.close();
		fos.close();
		sis.close();
		a();
	}

	public static void a() throws Exception {
		FileInputStream fis0 = new FileInputStream("d:/5.txt");
		FileInputStream fis1 = new FileInputStream("d:/6.txt");
		FileInputStream fis2 = new FileInputStream("d:/7.txt");
		FileOutputStream fos = new FileOutputStream("d:8.txt");

		Vector<FileInputStream> v = new Vector<FileInputStream>();
		v.add(fis0);
		v.add(fis1);
		v.add(fis2);
		Enumeration<FileInputStream> e = v.elements();
		SequenceInputStream sis = new SequenceInputStream(e);

		byte[] buf = new byte[1024000];
		int len = 0;
		while ((len = sis.read(buf)) != -1) {
			System.out.println(1); // 最少输出3次，不论byte多大,因为有3个文件
			fos.write(buf, 0, len);
		}
		fis0.close();
		fis1.close();
		fis2.close();
		fos.close();
		sis.close();
	}
}
