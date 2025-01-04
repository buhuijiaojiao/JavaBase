package UDPsocket.case1;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class SendMessage {
    public static void main(String[] args) throws IOException {
        // 创建一个 DatagramSocket，系统会自动分配一个可用的端口
        DatagramSocket socket = new DatagramSocket();
        // 打印发送方端口号，方便调试
        System.out.println("UDP socket is ready. sendPort:" + socket.getLocalPort());

        // 创建 Scanner 对象用于读取用户输入
        Scanner sc = new Scanner(System.in);

        // 循环发送消息，直到用户输入 "exit"
        while (true) {
            System.out.println("Enter the message(输入exit离线): ");
            String message = sc.nextLine();

            // 如果用户输入 "exit"，则退出循环
            if (message.equals("exit")) {
                break; // 退出循环
            }

            // 将字符串消息转换为字节数组
            byte[] bytes = message.getBytes();

            // 获取目标主机的 IP 地址，这里使用 "localhost" 表示本地主机
            // 可以修改为其他主机地址，例如 "192.168.1.100"
            InetAddress targetAddress = InetAddress.getByName("localhost");

            // 设置目标端口号
            // 建议将端口号定义为常量或从配置文件读取
            int targetPort = 1234;

            // 创建 DatagramPacket 对象，封装要发送的数据、目标 IP 地址和端口号
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, targetAddress, targetPort);

            // 发送数据包
            socket.send(packet);
        }

        // 关闭socket，释放资源  (重要！)
        socket.close();
        System.out.println("Socket closed."); // 提示socket已关闭
        sc.close(); // 关闭Scanner
    }
}
