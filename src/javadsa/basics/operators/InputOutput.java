package javadsa.basics.operators;

import java.util.Scanner;

public class InputOutput {
    static void main() {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble();

        System.out.print("Enter your gender (M/F): ");
        char gender = sc.next().charAt(0);

        System.out.print("Are you a Java student? (true/false): ");
        boolean isJavaStudent = sc.nextBoolean();

        System.out.println("\n----- Student Details -----");
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Percentage  : " + percentage);
        System.out.println("Gender      : " + gender);
        System.out.println("Java Student: " + isJavaStudent);

        sc.close();
    }
}
