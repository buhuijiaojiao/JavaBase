package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        //接口多态方式创建对象
        Collection<Student> stco=new ArrayList<>();
        Student s1=new Student("zhangsan",12);
        Student s2=new Student("lisi",14);
        Student s3=new Student("wangwu",15);
        Student s4=new Student("niuma",16);

        stco.add(s1);
        stco.add(s2);
        stco.add(s3);
        stco.add(s4);
        //add返回布尔类型，线性集合有序，可重复，有索引，必定返回true
//        stco.clear();
//        System.out.println(stco);
        //集合清空
        System.out.println(stco.size());
        //集合长度
        System.out.println(stco.remove(s2));
        //删除操作，成功返回ture否则返回false  共性方法只能通过对象删除，不能通过索引
        System.out.println(stco.contains(s2));//student类中重写了equls，所以是看的数据，有元素的数据和s2一样则返回为真
        //判断元素是否存在于集合中 ，底层挨个遍历依赖equls比较数据，
        // 如果集合中的对象类中没有重写equls，那默认使用obj中的equls，比较的是地址值
        System.out.println(stco.isEmpty());
        //判空 通过集合长度判断

    }
}
