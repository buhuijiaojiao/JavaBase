import java.io.*;

public class BufferedReaderWriterStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("myio\\txt\\a.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("myio\\txt\\b.txt"));
        //字符缓冲流对性能提升不大，因为基本流涵盖缓冲区
        //包装的目的是为了使用其特有方法
       /* //输入流
        String line1 = br.readLine();//读取一行数据；并移动指针
        String line2 = br.readLine();
        String line3 = br.readLine();
        //输出流

        bw.write(line1);
        bw.newLine();//跨平台换行
        bw.write(line2);
        bw.newLine();//跨平台换行
        bw.write(line3);
        bw.newLine();//跨平台换行
*/
        //以行为单位读写文件（缓冲区8192个字符）
        String line=null;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
