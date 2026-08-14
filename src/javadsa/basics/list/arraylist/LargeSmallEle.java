package javadsa.basics.list.arraylist;

import java.util.ArrayList;

public class LargeSmallEle {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(23);
        list.add(1);
        list.add(43);
        list.add(33);
        list.add(67);
        int large = list.get(0);
        int small = list.get(0);
        for (Integer value : list) {
            if (value > large) {
                large = value;
            }
        }
        System.out.println("Largest Element : " + large);
        for (Integer integer : list) {
            if (integer < small) {
                small = integer;
            }
        }
            System.out.println(" Small Element : " + small);
        }
    }
