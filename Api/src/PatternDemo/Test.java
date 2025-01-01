package PatternDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String s="你可能知道也可能不知道，Java已经有一个很长的历史了(将近30年)。Java的雏形诞生于1990年代初，最初是叫Oak（领导办公室外的一棵橡树），当时的目标是将其用于数字有线电视行业的程序架构，各种消费性电子产品例如机顶盒、智能电视等数字设备 人不能忘本，否则做人会很失败。我觉得学一门技术也一样，需要从根学起，基础要打好。我断定如今大多数学习Java的初学者，" +
                "甚至从事Java开发工作多年的专业技术人员通常都缺乏Java是如何随着时间的推移而演变的知识，因此我想从Java的根开始说起，让大家了解一下Java的完整故事";
        Pattern p=Pattern.compile("Java|\\d{2,4}");
        //文本匹配器
        Matcher m = p.matcher(s);

        while (m.find()) {
            System.out.print(m.group()+" ");
        }
    }
}
