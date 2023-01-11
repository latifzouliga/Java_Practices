package day12_practices;

public class day {

    public static void main(String[] args) {

        int day = 11;

       dayName(day);



    }
    public static void dayName(int numberOfday){

        String result = (numberOfday == 1)?"Monday":(numberOfday == 2)?"Tuesday"
                :(numberOfday == 3)?"Wednesday"
                :(numberOfday == 4)?"Thursday"
                :(numberOfday == 5)?"Friday"
                :(numberOfday==6)?"Saturday"
                :(numberOfday== 7)?"Sunday"
                :"Invalid number";

        System.out.println(result);
    }






}
