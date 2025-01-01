package wenzigedou;

import java.util.Random;

public class Role {
    private String name;
    private int blood;


    public Role(){

    }
    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setBlood(int blood){
        this.blood=blood;
    }

    public int getBlood() {
        return blood;
    }

    public String getName(){
        return name;
    }
    //攻击
    public void attack(Role rcle){

        Random r1=new Random();
        //造成1~20点血的伤害
        int hurt=r1.nextInt(20)+1;
        //rcle剩余血量
        int remainBlood=rcle.getBlood()-hurt;
        remainBlood= remainBlood<0 ? 0 : remainBlood;
        rcle.setBlood(remainBlood);
        System.out.println(this.name+"打了"+rcle.getName()+"一拳"+
                "造成了"+hurt+"点伤害"+rcle.getName()+"还有"+
                rcle.getBlood()+"点血");
    }


}
