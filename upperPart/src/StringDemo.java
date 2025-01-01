import java.util.Scanner;
import java.util.SplittableRandom;
import java.util.StringJoiner;

public class StringDemo {
    public static void main(String[] args) {
        /*String st = "bbby";
        String stn = "bbby";
        System.out.println(stn == st);
        //StringTable(串池)在堆内存中   存入串池
        String st1 = new String();
        System.out.println(st1);
        String st2 = new String("bbby");
        System.out.println(st2);

        System.out.println(st.charAt(2));
        //       System.out.println(st.replace('b', 'a'));
        System.out.println(st.substring(1, 3));//留头去尾截取
        //       System.out.println(st.substring(3));//留头截到底
        */





        /*练习
                转换罗马数字
        键盘录入一个字符串,
                要求1:长度为小于等于9
        要求2:只能是数字
                将内容变成罗马数字
        下面是阿拉伯数字跟罗马数字的对比关系:
        1-1、II-2、II-3、IV-4、V-5、VI-6、VII-7、VII-8、IX-9
        注意点:
        罗马数字里面是没有0的
        如果键盘录入的数字包含0,可以变成””(长度为0的字符串)*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要转换的数字");
        String stc=sc.next();
        if (stc.length()>9){
            System.out.println("输入数据过长");
            return;
        }else {
            for (int i = 0; i < stc.length(); i++) {
                if (stc.charAt(i)<48 || stc.charAt(i)>57){
                    System.out.println("输入数据不合法");
                    return;
                }
            }
        }
        System.out.println(toLuoMa(stc));




    }
    public static String toLuoMa(String number){
        String[] LuoMas={"","I","II","III","IV","V","VI","VII","VIII","IX"};
//        StringBuilder sb=new StringBuilder();
        StringJoiner sj=new StringJoiner(", ","[","]");
        int num;
        for (int i = 0; i < number.length(); i++) {
//            sb.append(LuoMas[number.charAt(i)-48]+", ");
            sj.add(LuoMas[number.charAt(i)-48]);
//            number.charAt(i)-48正好是罗马数字表的索引
            System.out.println("第"+i+"个罗马数字拼接成功");

        }
        return sj.toString();
    }
    //取出罗马数字也可不用查表法用switch语句选择出对应的字符串
    public static String toLuoMa2(String ANumber,int i){
            String a;

            /*switch (number.charAt(i)){
                case '1' -> a="I";
                case '2' -> a="II";
                case '3' -> a="III";
                case '4' -> a="IV";
                case '5' -> a="V";
                case '6' -> a="VI";
                case '7' -> a="VII";
                case '8' -> a="VIII";
                case '9' -> a="XI";
                default -> a="";
            }*/
            //jdk12新特性
            a=switch (ANumber.charAt(i)){
                case '1' -> "I"; //case 49
                case '2' -> "II";
                case '3' -> "III";
                case '4' -> "IV";
                case '5' -> "V";
                case '6' -> "VI";
                case '7' -> "VII";
                case '8' -> "VIII";
                case '9' -> "XI";
                default -> "";
            };

            return a;
            //最后可在main()中拼接
    }
}
