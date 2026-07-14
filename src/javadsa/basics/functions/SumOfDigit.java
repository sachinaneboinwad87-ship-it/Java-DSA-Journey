package javadsa.basics.functions;

public class SumOfDigit {
    static void sumOfDigit() {
        int num = 10;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of n number of digit is :"+sum);
    }


    static void main(String[] args) {
        sumOfDigit();

    }
}