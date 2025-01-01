package StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;



public class StudentSystem {

    public static void SystemMain() {
        //用户登录

        //进入学生管理系统
        String choose;
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            System.out.println("-------------欢迎来到黑马学生管理系统------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入你的选择: ");
            Scanner sc = new Scanner(System.in);
            choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(students);
                case "2" -> deleteStudent(students);
                case "3" -> updateStudent(students);
                case "4" -> queryStudent(students);
                default -> System.exit(0);    //叫停jvm退出程序 break只可跳出一层
            }
        }
    }


    //方法



    public static boolean numberVerify(String st, int maxIndex) {
        //检验指定索引前是否全是数字
        for (int i = 0; i < maxIndex; i++) {
            if (st.charAt(i) < '0' || st.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }


    public static boolean idContains(ArrayList<Student> students, String id) {
        /*
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)){
                return true; //存在重复id返回为真 集合中存在此id
            }
        }
        return false;*/
        //代码复用,能否通过id查到索引 来判断id是否存在
        if (getIndex(students, id) >= 0) {
            return true; //查到索引 id已存在
        } else return false;
    }

    public static int getIndex(ArrayList<Student> students, String id) {
        for (int index = 0; index < students.size(); index++) {
            if (students.get(index).getId().equals(id)) {
                return index;
            }
        }
        return -1;
    }


    //学生增删改查


    public static void addStudent(ArrayList<Student> students) {
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生id");
        String id = sc.next();
        while (true) {
            if (idContains(students, id)) {
                System.out.println("id已存在请重新输入");
                id = sc.next();
            } else {
                break;
            }
        }
        s1.setId(id);
        System.out.println("请输入学生姓名");
        s1.setName(sc.next());
        System.out.println("请输入学生年龄");
        s1.setAge(sc.nextInt());
        System.out.println("请输入学生家庭住址");
        s1.setAddress(sc.next());
        students.add(s1);
        System.out.println("添加成功");


    }

    public static void deleteStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生id");
        String id = sc.next();
        int index = getIndex(students, id);
        if (index >= 0) {
            students.remove(index);
            System.out.println("id为" + id + "的学生删除成功");
        } else {
            System.out.println("id为" + id + "的学生不存在,删除失败");
        }

    }

    public static void updateStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生id");
        String id = sc.next();
        int index = getIndex(students, id);
        if (index == -1) {
            System.out.println("id为" + id + "的学生不存在");
            return;
        }
        //使用获取到的索引重新录入信息
        //获取此学生
        Student newStu = students.get(index);
        //修改
        System.out.println("请输入新姓名");
        newStu.setName(sc.next());
        System.out.println("请输入新年龄");
        newStu.setAge(sc.nextInt());
        System.out.println("请输入新家庭住址");
        newStu.setAddress(sc.next());
        System.out.println("修改完成!");


    }

    public static void queryStudent(ArrayList<Student> students) {
        if (students.size() == 0) {
            System.out.println("当前无学生信息,请添加后再查询");
            return;
        }
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < students.size(); i++) {
            Student stu = students.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }

    }
}
