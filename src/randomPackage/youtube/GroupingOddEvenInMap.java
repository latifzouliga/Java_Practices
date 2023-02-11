package randomPackage.youtube;

import java.util.*;

public class GroupingOddEvenInMap {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        Map<String, List<Integer>> map = new LinkedHashMap<>();

        for (int each : array) {
            if (each % 2 == 0) {
                if (!map.containsKey("Even")) {
                    map.put("Even", new ArrayList<>());
                }
                map.get("Even").add(each);
            } else {
                if (!map.containsKey("Odd")) {

                    map.put("Odd", new ArrayList<>());
                }
                map.get("Odd").add(each);
            }
        }
        System.out.println(map.values());


    }


}
