package case0.c2;

public class Test {
    public static void main(String[] args) {
      /*  同时开启两个线程，共同获取1-100之间的所有数字。
        要求：将输出所有的奇数。*/
        GetNumber g1=new GetNumber();
        GetNumber g2=new GetNumber();
        g1.start();
        g2.start();
    }
}
