package randomPackage.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class java_regex {

    public static void main(String[] args) {

        //https://regex101.com/

        Pattern pattern = Pattern.compile("ll");
        Matcher matcher = pattern.matcher("this is hello 1234");

        boolean found = matcher.matches();

        while (matcher.find()){
            System.out.println(matcher.start());
            System.out.println(matcher.end());
            System.out.println(matcher.group());
            System.out.println("matcher.groupCount() = " + matcher.groupCount());
        }

        System.out.println(found);

    }
}
