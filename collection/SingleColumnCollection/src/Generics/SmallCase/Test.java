package Generics.SmallCase;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        PersianCat persianCat=new PersianCat();
        LiHuaCat liHuaCat=new LiHuaCat();
        TeddyDog teddyDog=new TeddyDog();
        HuskyDog huskyDog=new HuskyDog();
        persianCat.setAge(10);
        persianCat.setName("bosi");
        liHuaCat.setAge(12);
        liHuaCat.setName("lihua");
        ArrayList<LiHuaCat> list1=new ArrayList<>();
        ArrayList<PersianCat> list2=new ArrayList<>();
        list1.add(liHuaCat);
        list2.add(persianCat);
        keepPet(list1);
        keepPet(list2);
    }
    public static void keepPet(ArrayList<?extends Cat> list){
        //要求1
        for (Cat cat : list) {
            cat.eat();
        }
    }
}
