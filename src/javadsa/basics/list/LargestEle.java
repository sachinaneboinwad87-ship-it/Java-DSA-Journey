package javadsa.basics.list;

import java.util.ArrayList;
import java.util.List;

public class LargestEle {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(5);
        list.add(20);
        list.add(3);
        list.add(15);
        int largest = list.get(0);
        for(int i = 0; i<list.size();i++){
            if (largest<list.get(i)){
                largest=list.get(i);
            }

        }
        System.out.println("Largest Element "+largest);

    }

}
