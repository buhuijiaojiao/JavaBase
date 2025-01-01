package demo1;

public class BasketballCoaches extends Instructor{
    public BasketballCoaches() {
    }
    public BasketballCoaches(String name,int age){
        super(name,age);
    }

    @Override
    public void tech() {
        System.out.println(getName()+"在教打篮球");
    }
}
