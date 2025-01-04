package UDPsocket.case1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveMessage {
    public static void main(String[] args) throws IOException {
        // 创建一个DatagramSocket，绑定到端口1234
        // 这里使用try-with-resources，确保socket在使用后自动关闭
        DatagramSocket socket = new DatagramSocket(1234);
        // 创建一个DatagramPacket来接收数据
        // byte[1024]创建一个大小为1024字节的字节数组作为缓冲区
        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);

        // 持续监听消息
        while (true) {
            System.out.println("Waiting for message...");

            // 通过socket接收数据包
            socket.receive(packet);

            // 从packet中获取接收到的数据
            byte[] bytes = packet.getData();
            // 获取实际接收到的数据长度
            int len = packet.getLength();

            // 将字节数组转换为字符串
            String message = new String(bytes, 0, len);

            // 打印接收到的消息
            System.out.println("Received message: " + message);
        }
    }
}
// 运行ReceiveMessage.java，然后运行SendMessage.java，可以看到SendMessage发送的消息被ReceiveMessage接收到。