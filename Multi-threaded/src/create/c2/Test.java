package create.c2;

public class Test {
    public static void main(String[] args) {
        Thread t1=new Thread(new MyRun());
        Thread t2=new Thread(new MyRun());
        t1.setName("1:");
        t2.setName("2:");
        t1.start();
        t2.start();
    }
}
