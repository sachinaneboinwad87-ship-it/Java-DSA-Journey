package javadsa.basics.array;

public class SecLarge {

    public static void secLarge() {

        int arr[] = {10, 20, 1, 32, 4, 52, 12};

        int large = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > large) {
                secLarge = large;   // Old largest becomes second largest
                large = arr[i];     // Update largest
            }
            else if (arr[i] > secLarge && arr[i] != large) {
                secLarge = arr[i];
            }
        }

        System.out.println("Largest Element = " + large);
        System.out.println("Second Largest Element = " + secLarge);
    }

    public static void main(String[] args) {
        secLarge();
    }
}
