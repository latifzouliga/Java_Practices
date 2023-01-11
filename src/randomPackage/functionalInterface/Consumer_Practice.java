package randomPackage.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_Practice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10, 3, 45, 7, 21, 74, 47, 1, 13, 11));

        System.out.println(list);

        Consumer<List<Integer>> con = new Consumer<List<Integer>>() {
            @Override
            public void accept(List<Integer> integers) {
                for (Integer each : integers) {
                    System.out.println(each);
                }
            }
        };
        // con.accept(list);

        int[] array = {2, 3, 4, 5, 67, 7, 8, 9};

        Consumer<int[]> consumer = a -> {
            for (int each : a) {
                System.out.println(each);
            }
        };

        consumer.accept(array);



    }
}
