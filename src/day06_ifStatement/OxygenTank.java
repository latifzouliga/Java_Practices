package day06_ifStatement;

public class OxygenTank {
    public static void main(String[] args) {

        int num = 91;
        String statement= "";

        if (num >= 50 && num <= 60){
            statement = "Be carefull now you are at 50%";
        }
        if (num >= 60 && num < 70){
            statement = "Start too head back";
        }
        if (num >= 70 && num < 80){
            statement = "Don't go too far";
        }
        if ( num >= 80 && num < 90){
            statement = "Still okey";
        }
        if (num > 90){
            statement = "Your Tank is full";
        }
        System.out.println(statement);



    }
}
/*
8. Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and
   you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY

 */