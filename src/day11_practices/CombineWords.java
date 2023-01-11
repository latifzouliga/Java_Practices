package day11_practices;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first word:");

        String firstWord = input.nextLine();

        System.out.println("Enter the second word:");

        String secondWord = input.nextLine();

        String combineWords = firstWord.concat(secondWord);

        // Extracting the last chr of second word
        String char1 = secondWord.substring(0, 1);

        // Extracting first char of first word
        String char2 = firstWord.substring(firstWord.length() - 1);

        // comparing the two extracted characters
        boolean compare = char1.equals(char2);

        // concatenating the first word and the second word
        String oneString = firstWord.concat(" " + secondWord);

        if (compare) {
            System.out.println(char1);
        } else {
            System.out.println(oneString);
        }

    }
}
/*
Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter of the first word and the first letter of the last word is the same,
    print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
 */