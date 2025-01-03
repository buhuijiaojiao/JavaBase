package ThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

import static java.lang.Thread.sleep;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyRunable myRunable = new MyRunable();
        /*ExecutorService pool = Executors.newCachedThreadPool();
        pool.submit(new MyRunable());
        pool.submit(new MyRunable());
        pool.submit(new MyRunable());
        pool.submit(new MyRunable());*/
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(myRunable);
        pool.submit(myRunable);
        pool.submit(myRunable);
        sleep(5000);
        pool.shutdown();
    }
}
