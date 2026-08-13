package javadsa.basics.list.arraylist;

import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        // Creating arraylist.
        ArrayList<String> a1 = new ArrayList<>();
        //add elements
        a1.add("Hello");
        a1.add("Sachin");
        System.out.println(a1);
       // adding elements at special index.
        a1.add(2,"how are you ?");
        System.out.println(a1);

        //removing element
        a1.remove(0);
        System.out.println(a1);

         // remove ele using value
        a1.remove("Sachin");
        System.out.println(a1);
    }
}
