package day09_practices;

import java.util.Scanner;

public class SpeedCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your speed:");

        int speed = input.nextInt();

        int speedLimit = 55;

        if(speedLimit != speed){
            System.out.println("You're driving "+ (speed - speedLimit)+ " mph over the limit. Slow down");

        }

    }
}
/*
4. Create a class named SpeedCheck and write a program for the speed check.
	A variable named speedLimit is declared and given
	ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;

            Enter current speed:
            105

            output:
            	You're driving 50 mph over the limit. Slow down!

 */