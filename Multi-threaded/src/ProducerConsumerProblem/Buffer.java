package ProducerConsumerProblem;

public class Buffer {
    //0代表该生产者线程生产 1代表消费者线程消费
    public static int foodFlag=0;
    //锁
    public static Object lock=new Object();
    //可以消费的次数
    public static int count=10;
}
