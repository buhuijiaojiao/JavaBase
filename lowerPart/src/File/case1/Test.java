package File.case1;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File f1=new File("aaa");
        System.out.println(ismptyAVI(f1));

    }
    public static boolean ismptyAVI(File file){
        boolean temp=false;

        for (File listFile : file.listFiles()) {
            temp=listFile.getName().endsWith(".avi");
        }
        return temp;
    }
}
