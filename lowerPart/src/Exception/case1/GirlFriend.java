package Exception.case1;

public class GirlFriend {
    private String name;
    private int age;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    /*姓名的长度在3~10之间，
    年龄的范围为 18-40岁*/
    public void setName(String name) {
        if (name.length()<=3||name.length()>=10){

            throw new NameFormatException(name+"名字长度应大于3小于10");
        }
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        if (age<18||age>40){

            throw new AgeOutBoundException(age+"年龄应在18~40间");
        }
        this.age = age;
    }

    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + "}";
    }
}
