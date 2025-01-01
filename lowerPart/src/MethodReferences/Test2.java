package MethodReferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");
        /*for (String s : list) {
            System.out.println(Integer.parseInt(s));
        }*/
        /*list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        });*/
        list.stream().map(Integer::parseInt).forEach(i-> System.out.println(i));
    }
}
