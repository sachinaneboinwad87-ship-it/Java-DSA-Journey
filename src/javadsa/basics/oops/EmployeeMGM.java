package javadsa.basics.oops;
abstract class Employee1{
    String empName;
    String post;
    int empID;
    double salary;

    Employee1(String empName, String post, int empID, double salary){
        this.empID= empID;
        this.empName= empName;
        this.post=post;
        this.salary=salary;
    }
    abstract  double   calculateSalary();
    public void display(){

        System.out.println("Name :"+empName);
        System.out.println("Post :"+post);
        System.out.println("Employee ID :"+empID);
        System.out.println("Salary : "+salary);
    }

}
class Manager extends Employee1{

    Manager(String empName, String post, int empID, double salary){
        super(empName,post,empID,salary);
    }
    @Override
    double calculateSalary() {

      double bonus  = salary* 0.20;
      salary= salary+bonus;
      return salary;
    }

    @Override
    public void display() {
        super.display();
    }
}

class Developer extends Employee1{
 int ot ;
 int otrate = 300; // per hour
    Developer(String empName, String post, int empID, double salary,int ot){
        super(empName,post,empID,salary);
        this.ot=ot;
    }

    @Override
    double calculateSalary() {
        double overtime = ot * otrate;
        salary = salary + overtime;
        return salary;


    }
    @Override
    public void display() {
        super.display();
    }
}
class Intern extends  Employee1{
    Intern(String empName, String post, int empID, double salary){
        super(empName,post,empID,salary);
    }

    @Override
    double calculateSalary() {
        return salary;
    }

    @Override
    public void display() {
        super.display();
    }
}

public class EmployeeMGM {
    public static void main(String[] args) {
        Employee1 M1 = new Manager("Sachin","Manager",101,60000);
        Employee1 D1 = new Developer("Shreyash","Devloper",102,45000,20);
        Employee1 I1 = new Intern("Shree","Intern",103,20000);
        M1.calculateSalary();
        M1.display();
        D1.calculateSalary();
        D1.display();
        I1.display();;
    }
}
