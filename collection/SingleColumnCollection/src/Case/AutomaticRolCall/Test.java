package Case.AutomaticRolCall;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //班里有N个学生，实现随机点名器
        //1.存储n个学生
        ArrayList<String> stu=new ArrayList<>();
        Collections.addAll(stu,"zhangsan","lisi","wangwu");
        System.out.println(stu );
        //2.随机点名
        Random r=new Random();
        System.out.println(stu.get(r.nextInt(stu.size())));
    }
}
