package case0.c4;

public class Test {
    public static void main(String[] args) {
        /*练习
        多线程练习4 （抢红包）
        抢红包也用到了多线程。
        假设：100块，分成了3个包，现在有5个人去抢。
        其中，红包是共享数据。
        5个人是5条线程。
        打印结果如下：
        XXX抢到了XXX元
                XXX抢到了XXX元
        XXX抢到了XXX元
                XXX没抢到
        XXX没抢到*/

        //100块，分成了3个包，现在有5个人去抢
        People p1 = new People();
        People p2 = new People();
        People p3 = new People();
        People p4 = new People();
        People p5 = new People();
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
    }
}
