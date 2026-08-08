package javadsa.basics.list;

import java.util.ArrayList;
import java.util.List;

public class SumOfEle {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(15);
        int sum =0;
        for (int i = 0; i<list.size();i++){
            sum +=list.get(i);
        }
        System.out.println("Sum : "+sum);
    }
}
