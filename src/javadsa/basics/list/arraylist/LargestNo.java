package javadsa.basics.list.arraylist;

import java.util.ArrayList;

public class LargestNo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(21);
        list.add(9);
        list.add(90);
        list.add(32);
        int largest = list.get(0);
        for(int i = 0; i<list.size();i++){
            if(list.get(i)>largest){
                largest= list.get(i);
            }
        }
        System.out.println("Largest no is : "+largest);
    }
}
