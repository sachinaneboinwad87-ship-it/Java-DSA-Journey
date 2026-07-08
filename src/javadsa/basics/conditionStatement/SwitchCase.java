package javadsa.basics.conditionStatement;

import java.util.Scanner;

public class SwitchCase {
   public static void main() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter no of day from 1 to 7");
       int day = sc.nextInt();
       switch(day){
           case 1 :
               System.out.println("Monday");
               break;
           case 2 :
               System.out.println("Tues");
               break;
           case 3 :
               System.out.println("Wed");
               break;
           case 4 :
               System.out.println("Thurs");
               break;
           case 5:
               System.out.println("Fri");
               break;
           case 6 :
               System.out.println("Sat");
               break;
           default:
               System.out.println("Sunday");

       }
    sc.close();
    }
}
