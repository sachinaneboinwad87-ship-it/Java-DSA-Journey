package javadsa.basics.array;

public class LinearSerach {
    public static void serach(){
        int arr []={10 ,25 ,30, 45, 50};
        int key = 45;
        for (int i = 0; i<=arr.length-1;i++){
            if (key == arr[i]) {
                System.out.println("found at the index : " + i);
                break;
            }
        }

    }

    public static void main(String[] args) {
        serach();
    }
}
