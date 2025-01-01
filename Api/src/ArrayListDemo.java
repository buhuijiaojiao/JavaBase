import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //泛型 泛指引用数据类型:限定集合中存储数据的数据类型 <E>
        //ArrayList<String> list =new ArrayList<String>();
        //jdk12以后new ArrayList后面的<可省略>,如下
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);
        //toString()方法已重写,打印为数据
        //add
        list.add("bilibili");
        System.out.println(list.add("aaaaaa"));
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);

        //remove
        list.remove("aaaaaa");
        System.out.println(list);
        System.out.println(list.remove("aaaaaa")); //不存在返回false
        System.out.println(list);
            //重载方法传入索引删除 返回值是被删除的元素
        System.out.println(list.remove(1));
        //set 修改 返回被覆盖的元素
        System.out.println(list.set(0,"aaa"));
        System.out.println(list);
        //查询 get 长度 int size();


    }
}
