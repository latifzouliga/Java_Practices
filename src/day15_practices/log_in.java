package day15_practices;

import java.util.Scanner;

public class log_in {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = input.nextLine();

        System.out.println("Enter your password:");
        String password = input.nextLine();


        if (username.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println("Logged in");

        } else if (!username.equals("Cydeo") && !password.equals("Cydeo123")) {
            for (int i = 1; i <= 2; i++) {

                if (i > 3 || !username.equals("Cydeo") || !password.equals("Cydeo123")) {

                    if (i == 1) {
                        System.err.println("This is your second attempt");
                    } else if (i == 2) {
                        System.err.println("This is your last attempt");
                    } else {
                        System.err.println("Your account is locked");
                    }

                    System.out.println("Enter your username:");
                    username = input.nextLine();
                    System.out.println("Enter your password:");
                    password = input.nextLine();


                    if (username.equals("Cydeo") && password.equals("Cydeo123")) {
                        System.out.println("Logged in");
                    }


                }

            }
        }else {
            System.err.println("Your acount is locked");
        }

    }


}
/*
7. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have
                three attempts to enter correct credentials and if all
                three attempts are failed,
                then print "Your account is lucked."


 */