import java.io.*;

public class BufferedBasicInputputStreamDemo {
    public static void main(String[] args) throws IOException {
        //使用字节输入缓冲流包装字节输出流
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("myio\\txt\\alist.png"));
        //使用字节输出缓冲流包装字节输出流
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("myio\\txt\\alllist.png"));
        //包装的目的是提高流读写性能，
        // 一次读写1个字节的数据到缓冲区
        /*int b;
        while ((b=bis.read())!=-1){
            bos.write(b);
        }*/
        // 一次读写多个字节的数据到缓冲区
        int len;
        byte[] bytes=new byte[1024];  //一次读写1KB
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        //默认缓冲区大小为8192，缓冲区满或关流时批量读写到文件，
        bos.close();
        bis.close();
    }
}
