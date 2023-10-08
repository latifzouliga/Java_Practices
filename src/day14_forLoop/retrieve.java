package day14_forLoop;

public class retrieve {

    public static void main(String[] args) {

        String str = "%^&*";

        String result = "";
        String digits = "";
        String chr = "";



        for (int i = 0; i < str.length(); i++) {


            char ch = str.charAt(i); // to get each character and compare it with ASCII table

            if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) { // lower and upper case letters in ASCII table
                result += ch;

            } else if (ch >= 48 && ch <= 57) {   // digits in ASCII table
                digits += ch;

            } else {
                chr += ch;
            }


        }
        System.out.print("letters: "+result);
        System.out.println();
        System.out.print("Digits: "+digits);
        System.out.println();
        System.out.print("Special characters: "+chr);


    }
}
/*
5. write a program that can retrive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!



 */