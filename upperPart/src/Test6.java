import java.util.Scanner;
//数字加密或解密
public class Test6 {
    public static final int NUM=5;
    public static final int NUM2=10;
    //数字加密 都+5然后取余 再反转
    public static void main(String[] args) {


        //取数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入所要加密的密码");
        int number=sc.nextInt();
        int[] ar1=getNumbers(number);
        ar1=getNumber(ar1);
        number=getNumbers(ar1);
        System.out.println(number);
        System.out.println("------------------------------");
        int[] ar2=getNumbers(number);
        ar2=getUnNumber(ar2);
        number=getNumbers(ar2);
        System.out.println("解密密码为"+number);

    }
    //把数字分开存到数组或合起来
    public static int[] getNumbers(int number){
        int count=0;
        int temp=number;
        while(temp!=0){
            temp=temp/10;

            count++;

        }
        int[] arr=new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=number-number/10*10;
            number=number/10;
        }

        return arr;
    }
    public static int getNumbers(int[] numbers){
        int number=0;
        for (int i = 0; i < numbers.length; i++) {
            number=number*10+numbers[i];
        }
        return number;


    }

    //加5取余(10)
    public static int[] getNumber(int [] numbers){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=numbers[i]+NUM;
            numbers[i]=numbers[i]%NUM2;

        }
        return numbers;

    }
    public static int[] getUnNumber(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>=0 && numbers[i]<=4){
                numbers[i]=numbers[i]+10-5;
            }else {
                numbers[i]=numbers[i]-5;
            }
        }
        return numbers;
    }
    //反转
    public static int[] passWarded(int[] numbers){
        int temp=0;
        for (int i = 0,j=numbers.length-1; i <j; i++,j--) {
            if (numbers[i]!=numbers[j]) {
                numbers[i]=temp;
                numbers[i]=numbers[j];
                numbers[j]=temp;
            }

        }
        return numbers;
    }
}

