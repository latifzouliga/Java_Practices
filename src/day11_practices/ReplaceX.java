package day11_practices;

import java.util.Scanner;

public class ReplaceX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");

        String word = input.nextLine();

        String new_word = "";

        if (word.startsWith("x")) {
             new_word = word.replace("x", "a");

        } else if (word.startsWith("X")) {
            new_word = word.replace("X", "a");

        } else {
            System.out.println("\"" + word + "\"" + " Word doesn't start with x or X");

        }
        System.out.println("Old word is: \"" + word+ "\" and the new word is \""+ new_word + "\"");


    }
}
/*
3. Create a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with
 character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */