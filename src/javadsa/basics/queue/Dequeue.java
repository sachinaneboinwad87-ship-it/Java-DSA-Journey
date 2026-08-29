package javadsa.basics.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {
    public static void main(String[] args) {
          Deque<Integer> dq = new ArrayDeque<>();
          dq.offer(10);
          dq.offer(20);
          dq.offerFirst(11);
        System.out.println(dq);
          dq.offerLast(22);
        System.out.println(dq);
        dq.pollLast();
        System.out.println(dq);
        dq.pollLast();
        System.out.println(dq);

        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

    }
}
