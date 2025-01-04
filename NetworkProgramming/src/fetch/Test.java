package fetch;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("DESKTOP-IE9GF3T");
        System.out.println(address);
        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());
    }
}
