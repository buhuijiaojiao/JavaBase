
package CopyfileCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FolderCopy(new File("E:\\实践周"),new File("myio\\Copy"));
    }
    public static void FolderCopy(File f1,File f2) throws IOException {
        //f1拷贝到f2
//        FileInputStream fis=new FileInputStream("D:\\ZXD\\Documents\\javaweb");
//        FileOutputStream fos=new FileOutputStream("myio\\javawebCopy");

        byte[] bytes=new byte[1024*1024*10];
        int len;
        for (File file : f1.listFiles()) {
            if (file.isFile()){
                FileInputStream fis=new FileInputStream(file);
                FileOutputStream fos=new FileOutputStream(new File(f2,file.getName()));
                //父级路径存在自动创建文件
                while ((len=fis.read(bytes))!=-1){
                   fos.write(bytes,0,len);
                }
                fos.close();
                fis.close();
            }
            if (file.isDirectory()){
                File directoryCopy =new File(f2,file.getName());
                //在副本文件夹下面创建副本文件夹
                directoryCopy.mkdir();
                //拷贝文件夹
                FolderCopy(file,directoryCopy);
            }
        }

    }
}

/*package CopyfileCase;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        // 调用 FolderCopy 方法，拷贝目录 "D:\\ZXD\\Documents\\javaweb" 到 "myio\\Copy"
        FolderCopy(new File("E:\\"), new File("myio\\Copy"));
    }

    // 递归复制文件夹 f1 到 f2
    public static void FolderCopy(File f1, File f2) throws IOException {
        // 检查 f1 是否是有效目录
        if (!f1.exists() || !f1.isDirectory()) {
            System.out.println("源路径不存在或不是目录: " + f1.getAbsolutePath());
            return;
        }

        // 如果目标路径 f2 不存在，创建它
        if (!f2.exists()) {
            f2.mkdir();  // 创建文件夹 f2
        }

        // 使用字节数组来读取和写入文件，避免一次性加载一个字节一个字节读取太慢
        byte[] bytes = new byte[1024 * 1024];  // 1MB 的缓冲区
        int len;

        // 遍历源目录 f1 下的每个文件和子目录
        for (File file : f1.listFiles()) {
            // 如果当前文件是文件而不是目录
            if (file.isFile()) {
                // 创建输入流读取文件内容
                FileInputStream fis = new FileInputStream(file);
                // 创建输出流写入文件内容到目标目录
                FileOutputStream fos = new FileOutputStream(new File(f2, file.getName()));

                // 从输入流读取数据，直到文件结束
                while ((len = fis.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);  // 写入数据到输出流
                }

                // 关闭文件流
                fos.close();
                fis.close();
            }

            // 如果当前是目录而非文件
            if (file.isDirectory()) {
                // 在目标文件夹中创建与源文件夹同名的子文件夹
                File directoryCopy = new File(f2, file.getName());
                directoryCopy.mkdir();  // 创建目标目录中的子文件夹

                // 递归调用 FolderCopy，复制子目录中的内容
                FolderCopy(file, directoryCopy);
            }
        }
    }
}*/
