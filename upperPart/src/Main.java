import java.util.Random;
import java.util.Scanner;

// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
public class Main {
    public static void main(String[] args) {
//            int x=12321;
//            int temp=x;
//            int t=0;
//            while (x!=0){
//                int a =x%10;
//                x=x/10;
//                t=t*10+a;
//            }
//        System.out.println(t);
//        System.out.println(temp==t);
        //键盘录入一个三位数,将其拆分为个位百位十位打印
       /* System.out.println("请输入三位数:");
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("个位是:"+ number%10);

        System.out.println("十位是:"+ (number%100-number%10)/10);

        System.out.println("百位是:"+ (number-number%100)/100);
*/
      /*  int h1=150;
        int h2=210;
        int h3=165;

        int m1= h1>h2?h1:h2;

        int m2=m1>h3?m1:h3;
        System.out.println(m2+"cm");
*/
//        负数补码=反码加一=原码符号位不变数值位取反后加一
//        正数原码=反码=补码
//        计算机数据存储为补码
//        使用补码是要错开反码的+0和-0;
        /*可以解释 隐式转换:前面补0
                  强制转换:去掉前面的bit*/
        /*Scanner sc=new Scanner(System.in);
        System.out.println("请输入1~4按键");
        int number= sc.nextInt();
        if (number<1){
            System.out.println("按键不合法");
            return;
        }
        switch (number){
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预定");
            case 3 -> System.out.println("机票改签");
            case 4 -> System.out.println("退出服务");
            default -> System.out.println("退出服务");
        }*/
        /*for (int i = 1; i <=100; i++) {
            if (i%10==7||i%7 == 0||i/10%10==7) {
                System.out.println("过");
                continue;

            }
            System.out.print(i+" ");

        }
*/
//        质数只能被1或自身整除 !合数
 /*       Scanner sc=new Scanner(System.in);
        System.out.println("请输入");
        int number=sc.nextInt();
        boolean flag=true;
        for (int i = 2; i < number; i++) {
//            if (number%i!=0){
//                System.out.println(number+"不能整除"+i);
//                if (i==number-1){
//                    System.out.println(number+"是质数");
//                }
//                else {
//                    continue;
//                }
//
//            }
//            else {
//                System.out.println(number+"不是质数");
//                break;
//            }
            if (number%i==0){
                flag=false;
                break;
            }

        }
        if (flag) {
            System.out.println(number+"是质数");
        }
        else System.out.println(number+"不是质数");

        */
//        数组静态初始化
       /* int[] array = new int[]{1,2,3,4,5,6,7,8,9};
        String[] ar1 = new String[]{"Sdjkas","adad"};
        float[] ar2 =new float[]{1,2};
        int count=0,sum=0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (array[i]%3==0){
                count++;
            }
        }
        System.out.println("一共有"+count+"个数字可以被3整除");*/
        /*int[] ar1={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < ar1.length; i++) {
            if(ar1[i]%2==0){
                ar1[i]=ar1[i]/2;
            }
            else {
                ar1[i]=ar1[i]*2;
            }
            System.out.println(ar1[i]);
*/
//        数组动态初始化只指定长
//        虚拟机给出默认初始化值
        /*String[] arr =new String[50];
        System.out.println(arr[20]);*/
        //整数数组默认0
        //小数0.0
        //字符数组 '/u0000' 即空格
        //布尔 false
        //引用数据类型为null(String也为引用数据类型)
        /*int[] ar1={33,5,22,44,55};
        int sum=ar1[0];
        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i]>sum){
                sum=ar1[i];
            }
        }
        System.out.println("数组最大值为"+sum);*/
        /*Random r1=new Random();
        int[] ar1=new  int[10];
        int sum=0;
        for (int i = 0; i < ar1.length; i++) {
            ar1[i]=r1.nextInt(100)+1;
            System.out.print(" "+ar1[i]);
            sum=sum+ar1[i];
        }
        System.out.println("  合为"+sum);
        double avg=(double) sum/10;
        System.out.println("平均数"+avg);
        int count=0;
        for (int i = 0; i < ar1.length; i++) {
            if(ar1[i]<avg){
                count++;
            }

        }
        System.out.println("小于平均数的个数为"+count);*/
       /* int[] ar1={1,2,3,4,5};
        int temp;
        for (int i = 0,j=ar1.length-1; i < j; i++,j--) {
            temp=ar1[i];
            ar1[i]=ar1[j];
            ar1[j]=temp;

        }
        for (int i = 0; i < ar1.length; i++) {
            System.out.print(" "+ar1[i]);
        }*/
//        同一个类中方法名相同,传入参数不同(类型U顺序U个数)叫方法的重载
        //不看返回值
        //jvm靠实参的不同来区分同名的方法;比较

    }

}