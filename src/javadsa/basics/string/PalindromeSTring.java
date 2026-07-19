package javadsa.basics.string;

public class PalindromeSTring {
    public static void palindrome(String str){
        String rev = "";
        for (int i = str.length()-1; i>=0 ; i--){
            rev = rev + str.charAt(i);
            if (rev.equals(str)){
                System.out.println("Given string is palindrome ");
            }else {
                System.out.println("Given string is not palindrome ");
            }
        }
    }

    public static void main(String[] args) {
        String str = "nun";
        palindrome(str);
    }
}
