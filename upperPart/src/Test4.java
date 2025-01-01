import java.util.Random;

//定义方法实现随机生成一个五位的验证码 前四位是字母最后一位是数字
public class Test4 {
    public static void main(String[] args) {
        //把大写字母和小写字母都放到一个数组中
        char[] chars=new char[52];
        for (int i = 0; i < chars.length; i++) {
            if (i<=25){
                chars[i]=(char) (97+i);
            }else {
                chars[i]=(char) (65+i-26);
            }
        }
       /* for (int i = 0; i < chars.length; i++) {
            System.out.print(" "+chars[i]);
        }*/
        //生成随机索引
        Random r=new Random();
        int randomIndex=0;
        int randomNumber=r.nextInt(10);
        //取出字符并连接
        String result="";
        for (int i = 0; i < 4; i++) {
            randomIndex=r.nextInt(chars.length);
            result=result+chars[randomIndex];
        }
        result=result+randomNumber;
        System.out.println(result);
    }
}
