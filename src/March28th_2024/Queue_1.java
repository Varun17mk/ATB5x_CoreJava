package src.March28th_2024;

import java.util.PriorityQueue;
import java.util.Queue;
public class Queue_1 {
    public static void main(String[] args) {
        Queue pq1=new PriorityQueue();
        // Priority queue sorts by default

        pq1.offer(20);
        pq1.offer(10);
        pq1.offer(50);
        pq1.offer(60);
        pq1.add(66);


        System.out.println(pq1);
        //POLL
        System.out.println(pq1.poll()); // poll removes 1st element
        System.out.println(pq1);

        //PEEK
        System.out.println(pq1.peek());
        System.out.println(pq1); // Peek only tells the 1st element without deleting it
    }
}
