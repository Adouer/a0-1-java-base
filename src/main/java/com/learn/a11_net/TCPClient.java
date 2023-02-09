package com.learn.a11_net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * TCP客户端
 * 发送数据
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //1.创建socket
        Socket socket = null;
        try {
            socket = new Socket(InetAddress.getLocalHost(), 8888);
            //2.socket获取输出字节流
            OutputStream outputStream = socket.getOutputStream();
            //3.写数据
            outputStream.write("hello world".getBytes());
        } catch (IOException e) {
            System.out.println("发送数据失败");
            throw new RuntimeException(e);
        } finally {
            //4.关闭
            socket.close();
        }
    }
}
