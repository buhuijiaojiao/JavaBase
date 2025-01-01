package IntegerDemo;

public class IntegerDemo3 {
    public static void main(String[] args) {
        int a=100;
        System.out.println(toBinaryString(a));
        System.out.println(Integer.toBinaryString(a));

    }
    public static  String toBinaryString(int number){
        //自己实现Integer.toBingaryString()
        //除基取余法
        StringBuilder sb=new StringBuilder();
        while (true){
            if (number==0){
                break;
            }
            //取余
            int remainder=number%2 ;
            //除基
            number=number/2;
            sb.insert(0,remainder);

        }
        return sb.toString();
    }
}
