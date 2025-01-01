package threadedMethod;

public class Test extends Object{
    public static void main(String[] args) {
        MyThread mt1=new MyThread();
        MyThread mt2=new MyThread();

        mt1.start();
        mt2.start();
        //为线程设置名字
        mt1.setName("坦克");
        MyThread mt3=new MyThread("飞机");
        mt3.start();
        //获取当前线程对象
        System.out.println(Thread.currentThread());
        //让线程休眠,时间到了之后自动醒来
        System.out.println("1111111111111");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("2222222222222");
    }

}
