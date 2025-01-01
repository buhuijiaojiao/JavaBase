package Map.Case.c5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringJoiner;
import java.util.function.BiConsumer;

public class Test {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm=new HashMap<>();
        ArrayList<String> c1=new ArrayList<>();
        ArrayList<String> c2=new ArrayList<>();
        ArrayList<String> c3=new ArrayList<>();
        Collections.addAll(c1,"a","b","c","d");
        Collections.addAll(c2,"a","b","c","d");
        Collections.addAll(c3,"a","b","c","d");
        hm.put("jiangsu",c1);
        hm.put("hubei",c2);
        hm.put("hebei",c3);
        System.out.println(hm);
        StringJoiner sj=new StringJoiner(" ,","","");
        hm.forEach(new BiConsumer<String, ArrayList<String>>() {
            @Override
            public void accept(String k, ArrayList<String> v) {
                StringJoiner sj=new StringJoiner(" ,","","");
                for (String s : v) {
                    sj.add(s);
                }
                System.out.println(k+" = "+sj.toString());

            }
        });



    }
}
