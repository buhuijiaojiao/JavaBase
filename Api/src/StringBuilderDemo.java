public class StringBuilderDemo {
    public static void main(String[] args) {
/*        StringBuilder sb=new StringBuilder("nishishabi");
        System.out.println(sb);
        sb.append("神鹰");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        int len=sb.length();
        System.out.println(len);
        String st=sb.toString();
//        System.out.println(st);*/
//        需求:定义一个方法,把int数组中的数据按照指定的格式拼接成一个字符串返回。
//        调用该方法,并在控制台输出结果。
//
//        例如:数组为int[] arr={1,2,3};
//        执行方法后的输出结果为:[1,2,3]
//        int[] arr={1,2,3};
//        System.out.println(addStr(arr));;
//
//    }
//    public static String addStr(int[] arr){
//        StringBuilder sb=new StringBuilder("[");
//        for (int i = 0; i < arr.length; i++) {
//            if(i==arr.length-1){
//                sb.append(arr[i]+"]");
//            }else {
//                sb.append(arr[i]+", ");
//            }
//        }
//        return sb.toString();
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity());  //容量(最多能装多少,真装不下了会扩容到*2+2=34,再装不下就多多少扩容多少)
        System.out.println(sb.length());    //实际长度
        System.out.println("------------------------------");

        sb.append("111111111111111");//len 15
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println("------------------------------");
        sb.append("11"); //len 17
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println("------------------------------");
        sb.append("1111111111111111111111");//17*2+5=39 len 39
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }/*
    字符串原理小结

    扩展底层原理1:字符串存储的内存原理

● 直接赋值会复用字符串常量池中的
● new出来不会复用,而是开辟一个新的空间

    扩展底层原理2 :== 号比较的到底是什么?

● 基本数据类型比较数据值
● 引用数据类型比较地址值

    扩展底层原理3:字符串拼接的底层原理

● 如果没有变量参与,都是字符串直接相加,编译之后就是拼接之后的结果,会复用串池中的字符串。
● 如果有变量参与,会创建新的字符串,浪费内存。
    扩展底层原理4:StringBuilder提高效率原理图

● 所有要拼接的内容都会往StringBuilder中放,不会创建很多无用的空间,节约内存

    扩展底层原理5:StringBuilder源码分析

● 默认创建一个长度为16的字节数组
● 添加的内容长度小于16,直接存
● 添加的内容大于16会扩容(原来的容量*2+2)
● 如果扩容之后还不够,以实际长度为准*/

}
