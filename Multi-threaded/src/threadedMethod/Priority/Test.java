package threadedMethod.Priority;

public class Test {
    public static void main(String[] args) {
        MyThread m1=new MyThread();
        MyThread m2=new MyThread();
        Thread t1=new Thread(m1);
        Thread t2=new Thread(m2);
        t1.setName("飞机");
        t2.setName("坦克");
        t1.setPriority(10);
        t2.setPriority(1);
        t2.start();
        t1.start();
    }
}
