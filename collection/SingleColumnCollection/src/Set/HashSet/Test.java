package Set.HashSet;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Student> hashStu=new HashSet<>();
        Student s1=new Student("张三",14);
        Student s2=new Student("李四",14);
        Student s3=new Student("王五",14);
        Student s4=new Student("man!",14);
        hashStu.add(s1);
        hashStu.add(s2);
        hashStu.add(s3);
        hashStu.add(s4);
        System.out.println(hashStu); //无序
        //遍历
        /*//1.迭代器
        Iterator<Student> it=hashStu.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s);
        }
        //2.增强for
        for (Student s : hashStu) {
            System.out.println(s);
        }*/
        //3.lambda
        /*hashStu.forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student);
            }
        });*/
        hashStu.forEach(student -> System.out.println(student));
    }
}
