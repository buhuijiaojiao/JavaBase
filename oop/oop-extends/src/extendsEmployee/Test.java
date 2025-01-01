package extendsEmployee;

public class Test {
    public static void main(String[] args) {
        Buyer b1=new Buyer();
        b1.setId("heimabuyer001");
        b1.setName("神鹰");
        b1.work();

        Teacher t1=new Teacher("heimajiaoyanbu01","teacher");
        t1.work();
        System.out.println(t1.getId());
    }
}
