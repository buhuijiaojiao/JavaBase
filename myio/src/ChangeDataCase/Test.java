package ChangeDataCase;

import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("myio\\Data\\a.txt");
        file.createNewFile();
        FileWriter fw=new FileWriter(file);
        String s="2-1-9-4-7-8";
        fw.write(s);
        fw.flush();
        //读取文件中的数据来排序
        FileReader fr=new FileReader(file);
       char[] c=new char[s.length()];
        fr.read(c);

//        System.out.println(Arrays.toString(data));
        //排序
       /* String str=new String(c);
//        System.out.println(str);
        String[] data = str.split("-");
        Arrays.sort(data, (o1,o2)-> Integer.parseInt(o1)-Integer.parseInt(o2));*/
        String s0 = Arrays.toString(c);
        Integer[] data = Arrays.stream(s0.substring(1,s0.length()-1)
                                        .split(", -, "))
                                        .map(Integer::parseInt)
                                        .sorted()
                                        .toArray(Integer[]::new);

        StringJoiner sj=new StringJoiner("-");
        /*for (String a : data) {
            sj.add(a);
        }*/
        String s1 = Arrays.toString(data).replace(", ", "-");

//        System.out.println(sj.toString());
        //把排序后的数据写入缓冲区

//        fw.write(" 排序后:"+sj.toString());
        fw.write(" 排序后:"+s1.substring(1,s1.length()-1));


        fr.close();
        fw.close();
    }
}
