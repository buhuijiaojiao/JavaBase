package BigIntegerDemo;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger bd1=new BigInteger("99999999999999999999");//字符串中必须为整数
        System.out.println(bd1);
        System.out.println(Long.MAX_VALUE);

        //numBit最大二进制位 方法中表示生成的随机大整数不会超过2的4次方
        BigInteger bd2=new BigInteger(4,new Random());
        System.out.println(bd2);
        //获取指定进制的大整数
        BigInteger bd3=new BigInteger("100",2);
        System.out.println(bd3);//以十进制打印
        //静态方法获取(也是new出来的）
        System.out.println(BigInteger.valueOf(Long.MAX_VALUE)); //最大就是long最大值，在大会报错
        System.out.println(BigInteger.valueOf(16)==BigInteger.valueOf(16));//默认创建常用数的对象（在静态代码块中）
        System.out.println(BigInteger.valueOf(17)==BigInteger.valueOf(17));//-16~16均有初始化对象

        //BigDecimal.valueOf()细节：
        ////1.如果要表示的数字不大， 没有超出double的取值范围， 建议使用静态方法
        //1/2.如果要表示的数字比较大(小数）， 超出 了 double的取值范围， 建议使用构造方法
        /// /3.如果我们传递的是0~10之间的整数， 包含0， 包含10， 那么方法会返回已经创建好的对象， 不会重新new
        //如果传递的是double类型的小数，一定是new出来的比如 10 == 10.0 （这里表示对象地址）为false
    }
}
