package day13_practices;

public class frequencyOfWord {

    public static void main(String[] args) {

        String sentence = "Morocco is the best is country, morocco is in is africa, morocco is good";
        String word = "is";

        System.out.println(frequencyOfWord(sentence,word));



    }

    public static int frequencyOfWord(String sentence, String word){


        //sentence = "this is java and I love java, java is good";
        //word = "java";

        String replacement = sentence.toLowerCase().replace(word,word.substring(1));

        int result = sentence.length() - replacement.length();

        return result;






    }
}
/*
6. Create a method named frequencyOfWord that takes two arguments:
            1. sentence (String)
            2. word (String)

    The method should return the frequency of the word from the sentence

        Ex:
            frequencyOfWord("Java java jAvA", "java")  ==> 4
 */