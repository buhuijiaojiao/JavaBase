package Stream.Finish;

import java.util.ArrayList;
import java.util.Collections;

public class StreamFinish {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"zhangsan","lisi","wangwu","lisi");
        list.stream().forEach(s-> System.out.println(s));//遍历
        System.out.println(list.stream().count());//统计

    }
}
