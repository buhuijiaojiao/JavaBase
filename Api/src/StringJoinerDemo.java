import java.util.StringJoiner;

public class StringJoinerDemo {
    //较之StringBuider 创建对象时可增加每个字符元素的分隔符和容器首尾符
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner("---");
        StringJoiner sj2=new StringJoiner("---","[","]");
        System.out.println( sj.add("aaa").add("bbb").add("ccc"));
        System.out.println(sj2.add("aaa").add("bbb").add("ccc"));
        System.out.println(sj.length()); //长度表示字符格数
        System.out.println(sj2.length()); //长度表示字符格数
        System.out.println(sj.toString());
        System.out.println(sj2.toString());
    }
}
