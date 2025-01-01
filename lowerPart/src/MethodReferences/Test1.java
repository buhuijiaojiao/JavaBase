package MethodReferences;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5,6,7,8};
//        Arrays.sort(arr, ( o1, o2)->o2-o1);
        Arrays.sort(arr,Test1::getSum);
        System.out.println(Arrays.toString(arr));


    }
    public static int getSum(Integer a,Integer b){
        return b-a;
    }
}
