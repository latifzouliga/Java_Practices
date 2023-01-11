package randomPackage.officeHours;

import java.lang.reflect.Array;
import java.util.*;

public class FrequencyMap {

    public static void main(String[] args) {



        //frequencyTest(str);

        //secondFreqTest(str);

        //thirdFrequency(str);

        String word = "apple";
        String[] str = word.split("");
        System.out.println("frequency = " + Collections.frequency(List.of(str), "p"));

        List<String> cher = List.of(str);
        System.out.println(cher);


    }

    public static void frequencyTest( String str) {


        Map<Character, Integer> freq = new LinkedHashMap<>();

        for (char each : str.toCharArray()) {
            if (freq.containsKey(each)){
                freq.put(each,freq.get(each)+1);

            }else {
                freq.put(each,1);
            }

        }
        System.out.println("freq = " + freq);
    }

    public static void secondFreqTest(String str){

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);

            if (!map.containsKey(key)){
                map.put(key, 0);
            }
            map.put(key, map.get(key)+ 1);
        }

        System.out.println("Frequency: "+ map);
    }

    public static void thirdFrequency(String str){

        Map<String, Integer> map = new LinkedHashMap<>();

        String[] words = str.replace(" ", "").split("");
        for (String each : words) {
            int count = Collections.frequency(Arrays.asList(words),each);
            map.put(each, count);

        }
        System.out.println("Ferquency: "+ map);
    }


}
