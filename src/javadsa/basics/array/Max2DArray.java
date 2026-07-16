package javadsa.basics.array;

public class Max2DArray {
    public static void max(int [] [] arr ){
        int row = arr.length;
        int max =Integer.MIN_VALUE;
        for(int i =0;i<row;i++) {

            for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j]>max) {
              max= arr[i][j];
            }
            }
        }
        System.out.println("Max element of 2D array : "+ max);

    }

    public static void main(String[] args) {
        int arr[][]={
                {1,2},
                {6,8,3,4},
                {9,7,4,3}

        };
        max(arr);
    }
}
