package day08_ifStatement_switch_ternary;

public class browser {

    public static void main(String[] args) {

        String browserName = "aaaa",    // Enter your desired browser here.

                result = "Invalid Browser";

        switch (browserName) {
            case "chrome":
                result = browserName;
                break;
            case "firefox":
                result = browserName;
                break;
            case "opera":
                result = browserName;
                break;
            case "safari":
                result = browserName;
            case "edge":
        /*       I found that these 3 lines are unnecessary, Instead I assigned "Invalid browser" to result variable
                break;

            default:
                result = "Invalid Browser";
        */
        }
        System.out.println(result);


    }
}
/*
9. write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
 */