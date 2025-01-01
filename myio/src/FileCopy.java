import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\33170\\Desktop\\Snipaste_2024-11-28_13-26-19.png");
        FileOutputStream fos=new FileOutputStream("myio\\txt\\alist.png");
        byte[] bytes=new byte[1024*1024*5];
        int len;
        while ((len=fis.read(bytes)) !=-1 ){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();

    }
}
