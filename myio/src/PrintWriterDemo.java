import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        //默认关闭自动刷新 其他和字节打印流一样，都是打印原样数据，只是用来包装字符输出流
        PrintWriter pw=new PrintWriter(new FileWriter("myio\\printWriter.txt"),true);
        pw.println(97);
        pw.close();
    }
}
