package randomPackage.youtube;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {

    public static void main(String[] args) {


        String str = "laptop gggg";

        String result = "";

        int max = 0;
       int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            char ch = str.charAt(i);

            for (int k = 0; k < str.length(); k++) {
                char ch2 = str.charAt(k);
                if (ch == ch2){
                    count++;
                }
            }



        }
        System.out.println(result);






    }
}
