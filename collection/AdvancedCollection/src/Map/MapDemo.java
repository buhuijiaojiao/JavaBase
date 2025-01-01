package Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("刀哥",100);
        m.put("神鹰",200);
        m.put("虎哥",300);
        System.out.println(m);
        //返回被覆盖的键的值，若未覆盖返回null
        System.out.println(m.put("刀哥",101));
        System.out.println(m.put("杀马特团长",400));

        System.out.println(m.remove("刀哥"));
        //返回删除的键的值


        System.out.println(m.containsKey("刀哥"));
        System.out.println(m.containsValue(101));
        //判断键或值是否存在


        System.out.println(m.isEmpty());
        //判空

        System.out.println(m.size());



        System.out.println(m);
    }
}
