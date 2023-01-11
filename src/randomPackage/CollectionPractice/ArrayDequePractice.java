package randomPackage.CollectionPractice;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class ArrayDequePractice {

    public static void main(String[] args) {

        // FIFO
        // Accepts duplicates
        // insertion order is preserved
        // methods offer()  to add and pull() to remove

        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(1);
        queue.offer(13);
        queue.offer(2);
        queue.offer(2);
        queue.offer(2);
        queue.offer(2);

        System.out.println("Peak: "+queue.peek());

        queue.addAll(Arrays.asList(3, 14, 50, 6, 17, 8));

        System.out.println(queue);

        // pulls element is preserved order
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }




    }
}
