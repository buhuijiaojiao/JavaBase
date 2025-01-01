package Collection.Traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {

        //创建集合
        Collection<String> coll=new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("vvv");
        coll.add("mmm");


        //1.迭代器遍历
        //创建迭代器
        Iterator<String> ter=coll.iterator();
        System.out.println(ter.hasNext());//判断迭代器中的（指针）指向的地方有没有元素

        while (ter.hasNext()){
            String str = ter.next(); //获取到指针指向的元素并移动指针指向下一个元素
            System.out.println(str);
        }
        //遍历完毕指针不会复位
        //先要再次遍历只能重新创建迭代器

        System.out.println("-----------------------");
        //2.增强for遍历
        for (String s : coll) {     //（元素类型 元素名 ：集合名)
            System.out.println(s);

        }
        System.out.println("------------");
        for (String s : coll) {
            s="qqq";
            System.out.println(s); //需要注意的是s只是一份复制品，修改s并不能改变集合中的元素
        }
        System.out.println(coll);


        //3.lambda表达式遍历 forEach（）方法遍历
        System.out.println("--------------------------");
        /*coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);   //传递进去这种规则：打印元素 foreach方法内部有进行遍历
            }
        });*/
        //lambda表达式写法
        coll.forEach(s -> System.out.println(s));
        //需要注意的是s只是一份复制品，修改s并不能改变集合中的元素
    }
}
