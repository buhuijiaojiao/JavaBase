import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        //有多种构造方法 例如可以指定字符编码方式 有自动刷新开关但是底层没有缓冲区有没有自动刷新都是一样的
        PrintStream ps=new PrintStream(new FileOutputStream("myio\\printStream.txt"));
        //打印流的特有方法是打印数据原样 属于高级流 有自动刷新 可以打印任何数据
        ps.println(99);
        ps.print(100);
        ps.print(100);
        ps.print(100);
        ps.println();
        ps.printf("%d",1000);
        ps.close();
    }
}
