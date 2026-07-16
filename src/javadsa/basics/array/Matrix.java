package javadsa.basics.array;

public class Matrix {

    public static void  matrix(){
        int [][]mat ={
                {1, 2, 3},
                {4,5,6},
                {7,6,8}

        };
        int row = mat.length;
        int column = mat.length;
        for(int i =0;i<row;i++){
            for (int j =0;j<column;j++){
                System.out.print(mat[i][j] +" ");
            }
        }
        System.out.println();

    }

    public static void main(String[] args) {
        matrix();
    }
}
