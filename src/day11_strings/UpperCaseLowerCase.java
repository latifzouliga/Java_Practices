package day11_strings;

import java.util.Scanner;

public class UpperCaseLowerCase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");

        String first_name = input.nextLine();

        System.out.println("Enter your last name:");

        String last_name = input.nextLine();

        // to all lower case

        String loweCase_firstName = first_name.toLowerCase();
        String lowerCase_lastname = last_name.toLowerCase();

        // Extracting the first characters of first  and last names

        String firstChar_firstName = loweCase_firstName.substring(0,1);
        String firstChar_lastname = lowerCase_lastname.substring(0,1);

        // characters to upper case
        String charToUpperCase1 = firstChar_firstName.toUpperCase();
        String charToUpperCase2 = firstChar_lastname.toUpperCase();

        // removing the first characters from first and last names

        String firstName = loweCase_firstName.substring(1);
        String  lastName = lowerCase_lastname.substring(1);

        // concatenating

        String first = charToUpperCase1.concat(firstName);
        String last = charToUpperCase2.concat(lastName);

        System.out.println(first+ " "+ last);




    }
}
/*
7. Write a program that asks user to enter first and last names, and then prints the full name in regular
format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */