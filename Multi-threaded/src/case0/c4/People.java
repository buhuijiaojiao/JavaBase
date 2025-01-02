package case0.c4;

import java.util.Random;

public class People extends Thread {
    public People() {
    }

    @Override
    public void run() {
        Random random = new Random();
        //抢红包
        RedPacket.lock.lock();
        if (RedPacket.totalNumber > 0) {
            RedPacket.totalNumber--;
            int money = 0;
            if (RedPacket.totalNumber == 1) {
                money = RedPacket.totalMoney;
            }
            money = random.nextInt(RedPacket.totalMoney - 1);
            RedPacket.totalMoney -= money;
            System.out.println(Thread.currentThread().getName() + "抢到了" + money + "元");

        } else {
            System.out.println(Thread.currentThread().getName() + "没抢到");


        }
        RedPacket.lock.unlock();
    }

}

