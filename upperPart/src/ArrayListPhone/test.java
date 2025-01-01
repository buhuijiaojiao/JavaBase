package ArrayListPhone;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Phone p1=new Phone("小米",1998);
        Phone p2=new Phone("大米",2998);
        Phone p3=new Phone("realme",3998);
        ArrayList<Phone> phones=new ArrayList<>();
        phones.add(p1);
        phones.add(p2);
        phones.add(p3);
        phones=phonePr(phones,4000);
        for (int i = 0; i < phones.size(); i++) {
            System.out.println(phones.get(i).getBrand()+", "+phones.get(i).getPrice());
        }
    }
    public static ArrayList<Phone> phonePr(ArrayList<Phone> phones,int maxPrice){
        ArrayList<Phone> phones1=new ArrayList<>();
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getPrice()<=maxPrice){
                phones1.add(phones.get(i));

            }
        }
        return phones1;
    }
}
