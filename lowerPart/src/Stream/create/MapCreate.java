package Stream.create;

import java.util.HashMap;

public class MapCreate {
    //只能间接使用stream流
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("damn!",1);
        hm.put("man!",2);
        //总体思想：变为单列集合获取流
        //1.换取键set集合
        hm.keySet().stream().forEach(s -> System.out.println(s));
        //2.获取键值对set集合
        hm.entrySet().stream().forEach(entry-> System.out.println(entry.getKey()+" = "+entry.getValue()));
    }
}
