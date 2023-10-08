package day20_forEach;

public class reverseSecondWord {

    public static void main(String[] args) {

        String sentence = "I Love Java";

        String[] words = sentence.split(" "); // splitting string into elements

        String str = ""; // store the final result

        String reversed = ""; // store reversed word

        for (int i = 0; i < words.length ; i++) {

                 char ch = 0;
                 str += words[i]+ " "; // concatenating all words

            for (int j = words[1].length() - 1; j >= 0; j--) {   // reversing "Love" word
                ch = words[1].charAt(j); // getting all chars of "Love" word
                reversed += ch+""; // concatenating "Love" characters
            }
            words[1] = reversed; // assigning "Love" word back to array

        }

        System.out.println(str);



    }

}












/*
1. Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */