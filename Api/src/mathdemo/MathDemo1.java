package mathdemo;

public class MathDemo1 {
    public static void main(String[] args) {
        System.out.println(isPrime(997));

    }
    public static boolean isPrime(int number){
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i ==0){
                return false;
            }
        }
        return true;
    }
}
