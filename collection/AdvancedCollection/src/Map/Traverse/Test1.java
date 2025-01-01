package Map.Traverse;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.Map.Entry;

public class Test1 {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<>();
        m.put("zhansan","damn");
        m.put("lisi","man");
        m.put("wangwu","mbot");
        //第一种遍历方式
        //通过键找值
        //先获取出键
//        Set<String> keys=m.keySet();
        //遍历键
        /*for (String key : keys) {

            System.out.println(key+"="+m.get(key));
        }*/
        /*Iterator<String> it=keys.iterator();
        while (it.hasNext()){
            String key=it.next();
            System.out.println(key+"="+m.get(key));
        }
*/
//        keys.forEach(key -> System.out.println(key+"="+m.get(key)));
        /*keys.forEach(new Consumer<String>() {
            @Override
            public void accept(String key) {
                System.out.println(key+"="+m.get(key));
            }
        });*/

        //第二种遍历方式
        //获取所有键值对对象使用Set集合存储
//        Set<Entry<String,String>> entrys=m.entrySet();
        /*//1.增强for
        for (Map.Entry<String, String> entry : entrys) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }*/
        /*//2.迭代器
        Iterator<Entry<String,String>> it=entrys.iterator();
        while (it.hasNext()){
            Entry<String,String> entry=it.next();
            System.out.println(entry.getKey()+"="+entry.getValue());
        }*/
        //3.lambda
        /*entrys.forEach(entry -> System.out.println(entry.getKey() + "=" + entry.getValue()));*/
        //第3种遍历方式
        //利用Biconsumer
//        m.forEach((String s, String s2) -> System.out.println(s+"="+s2));
    }
}
