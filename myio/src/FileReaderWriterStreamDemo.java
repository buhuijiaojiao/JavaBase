import java.io.FileReader;
import java.io.IOException;

public class FileReaderWriterStreamDemo {
    public static void main(String[] args) throws IOException {
        //字符输入流
        //与字节流相比 字符流读取写入的单位是字符，是依照编码方式和字符集工作的
        FileReader fr=new FileReader("myio\\txt\\a.txt");
        //创建对象时会在内存中建立一个byte[8192]大小的缓存空间存储文件里的前8192个字节的数据
        //开始读取数据是会检验缓冲区中有没有数据，如果没有，则先把文件中存储的前8192个字节缓存到缓冲区
        //然后进行读取

        int len;
        char[] chars=new char[2];
        //带参read 底层 读取 解码 强转
        while ((len=fr.read(chars)) != -1){
            //有参read（）把读取， 解码， 强转，三部合并在一块了，返回读取到的字符个数;
            //无参返回读取到的字符的十进制表现形式（依照unicode表）
            //读到utf-8码 解码 转为以十进制打印
//            System.out.println(a);


            //依照utf-8解码 依照unicode转为汉字打印在控制台
            System.out.println(new String(chars,0,len));
        }
        //字符流的写也类似，程序将数据写入缓冲区，缓冲区满了才写入文件，或者可以调用刷新方法写入，关流时也会写入
        fr.close();
    }
}
