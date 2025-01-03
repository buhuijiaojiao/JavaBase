package ThreadPool;

public class MyRunable implements Runnable {


    @Override
    public void run() {
        System.out.println("Starting: " + Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed: " + Thread.currentThread().getName());
    }
}
