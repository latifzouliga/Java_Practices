package randomPackage.youtube;

import java.util.LinkedHashMap;
import java.util.Map;

public class wordsOccurance {

    public static void main(String[] args) {

        String str = "I love love java java java java I I I I";

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String each : str.split(" ")) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        System.out.println(map);

        map.forEach((k, v) -> System.out.println("the number of word: '" + k + "' is: " + v));



    }
}
