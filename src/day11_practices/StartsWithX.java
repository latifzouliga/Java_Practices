package day11_practices;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");

        char a = 'a';

        String word = input.nextLine();

        if (word.startsWith("x")) {

            word = word.replaceFirst("x", "a");
        } else if (word.startsWith("X")) {
            word = word.replaceFirst("X", "a");
        } else {
            System.out.println("\"" + word + "\"" + " Word doesn't start with x,");
        }
        System.out.println(word);


    }
}
/*
2. Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x,
    replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex

 */