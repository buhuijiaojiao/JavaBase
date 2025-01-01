package extendsEmployee;

public class Employee {
    private String id;
    private String name;
    public Employee(){

    }
    public Employee(String id,String name){
        this.id=id;
        this.name=name;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void work(){
        System.out.println("员工"+getName()+"在工作");
    }
}
