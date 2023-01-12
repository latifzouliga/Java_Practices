package randomPackage.youtube;


import java.util.Arrays;
import java.util.Collections;

public class countCharacterOccurance {

    public static void main(String[] args) {

        String str = "Java is object oriented programming language";

        String str2 = str.replace("a", "");

        System.out.println(str.length() - str2.length());

        int count = Collections.frequency(Arrays.asList(str.split("")),"g");

        System.out.println(count);





    }
}
