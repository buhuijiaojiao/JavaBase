package Stream.control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamControl {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"zhangsan","lisi","wangwu","lisi");
        list.stream().filter( s-> s.startsWith("z"))
                     .filter(s->s.length()==8)
                     .forEach(s -> System.out.println(s));
        System.out.println("------------------------------");
        list.stream().limit(3).skip(1).forEach(s-> System.out.println(s));
        System.out.println("------------------------------");
        list.stream().distinct().forEach(s-> System.out.println(s));
        //依赖hashcode（）和equsl（），底层使用Hashset去重
        System.out.println("-----------------------------");

        //对流进行操作后流会自动释放，创建流时不会改变原来集合的元素
        Stream<String> a=list.stream();
        Stream<String> b=list.stream();
        Stream.concat(a,b).forEach(s-> System.out.println(s));
        System.out.println("-------------------------------");



    }
}
