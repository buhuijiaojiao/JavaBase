package FileEncryptCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File file=new File("myio\\FileEncryption\\start.txt");//原始文件
        /*file.createNewFile();
        FileWriter fw=new FileWriter(file);
        int count = 0;
        while (true){
            fw.write(97);
            count++;
            if (count==5){
                fw.write("\r\n");
            }
            if (count>10){
                break;
            }
        }
        fw.close();*/
        //开始加密
            //1.读取原始文件的每一个字节数据并加密写入新文件
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream("myio\\FileEncryption\\end.txt");
        int b=0;
        while ((b=fis.read())!=-1){
            //加密并写入新文件
            b=encryptDecrypt(b);
            fos.write(b);
        }
        fos.close();
        fis.close();
    }
    public static int encryptDecrypt(int b){
        return b^100; //加密逻辑
    }

}
