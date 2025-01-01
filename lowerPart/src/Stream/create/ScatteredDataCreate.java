package Stream.create;

import java.util.stream.Stream;

public class ScatteredDataCreate {
    public static void main(String[] args) {
        //零散数据使用Stream中的静态方法获取流
        Stream.of("a","b","c","d").forEach(s-> System.out.println(s));
        Stream.of(1,2,3,"d").forEach(s-> System.out.println(s));
        Stream.of(1,2,3,4).forEach(s-> System.out.println(s));
        //可变参数，底层是一个数据，所以可以传递数组
        Stream.of(new int[]{1,2,1}).forEach(ints -> System.out.println(ints));
        //基本数据类型的数组不会自动装箱，流会把这个数组当成一个数据来处理，打印的是地址值
        Stream.of(new String[]{"a","b","c"} ).forEach(s -> System.out.println(s));
    }
}
