class Employee{
    int salary;
    String name;
    String clg;
    public int getSalary(){
        return salary;
    }
    public void setName(String n){
       name=n;
    }
    public String getName(){
        return name;
    }
    public void setCollege(String m){
        clg=m;
    }
    public String getCollege(){
        return clg;
    }
}
public class practice_01_Employee {
    public static void main(String[] args) {
        Employee shantanu=new Employee();
        shantanu.salary=70;
        shantanu.name="Mahi";
        System.out.println(shantanu.getSalary());
        shantanu.setName("Virat");
        System.out.println(shantanu.getName());
        shantanu.setCollege("Vishwakarma Institute of Technology");
        System.out.println(shantanu.getCollege());
    }
}
