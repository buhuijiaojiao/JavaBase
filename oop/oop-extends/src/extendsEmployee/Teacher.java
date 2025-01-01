package extendsEmployee;

public class Teacher extends Employee {
        public Teacher(){
            super();
        }
        public Teacher(String id,String name){
            super(id,name);
        }

    @Override
    public void work() {
        System.out.println("教研部员工"+getName()+"在工作");

    }
}