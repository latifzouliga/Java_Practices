package randomPackage.youtube;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class findTheDifference {

    public static void main(String[] args) {

        String str1 = "abcdew";
        String str2 = "abcd";

        /*
        char result = 0;
        for(char each : str1.toCharArray()){
            result ^= each;
        }

        for(char each : str2.toCharArray()){
            result ^= each;
        }
        System.out.println(result);

         */

        /*
        String str3 = str1 + str2;

        Map<Character,Integer> map = new HashMap<>();

        for (char each : str3.toCharArray()) {
            if (map.containsKey(each)){
                map.put(each,map.get(each)+1);
            }else {
                map.put(each,1);
            }
        }

        map.forEach((k, v) -> {
            if (v % 2 != 0){
                System.out.print(k+" ");
            }
        });

         */


        char result = 0;
        for(char each : str1.toCharArray()){
            result ^= each;
        }
        for(char each : str2.toCharArray()){
            result ^= each;
        }

        System.out.println(result);










    }
}
