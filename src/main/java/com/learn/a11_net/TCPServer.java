package com.learn.a11_net;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ServiceLoader;

/**
 * TCP服务端
 * 接收数据
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8888);
            //1.接收数据
            Socket accept = serverSocket.accept();
            //2.转流
            InputStream inputStream = accept.getInputStream();
            /*读数据*/
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = inputStream.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, len));
            }
            serverSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            serverSocket.close();
        }
    }

}
