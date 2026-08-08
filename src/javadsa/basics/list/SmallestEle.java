package javadsa.basics.list;

import java.util.ArrayList;
import java.util.List;

public class SmallestEle {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(9);
        list.add(12);
        list.add(123);
        list.add(13);
        list.add(119);
         int smallest = list.get(0);
         for(int i =0; i<list.size();i++){
             if (list.get(i)<smallest){
                 smallest=list.get(i);

             }
         }
        System.out.println("Smallest Element "+smallest);
    }
}
