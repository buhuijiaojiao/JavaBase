import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipInputStreamDemo {
    public static void main(String[] args) throws IOException {
        unZip(new File("myio\\Zip\\解压实例.zip"),new File("myio\\Zip"));
    }
    public static void unZip(File src,File dest) throws IOException {
        //创建压缩包内文件夹时我在win系统中创建，默认编码方式是GBK，所以解压缩流需要以GBK读取压缩包才能识别出里面的文件
        ZipInputStream zis=new ZipInputStream(new FileInputStream(src), Charset.forName("GBK"));
        ZipEntry entry; //接受解压缩流读取的对象
        while ((entry=zis.getNextEntry())!=null){
            //移动指针遍历所有文件对象
            if (entry.isDirectory()){
                //如果压缩包内文件是文件夹
                //则不需要流处理，只需在目标路径新建文件夹
                new File(dest,entry.getName()).mkdirs();
            }else {
                //如果压缩包内文件是普通文件
                //就需要输出流把文件输出
                FileOutputStream fos=new FileOutputStream(new File(dest,entry.getName()));
                int b;
                while ((b=zis.read())!=-1){
                    //解压缩流读 指针所指向的entry
                    fos.write(b);
                }
                fos.close();
            }
        }
        zis.close();
    }
}
