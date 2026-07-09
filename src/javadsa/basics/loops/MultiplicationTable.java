package javadsa.basics.loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
     int num= sc.nextInt();
     int result ;
     for(int i =1; i<=10;i++){
         result  = num*i;
         System.out.println(num+"X"+i+"= "+result);
     }

    sc.close();
    }
}
