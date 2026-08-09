package javadsa.basics.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 10, 30, 20, 10, 40);

        for (Integer element : list) {
            int frequency = Collections.frequency(list, element);

            System.out.println(element + " -> " + frequency);
        }
    }
}
