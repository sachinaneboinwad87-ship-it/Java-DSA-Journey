package javadsa.basics.array;

public class LargestEle {
    public static void  largest(){
        int [] arr = {1,2,5,9,6,55,7};
        int large ;
        large =arr[0];
        for (int i = 1 ; i <=arr.length-1; i++){
            if (arr[i]>large){
                large = arr[i];
            }

        }
        System.out.println("largest "+large);
    }

 public    static void main(String[] args) {
     largest();


    }
}
