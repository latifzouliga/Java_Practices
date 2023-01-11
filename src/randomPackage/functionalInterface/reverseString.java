package randomPackage.functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;

public class reverseString {

    public static void main(String[] args) {


        String str = "aaaddfssawq";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = count(str,ch);
            if (!result.contains(ch+"")){
                result += ch +":"+ count+" ";
            }
        }

        System.out.println(result);

    }



    public static int count(String str, char ch){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)){
                count++;
            }
        }
        return count;
    }


}
