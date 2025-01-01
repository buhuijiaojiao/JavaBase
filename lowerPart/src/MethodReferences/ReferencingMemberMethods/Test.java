package MethodReferences.ReferencingMemberMethods;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"zhangsan","lisi");
//        list.stream().filter(new StringOpretion()::stringJudge).forEach(s-> System.out.println(s));
        list.stream().filter(new Test()::stringJudge).forEach(s-> System.out.println(s));
        //此处不能使用this：：因为静态方法不能使用非静态变量
    }
    public boolean stringJudge(String s){
        return s.startsWith("z") && s.length()==8;
    }
}
