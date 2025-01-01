package Serialize;

import java.io.*;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化流隶属于字节流
        //实际上是基本流进行包装成了高级流
        //创建反序列化流
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("myio\\txt\\b.txt"));
        ArrayList<Student> list = (ArrayList<Student>)ois.readObject(); //将反序列化得到的object对象强转
        System.out.println(list);
        //因为javabean中成员变量address前面加了transient关键字，所以就没有被序列化，故文件中就没有这个属性值的序列化数据
        //反序列化时就会显示初始化值为null
        //关流
        ois.close();

    }
}
