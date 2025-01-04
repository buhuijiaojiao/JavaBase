package TCPsocket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        // 创建一个Socket对象，连接到本地主机（localhost）的端口12345
        // 这就是服务器正在监听的端口
        Socket socket = new Socket("localhost", 12345);
        System.out.println("Connected to server");

        // 获取输出流，用于向服务器发送数据
        OutputStream out = socket.getOutputStream();

        // 将字符串"Hello, Server!"转换为字节数组，并通过输出流发送到服务器
        out.write("Hello, Server!你好你好".getBytes());

        // 关闭Socket，结束连接
        socket.close();
    }
}
