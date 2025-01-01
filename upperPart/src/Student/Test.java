package Student;

/*案例

        对象数组5

        定义一个长度为3的数组,数组存储1~3名学生对象作为初始数据,学生对象的学号,姓名各不相同。

        学生的属性:学号,姓名,年龄。

        要求1:再次添加一个学生对象,并在添加的时候进行学号的唯一性判断。

        要求2:添加完毕之后,遍历所有学生信息。
        要求3:通过id删除学生信息
        如果存在,则删除,如果不存在,则提示删除失败。

        要求4:删除完毕之后,遍历所有学生信息。

        要求5:查询数组id为“heima002”的学生,如果存在,则将他的年龄+1岁*/
public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student s1 = new Student(001, "神鹰", 18);
        Student s2 = new Student(002, "刀哥", 20);
        Student s3 = new Student(003, "刘海柱", 20);
        students[0] = s1;
        students[1] = s2;
        if (s3.getId() != s1.getId() && s3.getId() != s2.getId()) {
            students[2] = s3;
        } else System.out.println("存入学生学号已存在");
        int id = 007;
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (id == students[i].getId()) {
                flag = students[i].DelteStudent(id);
            }
            if (i == students.length - 1 && flag == false) {
                System.out.println("删除失败");
            }

        }
        for (int i = 0; i < students.length; i++) {

            if (students[i].getId() == 002) {
                students[i].setAge(students[i].getAge() + 1);
            }
            System.out.println(students[i].getId() + " "
                    + students[i].getName() + " "
                    + students[i].getAge());
        }

    }


}
