package randomPackage.youtube;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindRandonCharInString {

    public static void main(String[] args) {


        String str1 = "abcd";
        String str2 = "abcwd";


        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (char each : str2.toCharArray()) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }

        map.forEach((k, v) -> {
            if (v <= 1) {
                System.out.println(k);
            }
        });
        System.out.println(map);
    }
}
