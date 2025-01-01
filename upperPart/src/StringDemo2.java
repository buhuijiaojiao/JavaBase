import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        //输入数据校验
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入金额");
        int money=sc.nextInt();
        if (money<0 || money>9999999){
            System.out.println("金额输入无效");
        }else {
            int index=0;
            String moneY="";
            while (true){
                index=money%10;
                //取出数字
                moneY=getCapitalNumber(index)+moneY;
                //转换并连接
                money=money/10;
                if(money==0){
                    index=0;
                    break;
                }
            }
//            System.out.println(moneY);
            moneY=addZero(moneY);
//            System.out.println(moneY);
            String stu = insertUnit(moneY);
            System.out.println(stu);
        }
    }
    //定义方法插入单位
    public static String insertUnit(String money){
        String[] unit={"佰","拾","万","仟","佰","拾","元"};
        String stu="";
        //取出需要加单位的子集
        for (int index = 0; index < money.length(); index++) {
            stu=stu+money.charAt(index)+unit[index];
        }
        return stu;
    }


    //定义方法加0
    public static String addZero(String moneY){
        int count=moneY.length();
        while (true){
            if (count<7){
                moneY="零"+moneY;
                count++;
            }else if(count==7){
                break;
            }

        }
        return moneY;

    }

    //定义一个方法把数字变成大写的中文

    public static String getCapitalNumber(int index) {
//定义数组,让数字跟大写的中文产生一个对应关系
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
        return arr[index];
    }
}
