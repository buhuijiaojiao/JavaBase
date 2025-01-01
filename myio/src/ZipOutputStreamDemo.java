import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        /*File src=new File("myio\\Zip\\a.txt");
        File dest=new File("myio\\Zip\\压缩实例");
        dest.mkdirs();
        toZip1(src,dest);*/
        File src=new File("myio\\txt");
        File dest=new File("myio\\Zip\\压缩实例");
        toZip2(src,dest);

    }
    //压缩单个文件

    public static void toZip1(File src,File dest) throws IOException {
        //src表示需要压缩的文件 dest表示压缩包存放的路径
        //1.打开压缩流并创建压缩包
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(new File(dest,"a.zip")));
        //2.创建压缩包文件对象
        ZipEntry entry=new ZipEntry("a.txt");
        //3.把文件对象关联到压缩包,压缩流指针指向entry
        zos.putNextEntry(entry);
        //4.把内容写入entry对象
        FileInputStream fis=new FileInputStream(src);
        int b;
        while ((b=fis.read())!=-1){
            zos.write(b);
        }


        fis.close();
        zos.close();
    }
    //压缩文件夹
    public static void toZip2(File src,File dest) throws IOException{
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(dest+"\\"+src.getName()+".zip"));
        files(src,zos,src.getName());
        zos.close();


    }
    public static void files(File src,ZipOutputStream zos,String name) throws IOException {
        for (File file : src.listFiles()) {
            if (file.isFile()){
                ZipEntry entry=new ZipEntry(name+"\\"+file.getName());
                zos.putNextEntry(entry);
                FileInputStream fis=new FileInputStream(file);
                int b;
                while ((b=fis.read())!=-1){
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            }else if (file.isDirectory()){
                files(file,zos,name+"\\"+file.getName());
            }
        }
    }

}

