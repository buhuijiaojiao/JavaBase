package ThreadPool.custmize;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        /*ThreadPoolExecutor thread PoolExecutor = new Thread PoolExecutor
（核心线程数量，最大线程数量，空闲线程最大存活时间，任务队列，创建线程工厂，任务的拒绝策略）；
        不能小于0
        参数一：核心线程数量
        不能小于o，最大数量 >= 核心线程数量
        参数二：最大线程数
                不能小于0
        参数三：空闲线程最大存活时间
                用TimeUnit指定
        参数四：时间单位
                不能为nul1
        参数五：任务队列
        参数六：创建线程工厂
                不能为nul1
        不能为nul1
        参数七：任务的拒绝策略*/
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2, // 核心线程数
                5, // 最大线程数
                1, // 空闲线程最大存活时间
                TimeUnit.SECONDS, // 时间单位
                new LinkedBlockingQueue<>(3),// 任务队列
                Executors.defaultThreadFactory(), // 创建线程工厂,线程的创建方式
                new ThreadPoolExecutor.AbortPolicy());// 任务的拒绝策略
    }
    /*
    * 自定义线程池小结
    * ① 创建一个空的池子
    * ②  有任务提交时，线程池会创建线程去执行任务，执行完毕归还线程
    * 不断的提交任务，会有以下三个临界点：
    * ① 当核心线程满时，再提交任务就会排队
    * ②  当核心线程满，队伍满时，会创建临时线程
    *
    * 线程池多大合适呢？
    * 1.CPU 密集型运算
    * 最大并行数+1
    *
    * 2.I/O 密集型运算
    * 总时间 （CPU计算时间+等待时间）/CPU计算时间 * 最大并行数 * 期望 CPU 利用率

    * 最大并行数*期望 CPU 利用率*
    * CPU 计算时间
    * 举例：从本地文件中，读取两个数据，并进行相加
    * */
}
