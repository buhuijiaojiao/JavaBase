package File;

import java.io.File;
import java.io.IOException;

public class Create {
    public static void main(String[] args) throws IOException {
        File file=new File("aaa");
        System.out.println(file.mkdirs());
        File src =new File(file,"a.txt");
        System.out.println(src.createNewFile());
        System.out.println(file.createNewFile());
    }
}
