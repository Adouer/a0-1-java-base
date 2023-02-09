package com.learn.a10_io;

import java.io.FileOutputStream;

/**
 * FileOutputStream(文件输出字节流)：OutputStream-->FileOutputStream
 * (1)内存写数据到硬盘
 * (2)write(int b)//只能写低8位
 * (3)close()关闭流对象
 * (4)FileOutputStream fos = new FileOutputStream("d:/2.txt",true);	//true：表示append,false表示覆盖重写
 * @author adouer
 *
 */
public class Test2 {

	public static void main(String[] args) throws Exception {
		/*写单个字节*/
		FileOutputStream fos = new FileOutputStream("d:/2.txt",true);	//true：表示append,false表示覆盖重写
		fos.write(255);	//255不能写入，低8位存数据
		fos.write('x');	
		/*写多个字节*/
		FileOutputStream fos3 = new FileOutputStream("d:/3.txt",false);	//true：表示append,false表示覆盖重写
		String str = "hellow world\n adouer"; 
		fos3.write(str.getBytes());
		fos.close();
		fos3.close();
	}
}
