package File.case2;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File fr1=new File("D:\\");
        queryFile(fr1);
    }
    public static void queryFile(File f){
//        if(f.listFiles()==null){
//            return;
//
//        }
        for (File file : f.listFiles()) {
            if (file.isFile()){
                if (file.getName().endsWith(".log")){
                    System.out.println(file.getName());
                }
            }else if (file.isDirectory()){
                queryFile(file);

            }

        }

    }
}
