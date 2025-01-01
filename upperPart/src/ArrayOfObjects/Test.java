package ArrayOfObjects;

public class Test {
    public static void main(String[] args) {
        Commodity c1= new Commodity(001,"神鹰飞行手册",888,10);
        Commodity c2= new Commodity(002,"刀哥劈瓜手册",888,10);
        Commodity c3= new Commodity(003,"虎哥回眸手册",888,10);
        Commodity[] commodities={c1,c2,c3};
        for (int i = 0; i < commodities.length; i++) {
            System.out.println("商品id:"+commodities[i].getId()+
                               " 商品名:"+commodities[i].getName()+
                               " 商品价格 :"+commodities[i].getPrice()+
                               " 商品库存 :"+commodities[i].getInventory()
                                );
        }
    }
}
