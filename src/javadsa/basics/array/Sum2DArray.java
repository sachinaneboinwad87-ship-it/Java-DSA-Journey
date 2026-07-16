package javadsa.basics.array;

public class Sum2DArray {
    public static void sum(int arr [][]){
        int row = arr.length;
        int column= arr[0].length;
        int sum =0;
        for(int i = 0 ; i<row;i++){
            for(int j =0 ; j<column;j++){
                sum+=arr[i][j];

            }
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        int arr [][]= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        sum(arr);
    }
}
