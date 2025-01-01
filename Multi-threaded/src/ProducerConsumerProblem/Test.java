package ProducerConsumerProblem;

public class Test {
    public static void main(String[] args) {
        Producer p=new Producer();
        Consumer c=new Consumer();
        p.start();
        c.start();
    }
}
