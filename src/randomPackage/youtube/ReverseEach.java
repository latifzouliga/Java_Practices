package randomPackage.youtube;

import java.util.Random;

public class ReverseEach {

    public static void main(String[] args) {


        String str = "How are you";

        String[] words = str.split(" ");

        System.out.println("-----------------StringBuilder------------------");

        String result1 = "";
        for (String each : words) {
            StringBuilder reversed = new StringBuilder(each);
            result1 += reversed.reverse() + " ";

        }
        System.out.println(result1);

        System.out.println("-----------------While loop----------------------");

        String result2 = "";
        for (String word : words) {
            String reverse = "";
            int k = word.length() - 1;

            while (k >= 0) {
                reverse += word.charAt(k);
                k--;
            }
            result2 += reverse + " ";
        }
        System.out.println(result2);

        System.out.println("--------------------for i loop---------------------------");

        String result3 = "";
        for (String each : words) {
            String rev = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                rev += each.charAt(i);
            }
            result3 += rev + " ";

        }
        System.out.println(result3);


    }
}
