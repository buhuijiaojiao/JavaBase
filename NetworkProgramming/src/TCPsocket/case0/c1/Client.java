package TCPsocket.case0.c1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

import static java.lang.Thread.sleep;

public class Client {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("127.0.0.1", 6600);
        OutputStreamWriter outputStream = new OutputStreamWriter(socket.getOutputStream());
        InputStreamReader inputStream = new InputStreamReader(socket.getInputStream());

        outputStream.write("Hello, Server!");
        outputStream.flush();
        socket.shutdownOutput();

        int b=-1;

        while ((b = inputStream.read()) != -1) {
            System.out.print((char) b);

        }


        socket.close();

    }
}
