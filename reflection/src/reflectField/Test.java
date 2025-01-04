package reflectField;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class clazz = Class.forName("reflectField.People");
        /*
        * class类中用于获取成员变量的方法
        * 返回所有公共成员变量对象的数组
        * Field[] getFields () :
        * 返回所有成员变量对象的数组
        * Field[] getDeclaredFields() :
        * 返回单个公共成员变量对象
        * Field getField(String name ) :
        * 返回单个公共成员变量对象
        * Field getDeclaredField（String name）： 返回单个 成员变量对象
        * */

        // 获取所有公共成员变量对象的数组
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("====================================");
        // 获取所有成员变量对象的数组
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("====================================");
        // 返回单个公共成员变量对象
        Field field = clazz.getField("address");
        System.out.println(field);
        System.out.println("------------------------------------");
        // 返回单个成员变量对象
        Field declaredField = clazz.getDeclaredField("name");
        System.out.println(declaredField);
        System.out.println("------------------------------------");
        Field declaredField1 = clazz.getDeclaredField("age");
        System.out.println(declaredField1);
        System.out.println("====================================");

        // 获取成员变量的类型
        System.out.println(field.getType());
        System.out.println(declaredField.getType());
        System.out.println(declaredField1.getType());
        System.out.println("*------------------------------------*");
        // 获取成员变量的值
        System.out.println(field.getName());
        System.out.println(declaredField.getName());
        System.out.println(declaredField1.getName());
        System.out.println("*------------------------------------*");
        // 设置成员变量的值(暴力反射)
        People people = new People();
        field.set(people, "北京");
        declaredField.setAccessible(true);
        declaredField.set(people, "张三");
        declaredField1.set(people,23);
        System.out.println(people);
        System.out.println("*------------------------------------*");
        // 获取成员变量的修饰符以整数形式返回
        int modifiers = field.getModifiers();
        System.out.println(modifiers);
        int modifiers1 = declaredField.getModifiers();
        System.out.println(modifiers1);
        int modifiers2 = declaredField1.getModifiers();
        System.out.println(modifiers2);
        System.out.println("*------------------------------------*");
        // 获取成员变量的名称
        String name = field.getName();
        System.out.println(name);
        String name1 = declaredField.getName();
        System.out.println(name1);
        String name2 = declaredField1.getName();
        System.out.println(name2);
        System.out.println("*------------------------------------*");


    }
}
