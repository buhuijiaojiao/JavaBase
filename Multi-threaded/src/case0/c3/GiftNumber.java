package case0.c3;

public class GiftNumber {
    public static int giftCount = 100;

    public  static synchronized void sendGift() {
        if (giftCount < 10) {
            return;
        }
        giftCount--;
        System.out.println(Thread.currentThread().getName() + "送出了一份礼品，礼品剩余数量：" + giftCount);
    }
}
