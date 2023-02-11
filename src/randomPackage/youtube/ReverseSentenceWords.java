package randomPackage.youtube;

public class ReverseSentenceWords {

    public static void main(String[] args) {

        String str = "We are learning java";

        String[] words =  str.split(" ");

        String result = "";

        for (int i = words.length -1; i >=0  ; i--) {
            result += words[i]+ " ";
        }
        System.out.println(result);
    }
}
