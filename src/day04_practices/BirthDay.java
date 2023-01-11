package day04_practices;
/*
2. Create a class called BirthDay and create the following variable
             name, birthDay(int), birthMonth(String), birthYear(int)

             use concatenation to display the birthday of the person

                 if  name = "John"
                     birthDay = 25
                     birthMonth = "April"
                     birthYear = 1995;

                 output:
                     John was born on April/25/1995.

 */

public class BirthDay {

    public static void main(String[] args) {

        String name = "Jahn",
                birthMonth = "April";
        int birthDay = 25,
                birhtYear = 1995;

        System.out.println(name + " Was born on " + birthMonth + "/" + birthDay+ "/" + birhtYear + ".");


    }
}
