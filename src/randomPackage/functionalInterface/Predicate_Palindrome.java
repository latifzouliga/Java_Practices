package randomPackage.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Predicate_Palindrome {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("Java", "Python", "anable", "racecar", "Hello"));

        System.out.println(list);
       /*
        Predicate<String> predicate = a -> {
            String result = "";
            for (int i = a.length() -1; i >= 0 ; i--) {
                result += a.charAt(i);
            }
            if (a.equals(result)){
                return true;
            }
            return false;
        };

 */

        int max = list.get(0).length();
        String result = "";
        for (String each : list) {
            if (reverse(each)){
                if (each.length() > max){
                    max = each.length();
                    result = each;
                }
            }
        }
        System.out.println(result);

    }

    public static boolean reverse(String str){

        for (int i = 0; i < str.length() /2; i++) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(str.length() -1 -i);
            if (ch1 != ch2){
                return false;
            }
        }
        return true;
    }

}
