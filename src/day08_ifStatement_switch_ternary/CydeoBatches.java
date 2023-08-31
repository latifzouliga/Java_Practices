package day08_ifStatement_switch_ternary;

public class CydeoBatches {

    public static void main(String[] args) {

        String batchType = "US morning",

                result = "Class times are ";

        if (batchType == "US morning") {
            result += "10-5 EST. M, T, Th, F.";

        } else if (batchType == "US evening") {
            result += "7-10 EST. M, T, W, Th, S, S";

        } else if (batchType == "EU")
            result += "10-5 EST. M, T, W, Th, F";
        else {
            result = "Invalid Batch";
        }
        System.out.println(result);

        System.out.println("------------------------------");

        String result2 = "Class times are ";

        switch (batchType) {
            case "US morning":
                result2 += "10-5 EST. M, T, Th";
                break;
            case "US evening":
                result2 += "7-10 EST. M, T, W";
                break;
            case "EU":
                result2 += "10-5 EST. M, T, W, Th, F";
                break;
            default:
                result2 = "Invalid Batch";
        }
        System.out.println(result2);

        System.out.println("-----------------------------------");


        // This task is without curly braces

        String batch1 = "EU";  // Enter the Batch type here

        String result3 = "Class times are: ";

        if (batch1 == "US morning")
            result3 += "10-5 EST. M, T, Th, F.";
        else if (batch1 == "US evening")
            result3 += "7-10 EST. M, T, W, Th, S, S";
        else if (batch1 == "EU")
            result3 += "10-5 EST. M, T, W, Th, F.";
        else
            result3 = "Invalid Batch";
        System.out.println(result3);


        String Batch = "";
        result = "";

        if (Batch == "US morning" || Batch == "US evening" || Batch == "EU") {
            switch (batch1) {
                case "US morning":
                    result += "10-5 EST. M, T, Th, F.";
                    break;
                case "US evening":
                    result += "7-10 EST. M, T, W, Th, S, S";
                    break;
                case "EU":
                    result3 += "10-5 EST. M, T, W, Th, F.";
                    break;
            }

        } else {
            result = "Invalid batch";
        }


    }


}

/*
10. Create a class named CydeoBatches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */