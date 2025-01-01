package StudentSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


import static StudentSystem.StudentSystem.numberVerify;

public class App {
    public static void main(String[] args) {
        String choose;
        ArrayList<User> users = new ArrayList<>();
        boolean flag = false;
        while (true) {
            System.out.println("-------------欢迎来到黑马学生管理系统------------");
            System.out.println("请选择操作 1.登录 2.注册 3.忘记密码");
            Scanner sc1 = new Scanner(System.in);
            choose = sc1.next();
            switch (choose) {
                case "1" -> flag = loginUser(users);
                case "2" -> registerUser(users);
                case "3" -> forgetPassward(users);
                default -> System.out.println("非法输入,已重新跳转至主页面");
            }
            if (flag) {
                StudentSystem.SystemMain();
            }
        }
    }

    public static void registerUser(ArrayList<User> users) {
        Scanner sc = new Scanner(System.in);
        User u1 = new User();
        String username;
        String passward;
        String personid;
        String phoneNumber;

        System.out.println("请输入注册的用户名");


        //用户名校验
        while (true) {
            username = sc.next();
            //用户名校验
            if (usernameVerify(users, username)) {
                break;
            }
            System.out.println(" 请重新输入用户名");

        }
        u1.setUsername(username);


        System.out.println("请输入密码");


        //密码校验
        while (true) {
            passward = sc.next();
            System.out.println("请再次输入密码");
            if (passward.equals(sc.next())) {
                break;
            }
            System.out.println("密码两次输入不一致,请重新输入密码");
        }

        u1.setUserPassward(passward);


        System.out.println("请输入身份证号");


        //身份证号检验
        while (true) {
            personid = sc.next();
            if (personidVerify(personid)) {
                u1.setUserPersonid(personid);
                break;
            }
            System.out.println(",请重新输入");
        }

        System.out.println("请输入手机号");

        //手机号验证
        while (true) {
            phoneNumber = sc.next();
            if (phoneNumberVerify(phoneNumber)) {

                System.out.println("手机号可用!");
                u1.setUserPhoneNumber(phoneNumber);
                break;
            } else {
                System.out.println("手机号不可用,请重新输入");
            }
        }

        //存入集合
        users.add(u1);
        System.out.println("注册成功! 已转至主界面");

//        System.out.println(users.get(0));


    }

    public static boolean loginUser(ArrayList<User> users) {
        for (int i = 0; i < 3; i++) {

            Scanner sc = new Scanner(System.in);
            String username;
            String passward;
            String captcha;
            System.out.println("请输入用户名");
            username = sc.next();
            System.out.println("请输入密码");
            passward = sc.next();
            int index = getIndexUser(users, username);
            if (index == -1) {
                System.out.println("用户名未注册,请先注册");
                return false;
            }
            String captcha0;

            while (true) {
                captcha0 = getCaptcha();
                System.out.println("随机生成的验证码为:" + captcha0);
                System.out.println("请输入验证码");
                captcha = sc.next();

                if (captcha.equalsIgnoreCase(captcha0)) {
                    break;
                }
                System.out.println("验证码输入错误请重新输入");
            }

            if (users.get(index).getUserPassward().equals(passward)) {
                System.out.println("登录成功!");
                return true;
            } else {
                System.out.println("用户名或密码错误,请重新输入,你还有" + (3 - i) + "次机会");
            }
        }


        System.out.println("错误次数已达上限,如要登录请联系管理员");
        return false;

    }

    public static void forgetPassward(ArrayList<User> users) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        int index = getIndexUser(users, sc.next());

        if (index == -1) {
            System.out.println("未注册");
            return;
        }
        System.out.println("请输入你的身份证号码");
        String personid = sc.next();
        System.out.println("请输入你的手机号码");
        String phoneNumber = sc.next();
        if (users.get(index).getUserPersonid().equals(personid) &&
                users.get(index).getUserPhoneNumber().equals(phoneNumber)) {
            System.out.println("请输入新密码");
            String passward = sc.next();
            users.get(index).setUserPassward(passward);
            System.out.println("修改成功,将跳转到主页面");
        } else {

            System.out.println("账户信息不匹配,修改失败");

        }

    }


    //用户名格式校验
    public static boolean usernameVerify(ArrayList<User> users, String username) {


        //检验是否符合要求

        if (username.length() < 3 || username.length() > 15) {
            System.out.print("用户名长度不合法,");
            return false;
        }
        if (numberVerify(username, username.length() - 1)) {
            System.out.print("密码不能全是数字,");
            return false;
        }
        if (getIndexUser(users, username) >= 0) {
            System.out.print("用户名已存在,");
            return false;
        }
        char temp;
        for (int i = 0; i < username.length(); i++) {
            temp = username.charAt(i);
            if (temp >= '0' && temp <= '9') {
                continue;
            }
            if (temp >= 'a' && temp <= 'z') {
                continue;
            }
            if (temp >= 'A' && temp <= 'Z') {
                continue;
            }
            System.out.print("密码只能是字母加数字,");
            return false;

        }
        return true;
    }

    //身份证号格式检验
    public static boolean personidVerify(String personid) {

        if (personid.charAt(0) == '0') {
            System.out.print("身份证首位不能为0");
            return false;
        }
        if (personid.length() != 18) {
            System.out.print("输入长度不合法,应为18位");
            return false;
        } //把前十七位和最后一位分开判断
        if (numberVerify(personid, personid.length() - 2)) {
            char end = personid.charAt(personid.length() - 1);
            if (end == 'x' || end == 'X' || (end >= '0' && end <= '9')) {
                return true;
            } else {
                System.out.print("格式错误,最后一位必须是字母x(X)或数字");
                return false;
            }
        }
        System.out.print("格式错误,前17位必须是数字");
        return false;
    }

    //手机号校验
    public static boolean phoneNumberVerify(String phoneNumber) {
        if (phoneNumber.charAt(0) == '0') {
            System.out.print("手机号首位不能为0 ");
            return false;
        }
        if (phoneNumber.length() != 11) {
            System.out.print("位数错误,手机号应为11位数字 ");
            return false;
        }
        if (numberVerify(phoneNumber, phoneNumber.length() - 1)) {
            return true;
        } else {
            System.out.print("格式错误,手机号应为11位数字 ");
            return false;
        }

    }

    public static String getCaptcha() {
        Random r1 = new Random();
//        char[] ch = new char[5];
        ArrayList<Character> ch=new ArrayList<>();
        int randomInt;
        for (int i = 0; i < 5; i++) {
            while (true) {
                randomInt = r1.nextInt(64, 122) + 1;

                if (randomInt > 'Z' && randomInt < 'a') {
                    continue;
                }
                break;
            }
//            ch[i] = (char) (randomInt);
            ch.add((char)randomInt);
        }
        //得到字母的5位
//        String captcha = new String(ch);
//        StringBuilder sb = new StringBuilder(captcha);
//        StringBuilder sb =new StringBuilder();

        //将其中一位替换为数字字符
        int randomIndex = r1.nextInt(5);
        char randomNumber = (char) (r1.nextInt(47, 57) + 1);
//        sb.setCharAt(randomIndex, randomNumber);
//        captcha = sb.toString();
        ch.set(randomIndex,randomNumber);
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < ch.size(); i++) {
           sb.append(ch.get(i));
        }
        return sb.toString();
    }

    public static int getIndexUser(ArrayList<User> users, String username) {
        for (int index = 0; index < users.size(); index++) {
            if (users.get(index).getUsername().equals(username)) {
                return index;
            }
        }
        return -1;
    }

}
