package Map.Case.c4TreeMap;

import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        String stu="aababcabcdabcde";
        TreeMap<Character,Integer> treeMap=new TreeMap<>();
        for (int i = 0; i < stu.length(); i++) {
            char c = stu.charAt(i);
            if (treeMap.containsKey(c)){
                int count=treeMap.get(c);
                count++;
                treeMap.put(c,count);
            }else {
                treeMap.put(c,1);
            }
        }
        System.out.println(treeMap);
        StringBuilder sb=new StringBuilder();
        //遍历集合取出键和值
        treeMap.forEach((key,count)->sb.append(key).append("("+count+")"));
        System.out.println(sb.toString());
    }


}
