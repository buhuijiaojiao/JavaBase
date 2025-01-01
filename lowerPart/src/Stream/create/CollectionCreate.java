package Stream.create;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionCreate {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        Collections.addAll(arr,"damn!","man!");
        arr.stream().forEach(s-> System.out.println(s));
    }
}
