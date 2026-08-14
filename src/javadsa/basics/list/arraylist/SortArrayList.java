package javadsa.basics.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(87);
        list.add(54);
        list.add(34);
        System.out.println("Before Sorting : "+list);
        Collections.sort(list);
        System.out.println("After Sorting : "+list);

    }
}
