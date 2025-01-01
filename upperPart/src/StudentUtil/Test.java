package StudentUtil;

import java.util.ArrayList;



public class Test {
    public static void main(String[] args) {
        Student stu1=new Student("zhangsan",18);
        Student stu2=new Student("zhangsan2",28);
        Student stu3=new Student("zhangsan3",38);
        ArrayList<Student> students= new ArrayList<>();
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        System.out.println(StudentUtil.maxAgeStudent(students));

    }
}
