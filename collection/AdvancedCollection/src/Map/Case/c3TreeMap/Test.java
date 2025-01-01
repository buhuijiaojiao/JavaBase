package Map.Case.c3TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        /*TreeMap<Integer,String> treeMap1=new TreeMap<>((o1, o2)-> o2-o1);
        treeMap1.put(01,"baba");
        treeMap1.put(02,"didi");
        treeMap1.put(03,"vivi");
        treeMap1.put(05,"bidfsaidi");
        System.out.println(treeMap1);
        System.out.println("------------------------");*/

        TreeMap<Student,String> treeMap2=new TreeMap<>();
        Student s1=new Student("zhangsan",12);
        Student s2=new Student("lisi",32);
        Student s3=new Student("wangwu",22);
        Student s4=new Student("a",22);

        treeMap2.put(s1,"山东");
        treeMap2.put(s2,"濮阳");
        treeMap2.put(s3,"新乡");
        treeMap2.put(s4,"新乡");
        System.out.println(treeMap2);
    }
}
