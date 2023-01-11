package randomPackage.CollectionPractice;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePractice {

    public static void main(String[] args) {

        // FIFO
        // Accepts duplicates
        // methods are offer() or add() to add and pull() and remove() to remove
        // order is random
        // pulls element in ascending order
        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(13);
        queue.offer(2);
        queue.offer(3);
        queue.offer(3);
        queue.offer(15);
        queue.offer(60);
        queue.offer(6);

        System.out.println(queue);  // [2, 3, 3, 13, 15, 60, 6]

        // pulls element in ascending order
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }


        System.out.println(queue);

        queue.addAll(Arrays.asList(100, 200, 300, 3));

        System.out.println(queue);  // [3, 100, 300, 200] order is random


    }
}
