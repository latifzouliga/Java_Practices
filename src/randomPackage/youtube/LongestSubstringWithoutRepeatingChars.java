package randomPackage.youtube;

public class LongestSubstringWithoutRepeatingChars {

    public static void main(String[] args) {

        String str = "abcabcd";

        String result = "";
        int max = 0;
        for (int i = 0; i < str.length(); i++) {

            String substrings = "";
            String sub = "";
            for (int j = i; j < str.length(); j++) {
                // if the index of a character is greater than pr equals to 0, that means that the character is repeated
                if (sub.indexOf(str.charAt(j)) >= 0){
                    break;
                }
                //if (sub.contains(str.charAt(j)+"")){
                    //break;
                //}
                substrings += str.charAt(j);
                sub = str.substring(i,j+1);
            }
            if (substrings.length() > max){
                max = substrings.length();
                result = substrings;
            }
            System.out.println(substrings);
            System.out.println(sub);
            System.out.println();
        }
        //System.out.println(result);


    }
}
