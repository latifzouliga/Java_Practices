package day11_strings;

import java.util.Scanner;

public class FirstName_lastName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");

        String first_name = input.nextLine();

        System.out.println("Enter your last name:");

        String last_name = input.nextLine();

        System.out.println(first_name.concat(" "+last_name));


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