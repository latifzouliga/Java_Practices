package randomPackage.youtube;

import java.util.*;

public class AnagramStrings {

    public static void main(String[] args) {

        String str1 = "army";
        String str2 = "maRy";

        if(countAndSort(str1).equals(countAndSort(str2))){
            System.out.println("Is anagram");
        }else {
            System.out.println("Is NOT");
        }

        /*
        Map<Character, Integer> map1 = new TreeMap<>();
        Map<Character, Integer> map2 = new TreeMap<>();

        for (char each : str1.toCharArray()) {
            if (map1.containsKey(each)){
                map1.put(each,map1.get(each)+1);
            }else {
                map1.put(each,1);
            }
        }

        for (char each : str2.toCharArray()) {
            if (map2.containsKey(each)){
                map1.put(each,map1.get(each)+1);
            }else {
                map2.put(each,1);
            }
        }

        if (map1.equals(map2)){
            System.out.println("Anagram");
        }else {
            System.out.println("is not");
        }

         */

    }

    public static Map<Character,Integer> countAndSort(String str){

        Map<Character, Integer> map = new TreeMap<>();

        for (char each : str.toLowerCase().toCharArray()) {

            if (map.containsKey(each)){
                map.put(each, map.get(each)+1);
            }else {
                map.put(each, 1);
            }
        }
        return map;


    }

}
