package demo1;

public class BasketballPlayer extends Athlete{
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println(getName()+"在学打篮球");
    }
}
