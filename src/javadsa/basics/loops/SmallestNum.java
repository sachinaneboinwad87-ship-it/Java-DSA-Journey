package javadsa.basics.loops;

import java.util.Scanner;

public class SmallestNum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int small =9;
        while(num >0){
            int digit = num%10;
            if (digit <small){
                small=digit;
            }
            num= num/10;
        }
        System.out.println("Smallest num : "+small);
        sc.close();
    }
}
