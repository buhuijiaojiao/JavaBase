package ProducerConsumerProblem;

public class Producer extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Buffer.lock) {
                if (Buffer.count == 0) {
                    break;
                } else {
                    if (Buffer.foodFlag != 0) {
                        //表明不该执行此线程 释放锁等待
                        try {
                            Buffer.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        //进行生产
                        System.out.println("生产者生产了一份资源");
                        //唤醒等待的线程
                        Buffer.lock.notifyAll();
                        //可被消费者线程消费
                        Buffer.foodFlag = 1;
                    }

                }
            }

        }
    }
}
