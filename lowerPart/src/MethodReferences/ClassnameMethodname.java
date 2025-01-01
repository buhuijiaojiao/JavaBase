package MethodReferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class ClassnameMethodname {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc");
        //变为大写输出
        /*list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(s -> System.out.println(s));*/
        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
        //拿到流中的数据去调用数据本身所在类的方法来对自己进行操作  这虽然违背引用方法的规则（形参不同），但可以理解为数据本身就是形参
        //这种以类名引用成员方法的引用方式

    }
}
