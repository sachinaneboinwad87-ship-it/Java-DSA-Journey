package javadsa.basics.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer>  list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(8);
        Collections.sort(list);
        for(Object sortList :list){
            System.out.println(sortList);
      }


    }
}
