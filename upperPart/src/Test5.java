import java.util.Scanner;

//评委打分
public class Test5 {
    public static void main(String[] args) {
        int[] scores=getScores();
        System.out.println(getAvg(getSum(scores),getMax(scores),getMin(scores),scores));
    }

    //接受评委分数
    public static int[] getScores(){
        int[] scores=new int[6];
        int score=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入评委打分");
        for (int i = 0; i < scores.length;) {
            score=sc.nextInt();
            if (score<0 || score>100){
                System.out.println("分数不合法,请重新输入");
            }else {
                scores[i]=score;
                i++;
            }
        }
        return scores;
    }
    //求分数最大值
    public static int getMax(int[] scores){
        int number=scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i]>number){
                number=scores[i];
            }
        }
        return number;
    }
    public static int getMin(int[] scores){
        int number=scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i]<number){
                number=scores[i];
            }
        }
        return number;
    }
    public static int getSum(int[] scores){
        int number=scores[0];
        for (int i = 1; i < scores.length; i++) {
            number=number+scores[i];
        }
        return number;
    }
    public static double getAvg(int sum,int max,int min,int[] scores){
        return (double) (sum-max-min)/(scores.length-2);
    }

}
