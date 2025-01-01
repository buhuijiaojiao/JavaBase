package Set.TreeSet;


import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student("zhangsan",14,92.5,68.5,69.0);
        Student s2=new Student("lisi",15,62.5,108.5,109.0);
        Student s3=new Student("wangwu",18,82.5,96.5,79.0);
        Student s4=new Student("man!",19,102.0,48.5,69.0);
        TreeSet<Student> ts=new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        System.out.println(s1.SumGrade());
        System.out.println(s2.SumGrade());
        System.out.println(s3.SumGrade());
        System.out.println(s4.SumGrade());
        System.out.println(ts);
    }
}
