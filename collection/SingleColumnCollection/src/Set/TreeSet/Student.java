package Set.TreeSet;

public class Student implements Comparable {
    private String name;
    private int age;
    private Double chineseGrade;
    private Double mathGrade;
    private Double englishGrade;


    public Student() {
    }

    public Student(String name, int age, Double chineseGrade, Double mathGrade, Double englishGrade) {
        this.name = name;
        this.age = age;
        this.chineseGrade = chineseGrade;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
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
    public void setName(String name) {
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
        this.age = age;
    }

    /**
     * 获取
     * @return chineseGrade
     */
    public Double getChineseGrade() {
        return chineseGrade;
    }

    /**
     * 设置
     * @param chineseGrade
     */
    public void setChineseGrade(Double chineseGrade) {
        this.chineseGrade = chineseGrade;
    }

    /**
     * 获取
     * @return mathGrade
     */
    public Double getMathGrade() {
        return mathGrade;
    }

    /**
     * 设置
     * @param mathGrade
     */
    public void setMathGrade(Double mathGrade) {
        this.mathGrade = mathGrade;
    }

    /**
     * 获取
     * @return englishGrade
     */
    public Double getEnglishGrade() {
        return englishGrade;
    }

    /**
     * 设置
     * @param englishGrade
     */
    public void setEnglishGrade(Double englishGrade) {
        this.englishGrade = englishGrade;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", chineseGrade = " + chineseGrade + ", mathGrade = " + mathGrade + ", englishGrade = " + englishGrade + "}";
    }


    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        Double temp=s.SumGrade()-this.SumGrade();
        if (temp>0){
            return 1;
        }else if (temp<0){
            return -1;
        }
        return 0;
    }
    public Double SumGrade(){
        Double sumGrade=chineseGrade+mathGrade+englishGrade;
        return sumGrade;
    }


}
