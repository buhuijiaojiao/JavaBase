package Serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //创建序列化流
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("myio\\txt\\b.txt"));
        //创建需要序列化的对象
        Student s1=new Student("张三",20,"damn!1");
        Student s2=new Student("李四",22,"damn!2");
        Student s3=new Student("王五",28,"damn!3");
        Student s4=new Student("废物刀",40,"damn!4");
        ArrayList<Student> list=new ArrayList<>();
        Collections.addAll(list,s1,s2,s3,s4);
        //将list序列化，保存在b.txt
        oos.writeObject(list);
        //关流
        oos.close();
    }
}
