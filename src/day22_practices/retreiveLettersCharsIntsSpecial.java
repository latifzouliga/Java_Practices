package day22_practices;

public class retreiveLettersCharsIntsSpecial {

    public static void main(String[] args) {

        String str = "Wooden Spoon!";
        char[] string = str.toCharArray();

        String letters = "";
        String chars = "";
        String digits = "";

        for (char each : string) {
            if (Character.isLetter(each)) {
                letters += each;
            }
            if (!Character.isLetterOrDigit(each)){
                chars += each;
            }
            if (Character.isDigit(each)){
                digits += each;
            }


        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("Special chars = " + chars);


    }
}
/*
5. Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";

        Note: Use Wrapper class methods
 */