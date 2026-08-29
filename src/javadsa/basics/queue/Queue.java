package javadsa.basics.queue;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        java.util.Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(12);
        q.offer(33);
        q.offer(90);
        System.out.println(q);
        System.out.println("Removing element from queue :"+q.poll());
        System.out.println(q);
        System.out.println("Aceess 1st element of queue "+q.peek());
    }
}
