package ArrayListUser;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<User> users=new ArrayList<>();
        User u1=new User("神鹰","feiqilai","001");
        User u2=new User("刀哥","fwdao","002");
        User u3=new User("老八","xiaohanbao","003");
        users.add(u1);
        users.add(u2);
        users.add(u3);
        System.out.println(selectListUser("001",users));
        System.out.println(selectListUser("afaf",users));
    }
//    public static boolean  selectListUser(String id,ArrayList<User> users){
//
//        for (int i = 0; i < users.size(); i++) {
//            if (users.get(i).getId().equals(id)){
//                return true;
//            }
//        }
//        return false;
//    }
   public static int  selectListUser(String id,ArrayList<User> users){

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

}
