package javadsa.basics.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(25);
        list.add(15);
        list.add(40);
        list.add(30);

        Collections.sort(list);

        int largest = list.get(list.size() - 1);
        int secondLargest = list.get(list.size() - 2);

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }

}
