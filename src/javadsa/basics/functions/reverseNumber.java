package javadsa.basics.functions;


public class reverseNumber {


    public static int revNumber(int num) {
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return reverse;
    }





    public static void main(String[] args) {
        int number = 12345;
        int result = revNumber(number);

        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + result);
    }
}