package day11_strings;

import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email address:");

        String email = input.nextLine();

        // abdellatif_zouliga@yahoo.com

        // Extracting the first name
        int first_name1 = email.indexOf(0) + 1;
        int fisrt_name2 = email.lastIndexOf('_');
        String firstName = email.substring(first_name1, fisrt_name2);

        // Extracting the last name
        int last_name1 = email.indexOf('_') + 1;
        int last_name2 = email.lastIndexOf('@');
        String lastName = email.substring(last_name1, last_name2);

        //Extracting the domain name
        int domain_1 = email.indexOf('@')+1;
        int domain_2 = email.lastIndexOf('.');
        String domain = email.substring(domain_1,domain_2);

        // Extracting the first character of the first name
        String firstName_char = firstName.substring(0,1);

        // Extracting the first character of last name
        String lastName_char = lastName.substring(0,1);

        // Making character of first name uppercase
        String firstNameChar_upperCase = firstName_char.toUpperCase();
        // Making character of last name uppercase
        String lastNameChar_upperCase = lastName_char.toUpperCase();

        // removing the first character from first name
        String noFirstChr_firstName = firstName.substring(1);

        // removing the first character from last name
        String noFirstChar_lastName = lastName.substring(1);

        // lowercase: first name, last name and domain name


        // concatenating the first char with first name amd making them lower case
        String realFirstName = firstNameChar_upperCase.concat(noFirstChr_firstName.toLowerCase());

        //  concatenating the first char with last name amd making them lower case
        String realLastName = lastNameChar_upperCase.concat(noFirstChar_lastName.toLowerCase());

        //---------------------------------------------------------------------------

        System.out.println("First name: "+realFirstName);
        System.out.println("Last name: "+realLastName);
        System.out.println("Domain: "+domain);



    }
}
/*
9. Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple
 */