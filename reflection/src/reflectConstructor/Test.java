package reflectConstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("reflectConstructor.Student");
        // 获取所有public构造方法
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("===================================");
        // 获取所有权限修饰符构造方法
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        System.out.println("===================================");
        // 获取指定参数类型的公有构造方法
        Constructor constructor = clazz.getConstructor(String.class, int.class, String.class);
        System.out.println(constructor);
        System.out.println("-----------------------------------");
        // 获取指定参数类型的非共有构造方法
        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class);
        System.out.println(declaredConstructor);
        System.out.println("-----------------------------------");

        Constructor declaredConstructor1 = clazz.getDeclaredConstructor(int.class);
        System.out.println(declaredConstructor1);
        System.out.println("-----------------------------------");

        //获取构造方法修饰符(权限修饰符以int数字形式返回，而且都是2的倍数,如public是1，private是2，protected是4,这样的话可以通过&运算符判断是否有某个权限修饰符，效率很高)
        int modifiers = declaredConstructor.getModifiers();
        System.out.println(modifiers);
        System.out.println("*-----------------------------------*");
        // 获取构造方法名称
        System.out.println(declaredConstructor.getName());
        System.out.println("*-----------------------------------*");
        // 获取构造方法参数类型
        Class[] parameterTypes = constructor.getParameterTypes();
        for (Class parameterType : parameterTypes) {
            System.out.println(parameterType);
        }
        System.out.println("*-----------------------------------*");
        //创建对象
        Student student = (Student) constructor.newInstance("张三", 23, "北京");
        System.out.println(student);
        System.out.println("*-----------------------------------*");
        //暴力反射创建对象
        declaredConstructor.setAccessible(true);
        Student student1 = (Student) declaredConstructor.newInstance("李四");
        System.out.println(student1);



    }
}
