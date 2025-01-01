import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("myio\\txt\\a.txt");
        //如果想要追加写入，只需换个构造方法，后面设置续写开关为true
        //创建对象其实就是建立了一个通道(程序和外存间的)
//        fos.write(97);

        String s = "abcdefg\r\n";
//        fos.write(bytes);
//        fos.write(bytes,1,3);
        fos.write(s.getBytes());

        fos.close();

        FileInputStream fis = new FileInputStream("myio\\txt\\a.txt");
        int b;
        while (( b=fis.read()) != -1) {
            System.out.print((char) b);
        }
        fis.close();


    }
}