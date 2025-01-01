import java.util.Scanner;

//卖飞机票
public class test2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入机票原价");
        int ticket=sc.nextInt();
        System.out.println("请输入当前月份");
        int mouth=sc.nextInt();
        System.out.println("请输入舱位代号(0 头等舱或 1 经济舱)");
        int seat=sc.nextInt();
        double newTicket=getTicket(ticket,mouth,seat);
        System.out.println("计算折扣后的票价为"+newTicket);
    }
    public static double getTicket(int ticlet,int mouth,int seat){
        //判空
        if (mouth<=0||mouth>12){
            System.out.println("月份不合法");
        }
        if(seat!=0&&seat!=1){
            System.out.println("舱位代号不合法");
            return 0;
        }
        //判断淡季旺季
        if (mouth>=5&&mouth<=10){
            //旺季
            Double ticlet1 = getwDouble(ticlet, seat);
            if (ticlet1 != null) return ticlet1;
        }
        else {
            //淡季
            Double ticlet1 = getdDouble(ticlet, seat);
            if (ticlet1 != null) return ticlet1;
        }
        return 1;

    }

    public static Double getdDouble(int ticlet, int seat) {
        if (seat ==0){
            return ticlet * 0.7;
        }
        if (seat ==1){
            return ticlet * 0.65;
        }
        return null;
    }

    public static Double getwDouble(int ticlet, int seat) {
        if (seat ==0){
            return ticlet * 0.9;
        }
        if (seat ==1){
            return ticlet * 0.85;
        }
        return null;
    }
}
