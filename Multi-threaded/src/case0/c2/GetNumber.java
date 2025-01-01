package case0.c2;

import java.util.Random;

public class GetNumber extends Thread{
    @Override
    public void run() {
        while (true){
            try {
                AllNum.lock.lock();
                if (AllNum.num>=AllNum.MAXNUM){
                    System.out.println("已获取完成");

                    break;
                }
                AllNum.num++;
                if(AllNum.num%2!=0){
                    System.out.println(getName()+"获取到了奇数"+AllNum.num);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }finally {
                AllNum.lock.unlock();
            }


        }
    }
}
