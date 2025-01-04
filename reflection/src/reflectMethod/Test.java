package reflectMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz = Class.forName("reflectMethod.Dog");
//        System.out.println(clazz.getName());
        Method[] methods = clazz.getMethods();
        //包含虚方法表中的方法
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        System.out.println("===================================");
        //所有成员方法，包括私有方法不包括继承的方法
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method.getName());
        }
        System.out.println("===================================");
        //获取指定非public方法，java要求参数列表是为了区分重载方法
        Method eat = clazz.getDeclaredMethod("eat", String.class);
        System.out.println(eat);
        System.out.println("-----------------------------------");
        Method sleep = clazz.getDeclaredMethod("sleep");
        System.out.println(sleep);
        System.out.println("-----------------------------------");
        //获取指定public方法
        Method bark = clazz.getMethod("bark");
        System.out.println(bark);
        System.out.println("-----------------------------------");
        //获取方法名
        System.out.println(bark.getName());
        System.out.println("*---------------------------------*");
        //获取返回值类型
        System.out.println(bark.getReturnType());
        System.out.println("*---------------------------------*");
        //获取参数列表
        Parameter[] parameters = eat.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }
        System.out.println("*---------------------------------*");
        //获取异常
        Class[] exceptionTypes = sleep.getExceptionTypes();
        for (Class exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }
        //获取方法的修饰符
        System.out.println(bark.getModifiers());
        System.out.println(bark.getModifiers() == 1);
        System.out.println("*---------------------------------*");



        //运行方法 第一个参数是调用者，第二个参数是方法的参数
        Object shit = eat.invoke(new Dog(), "shit");
        //方法私有，暴力反射运行方法
        sleep.setAccessible(true);
        sleep.invoke(new Dog());
    }

}
