package Runtimedemo;

public class RuntimeDemo1 {

    public static void main(String[] args) {
        Runtime r1=Runtime.getRuntime();
        Runtime r2=Runtime.getRuntime();
        System.out.println(r1==r2);
        //一个jvm只能有一个运行环境(runtime)
        System.out.println(r1.availableProcessors());;//cpu线程数
        System.out.println(r1.maxMemory()/1024/1024/1024);//能从系统获取的总内存大小
        System.out.println(r1.freeMemory()/1024/1024/1024);//剩余内存大小
        System.out.println(r1.totalMemory()/1024/1024/1024);//已经申请的内存
        r1.exit(0);
        System.out.println("我不会执行");
    }
}
