package javadsa.basics.conditionStatement;

import java.util.Scanner;


//Build a simple login system using username and password.
public class LoginSystem {
    static void main() {
        String userName = "sachin";
        String pass = "12345";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter username");
        String user = sc.next();
        System.out.println("Please enter password ");
        String password= sc.next();

        if (userName.equals(user) && pass.equals(password)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Username or Password");
        }
        sc.close();
    }
}
