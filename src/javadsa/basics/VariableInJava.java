package javadsa.basics;

public class VariableInJava {
    static void main() {
        // Rule 1: A variable must have a data type.
        int age;

        // Rule 2: A variable name cannot start with a number.
        // int 1age;      // Invalid

        // Rule 3: A variable name can start with a letter, _ or $.
        int studentAge;
        int _marks;
        int $salary;

        // Rule 4: Variable names can contain letters, digits, _ and $.
        int marks2026;
        int total_marks;
        int employee$Id;

        // Rule 5: Java keywords cannot be used as variable names.
        // int class = 10;      //  Invalid
        // int public = 20;     // Invalid

        // Rule 6: Variable names are case-sensitive.
        int score = 80;
        int Score = 90;   // Different variable
        // Rule 7: A variable must be declared before use.
        int totalStudents;
        totalStudents = 50;

        // Rule 8: Multiple variables of the same type can be declared together.
        int a, b, c;

        // Rule 9: Variables can be declared and initialized together.
        double percentage = 89.5;
        char grade = 'A';
        boolean isPassed = true;
        String name = "Sachin";

        // Rule 10: A variable's data type cannot be changed.
        int number = 100;
        // double number = 100.5;   // Invalid (Redeclaration)
        // Printing values
        System.out.println("Score: " + score);
        System.out.println("Score (capital S): " + Score);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + isPassed);
        System.out.println("Name: " + name);
        System.out.println("Total Students: " + totalStudents);



    }
}
