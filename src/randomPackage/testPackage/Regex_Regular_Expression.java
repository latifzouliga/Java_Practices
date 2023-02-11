package randomPackage.testPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.util.regex.*;

public class Regex_Regular_Expression {
    public static void main(String args[]) {
        //1st way
        Pattern p = Pattern.compile(".s");//. represents single character
        Matcher m = p.matcher("as");
        boolean b = m.matches();
       //2nd way
        boolean b2 = Pattern.compile(".s").matcher("as").matches();
        //3rd way
        boolean b3 = Pattern.matches(".s", "as");
        System.out.println(b + " " + b2 + " " + b3);

        //BufferedWriter writer = new BufferedWriter()




    }
}