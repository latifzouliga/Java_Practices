package day07_ifStatement;

public class Browser {
    public static void main(String[] args) {

        String browserName = "Opera",
                result = " Browser is selected";
        boolean browses = browserName== "Chrome" || browserName == "Firefox"|| browserName == "Opera"
                ||browserName == "Safari" || browserName == "Edge";
        if (browses){
            if (browserName == "Chrome"){
                result = browserName + result;
            } else if (browserName == "Firefox") {
                result = browserName + result;
            } else if (browserName == "Opera") {
                result = browserName + result;
            } else if (browserName == "Safari") {
                result = browserName + result;
            }else {
                result = browserName + result;
            }

        }else{
            result = "Invalid browser name";
        }
        System.out.println(result);


    }
}
/*
2. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
 */