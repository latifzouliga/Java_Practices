package day12_practices;

public class salary {

    public static void main(String[] args) {

        double hourlyRate = 60,
                weeklyHours = 40;

        salary(hourlyRate, weeklyHours);


    }

    public static void salary(double hourlyRate, double weeklyHours) {

        System.out.println("You make " + hourlyRate + " per hour");
        System.out.println("You work " + weeklyHours + " hours in a week");
        System.out.println("Your gross income is $" + hourlyRate * weeklyHours * 53);


    }
}
/*
7. Create a method named salary that takes two arguments:
        1. hourlyRate (double)
        2. weeklyHours (int)

    Then the method should display the salary of the person.
        Ex:
            salary(45, 40)

        output:
            You make $45.0 per hour
            You work 40 hours in a week
            Your gross income is $93600.0
 */