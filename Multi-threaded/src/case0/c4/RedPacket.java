package case0.c4;

import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class RedPacket {
    public static int  totalMoney=100;
    public static int totalNumber=3;
    public static ReentrantLock lock=new ReentrantLock();

}
