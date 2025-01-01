package MethodReferences.case1.c1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student s1=new Student("zhangsan",20);
        Student s2=new Student("lisi",18);
        Student s3=new Student("wangwu",22);
        Student s4=new Student("manba",29);
        Collections.addAll(list,s1,s2,s3,s4);
        System.out.println(Arrays.toString(list.stream().map(Student::getName).toArray(String[]::new)));

    }
}
