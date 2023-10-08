package day14_forLoop;

public class palindrome {

    public static void main(String[] args) {

        String str = "Anna";

        String reversed = "";

        for (int i = str.length()-1; i >= 0; i--) {  // reversing the string

            char ch2 = str.charAt(i);
            reversed += ch2;

        }
        if (str.equalsIgnoreCase(reversed)) {   // comparing the reversed string with the original one
            System.out.println(true);
        }else {
            System.out.println(false);
        }









    }
}
/*
7. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
 */