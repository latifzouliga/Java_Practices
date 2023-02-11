package randomPackage.youtube;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindTheDifferenceInString {

    public static void main(String[] args) {

        String str1 = "abcddd";
        String str2 = "abcwd";


        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        for (char each : str2.toCharArray()) {
            if (map.containsKey(each)) {
                if (map.get(each) == 1) {
                    map.remove(each);
                } else {
                    map.put(each, map.get(each) - 1);
                }
            }else {
                map.put(each,1);
            }
        }
        System.out.println(map);

    }
}
