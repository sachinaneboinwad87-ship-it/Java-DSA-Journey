package javadsa.basics.conditionStatement;

import java.util.Scanner;

//Calculate salary after bonus:
//Salary > 50,000 → 20% bonus
//Salary > 30,000 → 10% bonus
//Otherwise → 5% bonus
public class Salary {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double totalSalary , bonus ;
        System.out.println("Enter a salary ");
        int empSalary = sc.nextInt();
        if(empSalary >=50000){
             bonus = empSalary*0.2;
             totalSalary= empSalary+bonus;
            System.out.println("Total salary with 20% bonus :"+totalSalary);

        } else if (empSalary>=30000) {

            bonus = empSalary*0.1;
            totalSalary= empSalary+bonus;
            System.out.println("Total salary with 10% bonus :"+totalSalary);

        }else {
            bonus = empSalary * 0.05;
            totalSalary = empSalary + bonus;
            System.out.println("Total salary with 5% bonus :" + totalSalary);
        }
    }
}
