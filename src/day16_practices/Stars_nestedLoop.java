package day16_practices;

public class Stars_nestedLoop {

    public static void main(String[] args) {

        String star = "* * * * * * * * * *";
        String str = "* * * * * * * * * *";

        String result = "";
        String result2 = "";


        for (int i = 0; i < star.length(); i += 2) {
            char ch = star.charAt(i);
            result += " " + ch;
            System.out.println(result);

        }



        System.out.println("-------------------------------------------------------");

        while (str.contains("*")) {
            str = str.replace("*", "");
            for (int i = 0; i < star.length(); i+=2) {
                char ch = star.charAt(i);
                if (ch == star.charAt(i)) {
                    result2 += " "+ch;
                    System.out.println(result2);
                }


            }
            System.out.println(result2);
        }

    }


}

