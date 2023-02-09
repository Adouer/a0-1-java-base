package com.learn.a10_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * DataInputStream(数据输入字节流)：字节流-->InputStream-->FilterInputStream((节点流\过滤流))-->DataInputStream
 * DataOutputStream(数据输出字节流)：字节流-->OutputStream-->FilterOutputStream((节点流\过滤流))-->DataOutputStream
 * (1)读写基本数据类型和字符串
 * (2)  readByte() / readShort() / readInt() / readLong() / readFloat() / readDouble() / readBoolean() / readChar() /readUTF() //字符串
 * @author adouer
 *
 */
public class Test5 {

	public static void main(String[] args) throws Exception {
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("d:/4.txt",true));
		dos.writeInt(10);		
		dos.writeBoolean(true);
		dos.writeFloat(3.14f);
		dos.writeUTF("Hellow Adouer");
		dos.close();
		DataInputStream dis = new DataInputStream(new FileInputStream("d:/4.txt"));
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readFloat());
		System.out.println(dis.readUTF());
		dis.close();
	}
}
