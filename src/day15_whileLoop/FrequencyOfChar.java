package day15_whileLoop;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String str = "aabcccd";
        char  chr = 'c';

        String str2 = str.replace("c", "c1"); // new string
        int str1 = str.length();  // the length of the original string
        int str3 = str2.length(); // the length of the new declared string
        int result = str3 - str1;
        System.out.println(result);
        //-----------------------------------------------------------------------------------

        String sentence = " Java programming language";
        char ch = 'g';
        String sentence2 = sentence.replace("g","");
        int result1 = sentence.length() - sentence2.length();
        System.out.println(result1);





    }



}
/*
3. Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char, the returns
 the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */