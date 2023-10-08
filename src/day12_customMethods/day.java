package day12_customMethods;

public class day {

    public static void main(String[] args) {

        int day = 11;

       dayName(day);



    }
    public static void dayName(int numberOfDay){

        String result = (numberOfDay == 1)?"Monday"
                :(numberOfDay == 2)?"Tuesday"
                :(numberOfDay == 3)?"Wednesday"
                :(numberOfDay == 4)?"Thursday"
                :(numberOfDay == 5)?"Friday"
                :(numberOfDay==6)?"Saturday"
                :(numberOfDay== 7)?"Sunday"
                :"Invalid number";

        System.out.println(result);
    }






}
