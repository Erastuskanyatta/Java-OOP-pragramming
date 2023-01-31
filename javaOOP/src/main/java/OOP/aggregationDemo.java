package OOP;


import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

class  Company{
    String name;
    List<Employee> employees = new ArrayList<Employee>();
    public Company(String name, List<Employee> employees){
        this.name = name;
        this.employees =  employees;
    }
    public List<Employee> getEmployees(){
        return employees;
    }
}
class Employee{
    public String name;
    public  int salary;
    public Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
    @Override
    public String toString(){
        return "[Employee : " + name + ", Microsoft " + salary;
     }

}

public class aggregationDemo {

    public static  void main(String [] args){
       List<Employee> emp = new ArrayList<Employee>();
      emp.add(new Employee("Erastus", 750000));
      emp.add(new Employee("John", 850000));
       Company comp = new Company("Microsoft",emp);
        System.out.println(comp.getEmployees());

    }
}
