package RandomRollCaller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Test2 {
    /*
    * 需求：
        一个文件里面存储了班级同学的信息，每一个学生信息占一行。
        格式为： 张三-男-23。
        要求通过程序实现随机点名器。
        运行效果：
        70%的概率随机到男生
        30%的概率随机到女生
        总共随机100万次，统计结果。
        注意观察：看生成男生和女生的比例是不是接近于7：3
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("myio\\case\\name.txt"));
        ArrayList<String> list=new ArrayList<>();
        String line;
        while ((line=br.readLine())!=null){
            list.add(line);
        }
        br.close();
        //按照男女分别放到集合
        ArrayList<String> boyList=new ArrayList<>();
        ArrayList<String> girlList=new ArrayList<>();
        for (String s : list) {
            String gender=s.split("-")[1];
            if ("男".equals(gender)){
                boyList.add(s);
            } else if ("女".equals(gender)) {
                girlList.add(s);
            }
        }
        //抽取并统计
        extract(boyList,girlList);


    }
    public static void extract(ArrayList<String> boyList,ArrayList<String> girlList){
        //加权
        Integer[] arr={1,1,1,1,1,1,1,0,0,0};
        //1代表男生 0代表女生
        Random r=new Random();
        //统计
        HashMap<String,Integer> hm=new HashMap<>();
        //value代表抽到的次数
        hm.put("男",0);
        hm.put("女",0);
        while (true){
            //抽取开始
            int randomIndex=r.nextInt(10);
            if (arr[randomIndex]==1){
                //抽到男生
                hm.put("男",hm.get("男")+1);
                System.out.println(boyList.get(r.nextInt(boyList.size())));
            }else if (arr[randomIndex]==0){
                //抽到女生
                hm.put("女",hm.get("女")+1);
                System.out.println(girlList.get(r.nextInt(girlList.size())));

            }
            int countBoy=hm.get("男");
            int countGirl=hm.get("女");
            if (( countBoy+ countGirl == 1000000)){
                System.out.println("男生抽到"+countBoy+"次");
                System.out.println("女生抽到"+countGirl+"次");
                break;
            }
        }
    }
}
