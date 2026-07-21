package javadsa.basics.oops;
class Employee{
    int id;
    String name;
    int salary;
    public void employeeDisplay(){
        System.out.println("Employee ID :"+id);
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Salary : "+salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id= 10;
        e1.name="Sachin";
        e1.salary=14000;
        e1.employeeDisplay();

    }
}
