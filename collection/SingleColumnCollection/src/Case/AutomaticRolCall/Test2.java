package Case.AutomaticRolCall;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        /*班级里有N个学生
    要求：
    70%的概率随机到男生 30%的概率随机到女生*/
        //定义1111111000的数组来表示概率
        final  int[] PROBABILITY={1,1,1,1,1,1,1,0,0,0};//Probability
        ArrayList<String> man=new ArrayList<>();
        ArrayList<String> women=new ArrayList<>();
        Collections.addAll(man,"zhansan","lisi","wangwu","yasuo");
        Collections.addAll(women,"liuyifei","zhanruonan","huli");
        //抽取男或女
        Random r=new Random();
        int sex=PROBABILITY[r.nextInt(10)];
        //到对应集合中进行点名
        if (sex==1){
            System.out.println(man.get(r.nextInt(man.size())));
        }else {
            System.out.println(women.get(r.nextInt(women.size())));
        }
    }

}
