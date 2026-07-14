package javadsa.basics.functions;

public class isPalindrome {
    static  void palindrome(){
        int num = 152;
        int orgnum =num;
        int rev = 0;
        while (num !=0){
            int digit =num %10;
            rev = rev *10+digit;
            num = num /10;

        }
        if (orgnum==rev){
            System.out.println("Given number is palindrome ");
        }else {
            System.out.println("Given number is not palindrome ");
        }
    }

   public static void main(String[] args) {
        palindrome();
    }
}
