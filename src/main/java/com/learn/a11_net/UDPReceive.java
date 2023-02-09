package com.learn.a11_net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP接收
 */
public class UDPReceive {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {
            //1.socke
            socket = new DatagramSocket(8888);
            /*2.接收数据包*/
            byte[] bytes = new byte[1024];
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
            socket.receive(packet); //方法阻塞，等待接收
            System.out.println(new String(packet.getData()));
        } catch (IOException e) {
            System.out.println("接收失败！");
            throw new RuntimeException(e);
        } finally {
            /*3.关socket*/
            socket.close();
        }
    }
}
