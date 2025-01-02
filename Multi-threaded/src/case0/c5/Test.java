package case0.c5;

import java.io.Flushable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Test {
    /*多线程练习5 （抽奖箱抽奖）
    有一个抽奖池，该抽奖池中存放了奖励的金额，该抽奖池中的奖项为
    [10,5,20,50,100,200,500,800,2,80,300,700}
    创建两个抽奖箱（线程）设置线程名称分别为 “抽奖箱1”， “抽奖箱2"
    随机从抽奖池中获取奖项元素并打印在控制台上，格式如下：
    每次抽出一个奖项就打印一个（随机）
    抽奖箱1 又产生了一个 10 元大奖
    抽奖箱1又产生了一个 100 元大奖
    抽奖箱1又产生了一个 200 元大奖
    抽奖箱1又产生了一个800 元大奖
    抽奖箱2 又产生了一个 700 元大奖*/
    /*
    * 多线程练习6 （多线程统计并求最大值）
    在上一题基础上继续完成如下需求：
    每次抽的过程中，不打印，抽完时一次性打印(随机)
    在此次抽奖过程中，抽奖箱1总共产生了6个奖项。
    分别为：10，20，100，500，2，300最高奖项为300元，总计额为932元
    在此次抽奖过程中，抽奖箱2总共产生了6个奖项。
    分别为：5，50，200，800，80，700最高奖项为800元，总计额为1835元
    * 最大奖项
    * */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);
//        // 创建抽奖箱1
//        Thread t1 = new Thread(new LotteryBox("抽奖箱1", list));
//        // 创建抽奖箱2
//        Thread t2 = new Thread(new LotteryBox("抽奖箱2", list));
//        // 启动线程
//        t1.start();
//        t2.start();
        LotteryBox box1 = new LotteryBox("抽奖箱1", list);
        LotteryBox box2 = new LotteryBox("抽奖箱2", list);
        FutureTask<Integer> future1 = new FutureTask<>(box1);
        FutureTask<Integer> future2 = new FutureTask<>(box2);
        Thread t1=new Thread(future1);
        Thread t2=new Thread(future2);
        t1.start();
        t2.start();
        System.out.println(future1.get());
        System.out.println(future2.get());


    }
}
