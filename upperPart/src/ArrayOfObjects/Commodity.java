package ArrayOfObjects;

public class Commodity {
    private int id;
    private String name;
    private double price;
    private int inventory;
    public Commodity(){

    }
    public Commodity(int id,String name,double price,int inventory){
        this.id=id;
        this.name=name;
        this.price=price;
        this.inventory=inventory;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public void setInventory(int inventory){
        this.inventory=inventory;
    }
    public int getInventory(){
        return inventory;
    }

}
