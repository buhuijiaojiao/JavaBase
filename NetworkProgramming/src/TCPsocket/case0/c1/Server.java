package TCPsocket.case0.c1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket(6600);
        Socket accept = serverSocket.accept();

        InputStreamReader inputStream = new InputStreamReader(accept.getInputStream());
        int b=-1;

        while ((b = inputStream.read()) != -1) {
            System.out.print((char) b);

        }
        // 给客户端反馈消息
        OutputStreamWriter outputStream = new OutputStreamWriter(accept.getOutputStream());
        String msg = "反馈消息!";
        outputStream.write(msg);
        outputStream.flush();
        accept.shutdownOutput();

        accept.close(); // 关闭客户端连接
        serverSocket.close(); // 关闭服务器


    }
}

