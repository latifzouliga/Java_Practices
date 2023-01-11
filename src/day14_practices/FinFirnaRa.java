package day14_practices;

public class FinFirnaRa {


    public static void main(String[] args) {


        System.out.println(firnaFinRa(1,50));


    }

    public static String firnaFinRa(int minNum, int maxNum) {

        //int number = 0;

        String result = "";

        for (int i = 0; minNum <= maxNum; minNum++) {


            if (minNum % 3 == 0 && minNum % 5 == 0) {

                result += " FIRNA ";
            } else if (minNum % 3 == 0) {
                result += " FIN ";
            } else if (minNum % 5 == 0) {
                result += " RA ";
            } else {
                result +=  " " + minNum;
            }

        }

        return result;

    } // provide minimum number and maximum number when calling this method

}
