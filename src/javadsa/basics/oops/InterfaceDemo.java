package javadsa.basics.oops;

interface EmployeeBonusCalculate {
    double calculateSalary(double salary);
}

class Manager1 implements EmployeeBonusCalculate {
    String name;
    double salary;
    double bonus = 0.20;

    // Constructor
    Manager1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calculateSalary(double salary) {
        return salary + (salary * bonus);
    }

    public void display() {
        System.out.println("Employee: Manager");
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + salary);
        System.out.println("Salary with Bonus: " + calculateSalary(salary));
        System.out.println();
    }
}

class Developer1 implements EmployeeBonusCalculate {
    String name;
    double salary;
    double bonus = 0.10;

    // Constructor
    Developer1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calculateSalary(double salary) {
        return salary + (salary * bonus);
    }

    public void display() {
        System.out.println("Employee: Developer");
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + salary);
        System.out.println("Salary with Bonus: " + calculateSalary(salary));
        System.out.println();
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        Manager1 manager = new Manager1("Shree", 20000);
        Developer1 developer = new Developer1("Sachin", 15000);

        manager.display();
        developer.display();
    }
}
