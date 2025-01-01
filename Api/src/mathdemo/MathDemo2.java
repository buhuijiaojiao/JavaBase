package mathdemo;

public class MathDemo2 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 1000; i < 9999; i++) {
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/100%10;
            int qian=i/1000%10;
            double sum=Math.pow(ge,4)+Math.pow(shi,4)+
                        Math.pow(bai,4)+Math.pow(qian,4);
            if (sum==i){
                count++;
                System.out.println(i);
            }


        }
        System.out.println(count);
    }
}
