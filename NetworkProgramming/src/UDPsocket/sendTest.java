package UDPsocket;

import java.io.IOException;
import java.net.*;

// 测试 UDP 套接字发送数据
public class sendTest {
    public static void main(String[] args) throws IOException {
        // 创建一个 DatagramSocket，系统会自动分配一个可用的端口
        DatagramSocket ds = new DatagramSocket();
        // 打印本机随机分配的端口号
        System.out.println("本机随机指定的发送端口" + ds.getLocalPort());

        // 将字符串转换为字节数组，准备发送的数据
        byte[] bytes = "damn man!".getBytes();

        // 获取目标主机的 IP 地址，这里使用回环地址 127.0.0.1 (本地主机)
        InetAddress targtIp = InetAddress.getByName("127.0.0.1");

        // 创建 DatagramPacket 数据包，指定要发送的数据、数据长度、目标 IP 地址和端口号
        // 10086 是目标端口号，需要确保目标主机上该端口有程序监听
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, targtIp, 10086);

        // 通过 DatagramSocket 发送数据包
        ds.send(dp);

        // 关闭 DatagramSocket，释放资源
        ds.close();
    }
}
