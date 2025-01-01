//101~200间有多少质数
public class Test3 {
    public static void main(String[] args) {
        int count=0;
        System.out.println("101~200间的质数有:");
        for (int i = 200; i >=101; i--) {
            if (primeNumber(i)) {
                System.out.println(i+" ");
                count++;
            }
        }
        System.out.println("一共有"+count+"个");

    }
    //判断是否为质数方法
    public static boolean primeNumber(int i){
        for (int j=2;j<i;j++){
            if (i%j==0) {
                return false;
            }
        }
        return true;
    }
}
