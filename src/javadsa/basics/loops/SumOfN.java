package javadsa.basics.loops;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int sum =0;
        for(int i =1 ; i <=num;i++){
            sum= sum+i;

        }
        sc.close();
        System.out.println("sum :"+sum);

    }
}
