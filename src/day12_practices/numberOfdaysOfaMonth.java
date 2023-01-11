package day12_practices;

public class numberOfdaysOfaMonth {

    public static void main(String[] args) {

        String month = "aaa";

        mothname(month);

    }


    public static void mothname(String month){

        String result;

        month = month.substring(0,1).toUpperCase() + month.substring(1).toLowerCase();

        if (month.equals("January") || month.equals("March")  || month.equals("May") || month.equals("August")|| month.equals("October") || month.equals("December")){
            result = "has 31 days";
        } else if (month.equals("September")||month.equals("April")||month.equals("June")|| month.equals("November")) {
            result  = "has 30 days";
        }else if (month.equals("February")){
            result = "has 28 days";
        }else {
            result = "is invalid month name";
        }


        System.out.println(month + " "+result);

        //30: September, April, June, and November.
        //31: January March May July August October December
        //28: February




    }
}
/*
5. Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
 */