package IntegerDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个1-100的整数");
            String s = sc.nextLine();
            int num=Integer.parseInt(s);
            if (num<1|num>100){
                System.out.println("异常数据");
                continue;
            }
            list.add(num); //自动装箱
            if (getListNum(list)>200) {
                System.out.println("数据和已超200");
                break;
            }
        }

    }
    private static int getListNum(ArrayList<Integer> list){
        int num=0;
        for (int i = 0; i < list.size(); i++) {
            num=num+list.get(i);
            //自动拆箱
        }
        return num;
    }
}
