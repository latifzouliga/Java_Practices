package day15_practices;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to reserve a room? Yes/No");
        String reserve = input.next().toLowerCase();

        while (!reserve.equals("yes") && !reserve.equals("no")) {
            System.out.println("Re-enter Yes/No");
            reserve = input.next();
        }

        input.nextLine();

        String result = "";

        if (reserve.equals("yes")) {

            System.out.println("Which Type of rooms you want?");
            String roomType = input.nextLine();

            result = (roomType.equalsIgnoreCase("King Bed")) ? "King Bed ==> 120$"
                    : (roomType.equalsIgnoreCase("Queen Bed")) ? "Queen Bed ==> 100$"
                    : (roomType.equalsIgnoreCase("single Bed")) ? "Single Bed ==> 80$"
                    :"Invalid Entry";

        } else {
            System.out.println("Have a nice day");
        }

        input.close();

        System.out.println(result);


    }
}
/*
8. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to
 reserve a room.
 if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a
 nice day"
 if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid
    			 entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */