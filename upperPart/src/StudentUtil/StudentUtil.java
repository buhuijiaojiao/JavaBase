package StudentUtil;


import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){}
    public static int maxAgeStudent(ArrayList<Student> students){
        int tempAge=students.get(0).getAge();
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getAge()>tempAge){
                tempAge=students.get(i).getAge();
            }

        }
        return tempAge;
    }
}
