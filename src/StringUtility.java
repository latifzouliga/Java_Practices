public class StringUtility {

    public static String reverse(String str) {

        String reverse = "";


        for (int i = str.length() - 1; i >= 0; i--) {
            // to get the index nums of the string starting from last index to index 0

            reverse += str.charAt(i);
            // to get each character of the string starting from last index to index 0 and concatenating them

        }

        return reverse;
    }  // reverse any given string


    public static String removeDup(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)) {
                result += each;
            }

        }

        return result;
    } // remove duplicates


    public static int frequency(String str, char ch) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (ch == str.charAt(i)) {
                count++;
            }
        }

        return count;
    } // a char frequency

    public static int wordFrequency(String str, String word){

        int count = 0;

        while (str.contains(word)){

            str = str.replaceFirst(word,"");
            count++;

        }
        return count;

    }  // word frequency






}
