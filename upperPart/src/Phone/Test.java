package Phone;

public class Test {
    public static void main(String[] args) {
        Phone[] phones=new Phone[3];
        Phone p1=new Phone("vivo",2998,"白色");
        Phone p2=new Phone("oppo",1998,"红色");
        Phone p3=new Phone("realme",998,"黑色");
        phones[0]=p1;
        phones[1]=p2;
        phones[2]=p3;
        double sum=0;
        for (int i = 0; i < phones.length; i++) {
            sum=sum+phones[i].getPrice();
        }
        System.out.println("平均价格为:"+sum/ phones.length);
    }
}
