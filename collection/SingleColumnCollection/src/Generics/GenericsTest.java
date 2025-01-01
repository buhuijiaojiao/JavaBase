package Generics;

public class GenericsTest {
    public static void main(String[] args) {
        Generics<Integer> ina= new Generics<Integer>();
        ina.add(123);
        ina.add(124);
        ina.add(8898);

        System.out.println(ina.get(2));

        System.out.println(ina);
    }
}
