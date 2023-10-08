package day22_arrayList;

public class CompareChars {

    public static void main(String[] args) {

        String str = "JAVA java";

        // converting string to char array
        char[] strToChars = str.toCharArray();

        int countUpperCase = 0;
        int countLowerCase = 0;


        for (char each : strToChars) {

            if (Character.isUpperCase(each)) {  // checking is a character is upperCase
                countUpperCase++;
            }
            if (Character.isLowerCase(each)){  // checking is a character is lowerCase
                countLowerCase++;
            }
        }
        if (countUpperCase == countLowerCase){  // comparing the number of lowerCase chars number with upperCase chars number
            System.out.println(true);
        }else {
            System.out.println(false);
        }



    }

}
/*
6. Write program that returns true if the total number of upper case characters are equal to total number
  of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true

        Note: Use Wrapper class methods
 */