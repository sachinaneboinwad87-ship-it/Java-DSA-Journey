package javadsa.basics.list;

import java.util.ArrayList;
import java.util.List;

public class AddEle {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        String [] fruit = {"Mango","Banana","Apple","Grapes","Orange"};
        list.add(fruit[0]);
        list.add(fruit[1]);
        list.add(fruit[2]);
        list.add(fruit[3]);
        list.add("Cherry");
        System.out.println(list);
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        for (String fruitlist :list){
            System.out.println(fruitlist);
        }
    }
}
