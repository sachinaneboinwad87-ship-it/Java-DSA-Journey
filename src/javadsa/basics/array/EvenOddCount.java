package javadsa.basics.array;

public class EvenOddCount {
    public static void countEvenOdd(){
        int []arr={2, 5, 8, 9, 11, 14 ,20};
        int countOdd = 0;
        int countEven=0;
        for(int i =0 ; i<= arr.length-1;i++){
            if (arr[i]%2==0){
                countEven++;

            }else
                countOdd++;
        }
        System.out.println("Count of Even : "+countEven);
        System.out.println("Count of odd : "+countOdd);
    }

    static void main(String[] args) {
        countEvenOdd();
    }
}
