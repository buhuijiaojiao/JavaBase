package oop;

public class AdminStaff extends Employee {
   public AdminStaff(){

   }
   public AdminStaff(String id,String name){
       super(id,name);
   }

    @Override
    public void work() {
        System.out.println("行政部员工"+getName()+"在工作");
    }
}
