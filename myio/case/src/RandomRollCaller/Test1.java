package RandomRollCaller;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) throws IOException {
        /*
        * 需求：
        有一个文件里面存储了班级同学的信息，每一个信息占一行。
        格式为： 张三-男-23
        要求通过程序实现随机点名器。
        运行效果：
        第一次运行程序：随机同学姓名1（只显示名字）
        第二次运行程序：随机同学姓名2（只显示名字）
        第三次运行程序：随机同学姓名3 （只显示名字）
        * */
        //利用缓冲流把每行数据输入到list中
        BufferedReader br=new BufferedReader(new FileReader("myio\\case\\name.txt"));
        ArrayList<String> list=new ArrayList<>();
        ArrayList<String> newList=new ArrayList<>();
        String line;
        while ((line=br.readLine())!=null){
            list.add(line);
        }
        br.close();
//        System.out.println(list);
        //对读到的数据进行处理
        for (int i = 0; i < list.size(); i++) {
            newList.add(list.get(i).split("-")[0]);
        }
        Random r=new Random();
        System.out.println(newList.get(r.nextInt(newList.size())));

    }
}
