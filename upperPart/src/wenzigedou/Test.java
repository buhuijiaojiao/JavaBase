package wenzigedou;

public class Test {
    public static void main(String[] args) {
        Role r1=new Role("刀哥",100);
        Role r2=new Role("神鹰黑手哥",500);
        while (true){
            r1.attack(r2);

            if (r2.getBlood()==0){

                System.out.println(r1.getName()+"KO了"+r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood()==0){
                System.out.println(r2.getName()+"让"+r1.getName()+"飞起来了");

                break;
            }
        }
    }
}
