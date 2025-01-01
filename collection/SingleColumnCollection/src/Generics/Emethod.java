package Generics;

import java.util.ArrayList;

public class Emethod {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        ListUtil.addAll(list,"bili","bobo");
        System.out.println(list);
    }
}
class ListUtil{
    public static <E> void addAll(ArrayList<E> list,E e1,E e2){
        list.add(e1);
        list.add(e2);

    }
}
