package Stream.Finish.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"zhangsan","lisi","wangwu","lisi");

        //toArray 把流中的数据填入创建的数组  （new）传入参数是new出数组的长度，这个接口实现对象只是new了一个数组存放数据(类型需要改写)
        list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        //收集并转换为字符串打印
        System.out.println(Arrays.toString(list.stream().toArray(value -> new String[value])));
    }
}
