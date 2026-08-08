package javadsa.basics.list;

import java.util.ArrayList;
import java.util.List;

public class CreateArrList {
     int a =10;
     int b =22;
     int c =33;
     List<Integer> list = new ArrayList<>();
    CreateArrList(){
        list.add(a);
        list.add(b);
        list.add(c);
        System.out.println(list);
    }

    public static void main(String[] args) {
        new  CreateArrList();
    }
}
