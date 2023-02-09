package com.learn.a10_io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * BufferedOutputStream(缓冲输出字节流)：字节流-->OutputStream-->FilterOutputStream(节点流\过滤流)-->BufferedOutputStream
 * (1)内部维护8k数组，减少访问外存，提高效率
 * (2)本身不能读写文件、通过FileOutputStream写文件，装饰设计模式
 * (3)write(int b)//只能写低8位\write(byte[] b)\write(byte[] b, int off, int len) 
 * (4)flush()方法或close()方法,flush(数组填满，自动写文件，数组没填满时，调用flush写入文件)
 * @author adouer
 *
 */
public class Test4 {

	public static void main(String[] args) throws Exception {
		/*写单个字节*/
		
	    BufferedOutputStream bof = new BufferedOutputStream( new FileOutputStream("d:/2.txt",true)); 
	    bof.write('x'); 
	    bof.close();
		 
		/*写多个字节*/
		BufferedOutputStream bof2 = new BufferedOutputStream( new FileOutputStream("d:/3.txt",true));
		String str = "hellow\n";
		bof2.write(str.getBytes());		//write(byte[] b)
		bof2.write(str.getBytes(),0,1);	//write(byte[] b, int off, int len)
		bof2.close();
	}
}
