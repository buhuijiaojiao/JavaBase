package IntegerDemo;

public class Integer2Demo {
    public static void main(String[] args) {
        //自己实现了Intger.parseInt()的效果
        String str="123456";
        //正则表达式校验
        if (!str.matches("[1-9]\\d{0,9}")){
            System.out.println("字符串格式错误");
        }else {
            System.out.println("格式正确");
            //转换
            int number=0;
            for (int i = 0; i < str.length(); i++) {
                int c=str.charAt(i)-'0';
                number=number*10+c;
            }
            System.out.println(number);
        }
    }
}
