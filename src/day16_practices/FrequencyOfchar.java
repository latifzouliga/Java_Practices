package day16_practices;

import javax.swing.plaf.IconUIResource;

public class FrequencyOfchar {

    public static void main(String[] args) {

        String str = "aabcccd";
        int result = 0;
        String chr = "";

        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j < str.length(); j++) {

                char ch = str.charAt(i);
                if (ch == str.charAt(i) && !chr.contains(ch+"")){
                    result++;

            }

            }
            System.out.println(result);
           

        }






    }
}
/*
9. Write a program that can find the frequency of the characters from a string

                         Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */