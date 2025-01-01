package ProducerConsumerProblem;

public class Consumer extends Thread {
    @Override
    public void run() {
        while (true) {
            //代码上锁
            synchronized (Buffer.lock) {
                if(Buffer.count==0){
                    break;
                }else {
                    //互斥资源的状态不为1 表示不该执行消费者线程 释放锁 中断代码进行等待
                    if (Buffer.foodFlag != 1) {
                        try {
                            Buffer.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        //如果缓冲区有数据  开始消费
                        Buffer.count--;
                        System.out.println("消费者消费了一份资源,还能再消费" + Buffer.count + "次");
                        //吃完开锁 唤醒所有在等待的线程（生产者）
                        Buffer.lock.notifyAll();
                        //修改互斥资源的状态 表示可以被生产
                        Buffer.foodFlag = 0;
                    }

                }

            }
        }
    }
}
