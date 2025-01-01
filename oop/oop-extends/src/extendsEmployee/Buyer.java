package extendsEmployee;

public class Buyer extends AdminStaff {
    public Buyer() {

    }
    public Buyer(String id,String name){
        super(id,name);
    }

    @Override
    public void work() {
        System.out.println("采购专员"+getName()+"在进行采购工作");
    }
}
