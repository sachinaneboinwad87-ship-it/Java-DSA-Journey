package javadsa.basics.loops;

import java.util.Scanner;

public class largeDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit");
        long num =sc.nextLong();
        long  largest = 0;
        while(num>0){
            long digit= num%10;
        if(digit>largest){
        largest=digit;}
        num=num/10;
        }
        System.out.println("largest : "+largest);
        sc.close();
    }
}
