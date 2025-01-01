package Map.Case.c2;


import java.util.*;

public class Test {
    public static void main(String[] args) {
//        1.先让同学们投票
        Random r=new Random();
        String[] st={"A","B","C","D"};
        ArrayList<String> list =new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            list.add(st[r.nextInt(st.length)]);
        }
        System.out.println(list);
//        统计每个景点的人数 统计次数较大，不便用计数器思想
        HashMap<String,Integer> hm=new HashMap<>();

        for (String name : list) {
            //遍历list取出投票纪录
            if(hm.containsKey(name)){
                int count=hm.get(name)+1;
                hm.put(name,count);
                //如果存在取出次数加一再覆盖
            }else {
                hm.put(name,1);
                //不存在则hm新增一个键值对
            }
        }
        System.out.println(hm);

        //选出人数最多的景点
        int max=0;
//        System.out.println(hm.values());
        Set<Map.Entry<String,Integer>> entries=hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int count= entry.getValue();
            if (count>max){
                max=count;
            }
        }
        System.out.println(max);
        //每个景点的人数可能重复
        //根据值查出景点
        for (Map.Entry<String, Integer> entry : entries) {
            int value = entry.getValue();
            if (value==max){
                System.out.println(entry.getKey());
            }
        }
    }
}
