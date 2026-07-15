package javadsa.basics.array;

public class Sort {
    public static void isSorted(){
        int arr []={1,2,3,4,5,6,7,8,9,};
        boolean sorted = true;
        for (int i = 1 ; i < arr.length;i++){
            if (arr[i]<arr[i-1]){
                sorted=false;
                break;
            }
        }
        if (sorted) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is Not Sorted");
        }
    }

    public static void main(String[] args) {
        isSorted();
    }
}
