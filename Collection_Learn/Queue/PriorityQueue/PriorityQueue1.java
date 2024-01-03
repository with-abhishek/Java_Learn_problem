package Collection_Learn.Queue.PriorityQueue;

// Min heap program 

import java.util.PriorityQueue;

public class PriorityQueue1
{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(1);
        pq.add(20);
        pq.add(11);
        pq.add(3);
        pq.add(6);
        pq.add(9);
        pq.add(13);
        pq.add(4);

        System.out.println(pq);

    }
}