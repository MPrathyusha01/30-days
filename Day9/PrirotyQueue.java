package Day9;

import java.util.PriorityQueue;

public class PrirotyQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3);
        pq.add(1);
        pq.add(2);

        System.out.println("Head of the queue: " + pq.peek());

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
