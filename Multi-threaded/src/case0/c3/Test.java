package case0.c3;

public class Test {
    public static void main(String[] args) {
       /* 练习

        多线程练习2（送礼品）（学生自己练习）
        有100份礼品，两人同时发送，当剩下的礼品小于10份的时候则不再送出。
        利用多线程模拟该过程并将线程的名字和礼物的剩余数量打印出来*/
        People p1=new People();
        People p2=new People();
        Thread t1=new Thread(p1);
        Thread t2=new Thread(p2);
        t1.setName("小明");
        t2.setName("小红");
        t1.start();
        t2.start();
    }
}
