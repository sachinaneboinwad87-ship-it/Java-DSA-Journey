package javadsa.basics.queue;

import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new java.util.PriorityQueue<>();
        pq.offer(40);
        pq.offer(30);
        pq.offer(50);
        pq.offer(12);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
}
