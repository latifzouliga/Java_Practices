package day13_customMethods;

public class combine {

    public static void main(String[] args) {

        System.out.println(combine("hello","olla"));



    }
    public static String combine(String word1, String word2){

        String result ="";

         if (word2.startsWith(""+word1.charAt(word1.length()-1))){
             result = word1 + word2.substring(2);

         }else{
             result = word1 + word2;
         }
         return result;








    }


}

/*
5.  Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight

 */