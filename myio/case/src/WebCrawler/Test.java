package WebCrawler;

import cn.hutool.http.HttpUtil;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) throws IOException {
        /*
         *
         * http://www.baijiaxing.net.cn/爬取姓氏；
         * https://www.taomingba.com/lianggezi/article_238452.html爬取男名
         * http://www.2gexing.com/post/145902.html爬取女名
         *
         * */
        //1.确定要爬取的网址
        String familyNameNet = "http://www.baijiaxing.net.cn/";
        String boyNameNet = "https://www.taomingba.com/lianggezi/article_238452.html";
        String girlNameNet = "http://www.2gexing.com/post/145902.html";
        /*//2.爬取网页数据
        String familyNameStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);*/
        //也可使用hutool工具包爬取指定数据
        String familyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);


        ArrayList<String> familyNameTempList = getData(familyNameStr, "([\\u4E00-\\u9FA5]{4})(，|。)", 1);
        ArrayList<String> boyNameTempList = getData(boyNameStr, "(、)([\\u4E00-\\u9FA5]{2})", 2);
        ArrayList<String> girlNameTempList = getData(girlNameStr, "(、)([\\u4E00-\\u9FA5]{2})(、)", 2);


        //3.数据处理
        //1.姓氏
        //        System.out.println(familyNameTempList);
        ArrayList<String> familyNameList = new ArrayList<>();
        familyNameTempList.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                for (int i = 0; i < s.length(); i++) {
                    familyNameList.add(s.charAt(i) + "");
                }
            }
        });
        //2.男名
//        System.out.println(boyNameTempList);
        //去重
        HashSet<String> boyNameSet = new HashSet<>(boyNameTempList);
//        System.out.println(boyNameSet);

        //3.女名
//        System.out.println(girlNameTempList);
        //去重
        HashSet<String> girlNameSet = new HashSet<>(girlNameTempList);
//        System.out.println(girlNameSet);

        //3.生成数据
        ArrayList<String> allData = getInfos(familyNameList, boyNameSet, girlNameSet, 50, 60);
        //4.把生成的数据输出到文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("myio\\case\\name.txt"));
        for (String str : allData) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();


    }

    /*
     * 参数一:姓 集合
     * 参数二:男名 集合
     * 参数三:女名 集合
     * 参数四:男生个数
     * 参数五:女生个数
     *
     * 要求格式 姓名(唯一)-性别-年龄
     * */
    public static ArrayList<String> getInfos(ArrayList<String> familyNameList,
                                             HashSet<String> boyNameSet,
                                             HashSet<String> girlNameSet,
                                             int boyCount, int girlCount) {
        //返回
        ArrayList<String> list = new ArrayList<>();
        //姓名存储结构
        HashSet<String> hsBoyName = new HashSet<>();
        HashSet<String> hsGirlName = new HashSet<>();
        //获取姓名(打乱)
        Iterator<String> itBoy = boyNameSet.iterator();
        Iterator<String> itGirl = girlNameSet.iterator();
        //使用迭代器获取姓名
        while (boyCount > 0) {
            Collections.shuffle(familyNameList);
            String name = familyNameList.get(0) + "  ";
            if (itBoy.hasNext()) {
                name = familyNameList.get(0) + itBoy.next();
            }
            hsBoyName.add(name);
            boyCount--;
        }
        Random r = new Random();
        //男生 18-27岁
        for (String s : hsBoyName) {
            list.add(s + "-男-" + (r.nextInt(10) + 18));
        }


        while (girlCount > 0) {
            Collections.shuffle(familyNameList);
            String name = familyNameList.get(0) + "  ";
            if (itGirl.hasNext()) {
                name = familyNameList.get(0) + itGirl.next();
            }
            hsGirlName.add(name);
            girlCount--;
        }
        //女生 18-25岁
        for (String s : hsGirlName) {
            list.add(s + "-女-" + (r.nextInt(8) + 18));
        }

//        打乱
        Collections.shuffle(list);

        return list;
    }

    public static String webCrawler(String url0) throws IOException {

        //建立连接
        URL url = new URL(url0);
        URLConnection conn = url.openConnection();
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        StringBuilder sb = new StringBuilder();
        int b;
        while ((b = isr.read()) != -1) {
            sb.append((char) b);
        }
        return sb.toString();
    }

    public static ArrayList<String> getData(String data, String regex, int off) {
        //获得规则对象
        Pattern pattern = Pattern.compile(regex);
        //获得比较器对象
        Matcher matcher = pattern.matcher(data);
        ArrayList<String> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(matcher.group(off));
        }
        return list;

    }
}
