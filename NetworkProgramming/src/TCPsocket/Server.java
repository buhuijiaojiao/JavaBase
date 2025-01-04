package TCPsocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        // 创建一个ServerSocket，监听端口12345
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("Server started");

        // 阻塞等待客户端连接
        // accept()方法返回一个Socket对象，表示与客户端建立的连接
        Socket accept = serverSocket.accept();
        System.out.println("Client connected");

        // 获取输入流，用于读取客户端发送的数据
        InputStream is = accept.getInputStream();
        // 将字节输入流转换为字符输入流，方便按字符读取
        InputStreamReader isr = new InputStreamReader(is);

        // 定义一个变量b用于存储读取的字符
        int b;

        // 循环读取客户端发送的数据
        // isr.read()方法读取一个字符，返回-1表示读取结束
        while ((b = isr.read()) != -1) {
            // 打印读取的字符
            System.out.print((char) b);
        }

        // 关闭ServerSocket，释放资源  (实际应用中，很少会主动关闭服务器端的ServerSocket)
        serverSocket.close();
    }
}
