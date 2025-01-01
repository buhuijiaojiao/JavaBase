package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    //list继承Collection
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1); //int 1 自动装箱
        list.add(2);
        list.add(3);
        //这里的add是从父接口Collection继承下来ArrayList实现的add方法
        list.add(1,2);
        //这里的add是List接口中重载的方法，向指定索引插入，后面的元素依次后移 类似顺序表插入
        System.out.println(list);
        System.out.println(list.remove(2)); //传入int类型 删除指定索引的元素 这里打印时自动拆箱
        System.out.println(list.remove(Integer.valueOf(2)));//手动拆箱传Object o
        //17行使用List独有方法，18行是用的从父接口Collection继承下来的方法，都返回删除的元素，
        System.out.println(list.get(1)); //返回指定索引处的元素


        System.out.println("------------------------------");
        List<String> list1=new ArrayList<>();
        list1.add("aaa");
        list1.add("bbb");
        list1.add("ccc");
        list1.add("ddd");
        list1.add("eee");
        //遍历
//        1.迭代器 //可以删除元素
        Iterator<String> it=list1.iterator();
        System.out.println(list1);
        while (it.hasNext()){
            System.out.println(it.next());
//            it.remove();
        }
        System.out.println("-------------");
//        System.out.println(list1);
        //2.增强for
        for (String s : list1) {
            System.out.println(s);
        }
        System.out.println("------------");
        //3.lambda
        list1.forEach(s -> System.out.println(s));
        //Consumer接口的实现类对象简化，传入规则（即对遍历到的元素进行的操作）
        //4.普通for
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        System.out.println("--------------");
        //5.列表迭代器  //可添加元素
        ListIterator<String> listit=list1.listIterator();
        while (listit.hasNext()){
            String str = listit.next();
            System.out.println(str);
            listit.add("11111111");
        }
        System.out.println(list1);
    }
}
