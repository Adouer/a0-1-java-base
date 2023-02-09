package com.learn.a11_net;

import java.io.IOException;
import java.net.*;

/**
 * UDP发送
 */
public class UDPSend {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {
            //1.创建socket
            socket = new DatagramSocket();
            String str = "hello world";
            /*
            2.创建数据包
                参数：数据的二进制，包的长度，address对象，端口
             */
            DatagramPacket packet = new DatagramPacket(str.getBytes("UTF-8"),str.getBytes().length, InetAddress.getLocalHost(),8888);
            //3.发送
            socket.send(packet);
        } catch (IOException e) {
            System.out.println("发送失败");
            throw new RuntimeException(e);
        } finally {
            //4.关闭
            socket.close();
        }
    }
}
