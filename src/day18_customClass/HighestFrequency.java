package day18_customClass;

public class HighestFrequency {

    public static void main(String[] args) {

        String str = "abbcccccddddddddde";

        String result = "";
        int frequency = 0;
        int max = 0;
        char each;

        // the first nested loop is for getting the highest frequency and get it assigned to max variable
        for (int i = 0; i < str.length(); i++) {
            frequency=0;
            each = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (each == str.charAt(j)) { // gets each char
                    frequency++;  // incrementing each char frequency
                }
                if (frequency > max) {
                    max = frequency;// assigning the highest incremented frequency to max variable
                }
            }

        }
        System.out.println(max);// prints the highest int number which is the highest frequency.

        // this nested loop is to get the highest frequency and compare it with the value of max variable
        for (int i = 0; i < str.length(); i++) {

            each = str.charAt(i);
            frequency = 0;
            for (int j = 0; j < str.length(); j++) {

                if (each == str.charAt(j)) { // gets each char

                    frequency++; // get each char freqeuncy
                }
                if (frequency == max && !result.contains(each + "")) { // when the frequency matches the max value
                    result += each;  // concatenating the char that has the highest frequency
                }

            }


        }
       System.out.println(result);


    }


}
/*
1. Write a program that can return the character that has the highest frequency from a string
	Ex:
		str = "aaabbccccddeeee"

		output:
			c
			e
 */