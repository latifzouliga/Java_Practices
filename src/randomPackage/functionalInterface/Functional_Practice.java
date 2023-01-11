package randomPackage.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Functional_Practice {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10, 3, 45, 7, 21, 74, 47, 1, 13, 11));

        System.out.println(list);

        Predicate<Integer> predicate = num -> (num % 2 == 1);


        System.out.println("--------------Functional------------");


        Function<List<Integer>, List<Integer>> map = new Function<List<Integer>, List<Integer>>() {
            List<Integer> newList = new ArrayList<>();
            @Override
            public List<Integer> apply(List<Integer> integers) {

                for (Integer each : integers) {
                    if (each % 2 == 1) {
                        newList.add(each * 3);
                    } else {
                        newList.add(each);
                    }
                }
                return newList;
            }
        };


         List<Integer> lst = map.apply(list);
         //lst.forEach(System.out::println);

        Function<List<Integer>, List<Integer>> func = a -> {
            List<Integer> list1 = new ArrayList<>();
            for (Integer each : a) {
                if (each % 2 == 0){
                    list1.add(each / 2);
                }else
                   list1.add(each);
            }
            return list1;
        };

        List<Integer> nlst = func.apply(list);
        System.out.println(nlst);


    }
}
