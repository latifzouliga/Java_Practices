package randomPackage.compatible_vs_comparitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {


    public static void main(String[] args) {


        List<Laptop> lap = new ArrayList<>();

        lap.add(new Laptop("Toshiba", 8, 700));
        lap.add(new Laptop("Apple", 12, 1200));
        lap.add(new Laptop("Acer", 16, 1000));

        // Collections sort method can not sort list of objects without implementing the Compatible interface
        // and give implementation on how the sorting is based on.

        System.out.println("------------Comparable interface---------------");
        System.out.println("---------sorting based on ram size--------------");
        Collections.sort(lap);

        for (Laptop each : lap) {
            System.out.println(each);
        }



        /** if implementing compatible interface is not enough and we need to compare the object based on
         // another implementation we can create compatible and give other implementation
         // We use comparator if the class is not implementing any comparable interface
         // In this case it is called comparator */

        Comparator<Laptop> compare = new Comparator<Laptop>() {
            public int compare(Laptop lap1, Laptop lap2) {
                if (lap1.getPrice() > lap2.getPrice()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        System.out.println("--------comparator------------------");
        System.out.println("-------sorting based on price-----------");
        Collections.sort(lap, compare);

        for (Laptop laptop : lap) {
            System.out.println(laptop);
        }



    }
}
