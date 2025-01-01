package demo1;

public class Test {
    public static void main(String[] args) {
        Person p1=new Person("老王",30);
        Person p2=new Person("老李",25);
        Dog d=new Dog(2,"黑颜色");
        Cat c=new Cat(3,"灰颜色");

        String st1="骨头";
        String st2="鱼";
        p1.keepPet(d,st1);
        p2.keepPet(c,st2);

    }
}
