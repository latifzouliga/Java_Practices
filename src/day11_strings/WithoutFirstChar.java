package day11_strings;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a the first word:");

        String firstWord = input.nextLine();

        System.out.println("Enter the second word:");

        String secondWord = input.nextLine();

        firstWord = firstWord.substring(1);
        secondWord = secondWord.substring(1);
        String twoWords = firstWord.concat(secondWord);

        System.out.println(twoWords);




    }
}
/*
5. Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
 */