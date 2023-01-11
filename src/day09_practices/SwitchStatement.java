package day09_practices;

public class SwitchStatement {

    public static void main(String[] args) {


        int day = 3;
        String result;

        switch (day){
            case 1: result = "Monday"; break;
            case 2: result = "Tuesady"; break;
            case 3: result = "Wednesday"; break;
            case 4: result = "Thursday"; break;
            case 5: result = "Friday"; break;
            case 6: result = "Saturday"; break;
            case 7: result = "Sunday"; break;
            default:
                if (day < 1) {
                    result = "Minimum day number can not be less than 1";
            }else {
                    result = "Minimum day number can not be greater than 7";
                }

        }
        System.out.println(result);

        System.out.println("----------------------------------");

        int month = 1;
        String result2;

        if (month >= 1 && month <=12){

            switch (month){
                case 1: result2 = "January"; break;
                case 2: result2 = "Fabruary"; break;
                case 3: result2 = "March"; break;
                case 4: result2 = "April"; break;
                case 5: result2 = "May"; break;
                case 6: result2 = "June"; break;
                case 7: result2 = "July"; break;
                case 8: result2 = "August"; break;
                case 9: result2 = "September"; break;
                case 10: result2 = "October"; break;
                case 11: result2 = "November"; break;
                default: result2 = "December"; break;

            }
        }else {
            result2 = "invalid";
        }
        System.out.println(result2);


    }


}
