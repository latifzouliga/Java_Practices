package day16_practices;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to reserve a room? Yes/No");
        String reserve = input.next().toLowerCase();

        while (!reserve.equals("yes") && !reserve.equals("no")) {
            System.err.println("Re-enter Yes/No");
            reserve = input.next();
        }

        input.nextLine();

        int result = 0;
        int total = 0;
        String roomType = "";

        if (reserve.equals("no")) {
            System.out.println("Thank you. Have a nice day");

        } else {
            while (reserve.equals("yes")) {


                System.out.println("Which room do you wanna reserve?");
                String room = input.nextLine();

                while (!(room.equals("king") || room.equals("queen") || room.equals("single"))) {
                    System.err.println("Invalid entry");
                    System.out.println("Which room do you wanna reserve?");
                    room = input.nextLine();
                    if (room.equals("king") || room.equals("queen") || room.equals("single")) {
                        break;
                    }

                }

                System.out.println("How many nights you are staying?");
                int night = input.nextInt();

                System.out.println("Do you wanna reserve another room?");
                reserve = input.next();
                input.nextLine();
                if (reserve.equals("no")){
                    return;
                }

                while (!reserve.equals("yes") && !reserve.equals("no")) {
                    System.err.println("Re-enter Yes/No");
                    reserve = input.next();
                }
                input.nextLine();

                // calculate the price of rooms
                switch (room) {
                    case "king": result = 120 * night; break;
                    case "queen": result = 100 * night; break;
                    case "single": result = 80 * night;
                }
                total += result;

                // extra code to calculate the nuumber of rooms based on type
                if (room.equals("king")) {
                    roomType += ", " + night + " " + room + " bed";
                } else if (room.equals("queen")) {
                    roomType += ", " + night + " " + room +" bed";
                } else {
                    roomType += ", " + night + " " + room+ " bed";
                }
                System.out.println("The total price for" + roomType + " is: $" + total);
                System.out.println("Have a nice day");
            }

        }


    }
}
/*
8. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she
            is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

                If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */