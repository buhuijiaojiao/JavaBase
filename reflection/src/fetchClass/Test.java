package fetchClass;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.通过静态方法获取Class对象
        Class clazz1=Class.forName("fetchClass.Person");
        //2.通过类名.class获取Class对象
        Class clazz2=Person.class;
        //3.通过对象.getClass()获取Class对象
        Person person=new Person("张三",23);
        Class clazz3=person.getClass();

    }
}
