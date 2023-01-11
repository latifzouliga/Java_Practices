package randomPackage.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Functional_Consumer {
    public static void main(String[] args) {
        System.out.println("Hello Cart");


        List<Integer> listo = new ArrayList<>();
        listo.addAll(Arrays.asList(100, 30, 45, 70, 21, 74, 47, 1, 13, 11));

        Predicate<Integer> predicate = num -> (num % 2 == 1);


        System.out.println("--------------Functional------------");
        Function<List<Integer>, List<Integer>> map = new Function<List<Integer>, List<Integer>>() {
            List<Integer> newList = new ArrayList<>();

            @Override
            public List<Integer> apply(List<Integer> integers) {

                for (Integer each : integers) {
                    if (each % 2 == 1) {
                        newList.add(each * 10);
                    } else {
                        newList.add(each);
                    }
                }
                return newList;
            }
        };

        List<Integer> newThing = map.apply(listo);
        System.out.println(newThing);

        System.out.println("------------------Consumer--------------");
       Consumer<List<Integer>> consumer = new Consumer<List<Integer>>() {
           @Override
           public void accept(List<Integer> integers) {
               for (Integer each : integers) {
                   System.out.println(each);
               }
           }
       };

       consumer.accept(newThing);



        System.out.println("------------------reduce-----------------");

        String str = "hello";
       int one =  newThing.stream().reduce(0,(a, b) -> a +b);

        System.out.println(one);
    }


}