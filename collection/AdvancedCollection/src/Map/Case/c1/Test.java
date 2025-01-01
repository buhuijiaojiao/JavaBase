package Map.Case.c1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<Student,String > map=new HashMap<>();
        Student s1=new Student("zhangsan",12);
        Student s2=new Student("lisi",13);
        Student s3=new Student("wangwu",22);
        Student s4=new Student("zhangsan",12);
        map.put(s1,"山东");
        map.put(s2,"新乡");
        map.put(s3,"吉林");
//        map.forEach(((student, s) -> System.out.println(student+": "+s)));
        //键值对遍历
        Set<Map.Entry<Student,String>> entries=map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        map.put(s4,"济南");
//        map.forEach(((student, s) -> System.out.println(student+": "+s)));
        //预存键，遍历键找值
        Set<Student> keys=map.keySet();
        keys.forEach( student-> System.out.println(student+":"+map.get(student)));

    }
}
