package Stream.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        List<Integer> newlist=list.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());

    }
}
