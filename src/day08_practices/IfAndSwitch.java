package day08_practices;

public class IfAndSwitch {

    public static void main(String[] args) {


        String batch = "EU";    // Enter the name of your batch here
        String result ="Class times are: ";

        if (batch == "US morning"||batch == "US evening"||batch == "EU"){
            switch (batch){

                case "US morning":
                    result +=  "10-5 EST. M, T, Th, F.";
                    break;
                case "US evening":
                    result += "7-10 EST. M, T, W, Th, S, S";
                    break;
                case "EU":
                    result += "10-5 EST. M, T, W, Th, F.";

            }

        }else{
            result = "Invalid batch";
        }
        System.out.println(result);

    }
}
