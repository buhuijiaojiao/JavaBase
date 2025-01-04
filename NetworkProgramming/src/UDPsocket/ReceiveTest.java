package UDPsocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

// UDP 接收端测试程序
public class ReceiveTest {
    public static void main(String[] args) throws IOException {
        // 创建一个 DatagramSocket，绑定到本机的 10086 端口。这将使程序监听来自该端口的数据包。
        DatagramSocket ds = new DatagramSocket(10086);

        // 创建一个字节数组，用于存储接收到的数据。1024 字节是缓冲区大小。
        byte[] bytes = new byte[1024];

        // 创建一个 DatagramPacket 对象，用于接收数据。
        // 在接收数据之前，只需要指定用于存储数据的字节数组和数组的长度。
        // 源 IP 地址和端口号将在接收数据后由 DatagramPacket 对象自动填充。
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        // 使用 receive() 方法阻塞式接收数据包。
        // 程序将在此处暂停，直到接收到一个数据包。
        ds.receive(dp);

        // 从 DatagramPacket 对象中提取接收到的数据、发送方的 IP 地址和端口号。
        // dp.getData() 返回接收到的数据所在的字节数组。
        // dp.getLength() 返回实际接收到的数据长度。
        // dp.getAddress() 返回发送方的 IP 地址。
        // dp.getPort() 返回发送方的端口号。
        System.out.println("数据：" + new String(dp.getData(), 0, dp.getLength()) + "， 从主机：" + dp.getAddress() + " 的端口：" + dp.getPort() + " 发来数据");

        // 关闭 DatagramSocket，释放资源。
        ds.close();
    }
}
