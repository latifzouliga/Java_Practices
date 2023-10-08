package day15_whileLoop;

import java.util.Scanner;

public class Cydeo {
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

                if (i > 2 ) {

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
                    } else {
                        System.out.println(i + " this is your last attempt");
                    }

                }
            }
        }
    }
}
