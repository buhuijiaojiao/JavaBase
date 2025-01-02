package case0.c3;


import static java.lang.Thread.sleep;

public class People implements Runnable {


    @Override
    public void run() {
        while (true) {
            GiftNumber.sendGift();
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (GiftNumber.giftCount < 10) {
                System.out.println("礼品不足");
                break;
            }
        }
    }
}