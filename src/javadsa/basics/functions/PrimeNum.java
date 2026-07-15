package javadsa.basics.functions;




public class PrimeNum {

    static void prime() {
        int num = 17;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Given number is Prime");
        } else {
            System.out.println("Given number is Not Prime");
        }
    }

    public static void main(String[] args) {
        prime();
    }
}