package randomPackage.youtube;

import java.util.*;

public class GroupAnagrams {


    public static void main(String[] args) {

        String[] array = {"eat", "tea", "tan", "ate", "nat", "bat", "zouliga", "hello", "olleh", "ligazou"};

        Map<String,List<String>> map = new HashMap<>();


        for(String each : array){

            char[] eachChar = each.toCharArray();
            Arrays.sort(eachChar);
            String reverse = String.valueOf(eachChar);

            if(! map.containsKey(reverse)){
                map.put(reverse, new ArrayList<>());
            }
            map.get(reverse).add(each);

        }
        System.out.println(map.values());

        //System.out.println(groupAnagram(array));

        /*
        Map<String,List<String>> map = new HashMap<>();

        for(String each : array){
            char[] chrs = each.toCharArray();
            Arrays.sort(chrs);
            String sorted = String.valueOf(chrs);

            if(! map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(each);

        }
        System.out.println(map.values());

         */


    }

    public static List<List<String>> groupAnagram(String[] array) {

        Map<String, List<String>> map = new LinkedHashMap<>();
        for (String each : array) {

            char[] chars = each.toCharArray();
            Arrays.sort(chars);
            String sortedStr = String.valueOf(chars);
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(each);

        }
        return new ArrayList<>(map.values());

    }
}
