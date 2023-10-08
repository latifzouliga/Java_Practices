package day11_strings;

import java.util.Scanner;

public class calledEmailTask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email:");

        String email = input.nextLine();


        // check if underScore character '_' is available in email
        boolean underScore = email.contains("_");


        if (underScore){
            String swapEmail = "";

            //to the first name
            int f1 = email.indexOf(0)+1;
            int f2 = email.lastIndexOf('_');
            String first_name = email.substring(f1,f2);
            //------------------------------------------------------

            // to get last name
            int biginning = email.indexOf('_')+1;
            int ending = email.lastIndexOf('@');
            String last_name = email.substring(biginning,ending) ;
            //--------------------------------------------------------

            // swapping first name with last name
            String swapNames = swapEmail.concat(last_name+ '_'+first_name);
            //----------------------------------------------------------------------

            // get the domain name and .com
            String domain = email.substring(email.lastIndexOf('@'));
            //-----------------------------------------------------------------------

            // swapping and concatenating
            swapEmail = swapNames.concat(domain);

            System.out.println(swapEmail);


        }else {
            System.out.println(email);
        }



    }
}
/*
8. Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
 */