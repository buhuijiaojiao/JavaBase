package Stream.create;

import java.util.Arrays;

public class ArrayCreate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        String[] s={"a","b","c","d"};
        Arrays.stream(arr).forEach(i-> System.out.println(i));
        Arrays.stream(s).forEach(s1-> System.out.println(s1));
    }
}
