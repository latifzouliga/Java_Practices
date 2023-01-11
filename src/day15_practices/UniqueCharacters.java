package day15_practices;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "@@@@@@99999AAAAC{7}ddddda:Z";


        String result = "";

        for (int i = 1; i <= str.length() - 1; i++) {

            char ch = str.charAt(i);   // getting each char individually
            int first = str.indexOf(ch);  // getting the index of a char (from left to right)
            int last = str.lastIndexOf(ch); // getting the lastIndex of a char (from right to left)

            if (first == last) {  // comparing a single char, if a single char has the same index number then it's a unique char
                result += " " + ch;   // concatenating all unique char to a variable
            }

        }
        System.out.print("Unique characters are: " + result);



    }
}
/*
9. Create a class called UniqueCharacters, Write a program that can return the unique characters from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD

	            Hint: You will need indexOf() and lastIndexOf()
	                  if the first and last index numbers of the character are same, then it's unique
 */