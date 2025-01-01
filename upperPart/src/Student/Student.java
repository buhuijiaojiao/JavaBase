package Student;
/*对象数组5

        定义一个长度为3的数组,数组存储1~3名学生对象作为初始数据,学生对象的学号,姓名各不相同。

        学生的属性:学号,姓名,年龄。*/
public class Student {
    private int id;
    private String name;
    private int age;
    public Student(){

    }
    public Student(int id,String name,int age){
        this.id=id;
        this.age=age;
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public boolean DelteStudent(int id){
        this.name=null;
        this.id=0;
        this.age=0;
        System.out.println("学号"+id+"的学生删除成功");
        return true;
    }


}
