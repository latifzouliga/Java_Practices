package day13_customMethods;

public class title {

    public static void main(String[] args) {

        System.out.println(title("aBdeLLaTif"));




    }

    public static String title(String word){

        String result = word.toUpperCase().substring(0,1) + word.toLowerCase().substring(1);

        return result;





    }
}
/*
7. Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
        title("jAvA") ===> Java
 */