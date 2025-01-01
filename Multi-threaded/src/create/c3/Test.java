package create.c3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建一个带返回值的任务线程
        //任务
        MyCallable mc=new MyCallable();
        //运行结果管理对象
        FutureTask<Integer> ft=new FutureTask<>(mc);
        //线程
        Thread t1=new Thread(ft);

        t1.start(); //执行任务线程
        System.out.println(ft.get());
        //获取线程执行结果
    }
}
