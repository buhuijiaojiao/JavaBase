package case0.c2;

import java.util.concurrent.locks.ReentrantLock;

public class AllNum {
    public final static int MAXNUM=100;
    public  static int num=0;
    public  static ReentrantLock lock=new ReentrantLock();
}
