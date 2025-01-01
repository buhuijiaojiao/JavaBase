package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Brirthday {
    public static void main(String[] args) throws ParseException {
        //计算我活了多少天
        //JDK7
        String birthday = "2004年9月20日";
            //获取毫秒值
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        Date date=sdf.parse(birthday);
        System.out.println(date.getTime());

        long todayTime=System.currentTimeMillis();

            //计算间隔多少天
        long time=todayTime-date.getTime();
        System.out.println(time/1000/60/60/24);
        System.out.println("-----------------------------");
        //jdk8

        LocalDate ld1=LocalDate.of(2004,9,20);
        LocalDate ld2=LocalDate.now();
        long days= ChronoUnit.DAYS.between(ld1,ld2);
        System.out.println(days);
    }
}
