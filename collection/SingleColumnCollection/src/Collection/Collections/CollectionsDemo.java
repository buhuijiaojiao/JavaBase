package Collection.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        System.out.println(Collections.addAll(arrayList, 1, 2, 3, 4, 5, 6));
        System.out.println(arrayList);
        System.out.println("----------------------");
        Collections.shuffle(arrayList);
        System.out.println( arrayList);
        System.out.println("----------------------");
        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println("------------------------");
        Collections.sort(arrayList, (o1, o2) ->o2-o1);
        System.out.println(arrayList);
        System.out.println(Collections.binarySearch(arrayList, 5));
        System.out.println(Collections.binarySearch(arrayList, 5, (o1, o2) -> o2 - o1));
        System.out.println("-------------------------");
        List<Integer> list=new ArrayList<>();
        Collections.addAll(list,0,0,0,0,0,0,0,0,0,0);
        Collections.copy(list,arrayList);
        System.out.println(list);
        System.out.println("-------------------------");
        /*Collections.fill(arrayList,100);
        System.out.println(arrayList);*/
        System.out.println("--------------------------");
        System.out.println(Collections.max(arrayList));
        System.out.println(Collections.min(arrayList));
        System.out.println("---------------------------");
        System.out.println(arrayList);
        Collections.swap(arrayList,0,5);
        System.out.println(arrayList);

    }
}

