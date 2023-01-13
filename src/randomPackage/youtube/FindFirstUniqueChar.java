package randomPackage.youtube;

import java.util.LinkedHashMap;
import java.util.Map;


public class FindFirstUniqueChar {
    int number;
    public static void main(String[] args) {

        String str = "aaahhhehhewwwww";

        /*
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch1 = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if (ch1 == ch2){
                    count++;
                }
            }
            if (count == 1){
                System.out.println("First char is: "+ ch1);
                break;
            }

        }
         */ //

        String result = "";
        for (int i = 0; i < str.length(); i++) {

            if (!result.contains(str.charAt(i)+"")){
                result += str.charAt(i);
            }

        }
        System.out.println(result);



        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }

        for (Map.Entry<Character, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getValue() == 1) {
                System.out.println("The first unique char is: " + eachEntry.getKey());
                break;
            }
        }

    }
}
