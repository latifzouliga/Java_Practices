package day23_practices;

import java.util.ArrayList;

public class Extract {

    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";

        char[] ch = str.toCharArray();

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();

        for (char each : ch) {
            if (Character.isLetter(each)){
                letters.add(each);
            } else if (Character.isDigit(each)) {
                digits.add(each);
            }else {
                specialChars.add(each);
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);


    }


}
