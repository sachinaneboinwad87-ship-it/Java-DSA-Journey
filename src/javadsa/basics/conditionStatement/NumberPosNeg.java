package javadsa.basics.conditionStatement;

import java.util.Scanner;

//Check if a number is positive, negative, or zero.
public class NumberPosNeg {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if (num > 0){
            System.out.println("Given number is positive");

        }else if (num < 0){
            System.out.println("Given number is negative");
        }else
            System.out.println("given number is 0");
    }
}
