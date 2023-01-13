package randomPackage.youtube;

public class ReverseString {

    public static void main(String[] args) {

        String str2 = "java";

        StringBuffer string = new StringBuffer(str2);

        string.reverse();

        System.out.println(string);

        System.out.println("----------------------------");

        String str1 = "hello";
        String result = "";
        for(int i = str1.length() -1; i >= 0; i--){
            result += str1.charAt(i);
        }
        System.out.println(result);

        String str = "I love Java";

        StringBuilder word = new StringBuilder(str.substring(str.indexOf("l"), str.lastIndexOf(" ")));

        System.out.println(str.replace("love",word.reverse()));


    }
}
