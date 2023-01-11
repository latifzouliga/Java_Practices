package day31_practices.BrowserTask;

public class Browser {

    private String name;

    public Browser(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    // check if browser is valid
    public void setName(String name) {

        boolean isValid = validName(name);
        if (!isValid) {
            System.err.println("Invalid browser name");
            System.exit(1);
        }
        this.name = name;
    }

    // valid browsers
    private boolean validName(String name) {

        switch (name) {
            case "Firefox":
            case "firefox":
            case "Chrome":
            case "chrome":
            case "Safari":
            case "safari":
            case "Opera":
            case "opera":
                break;
        }
        return true;
    }

    public void openBrowser() {
        System.out.println("Opening browser " );
    }

    public void closeBrowser() {
        System.out.println("Closing browser ");
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                '}';
    }
}
/*
browserTask:
    1. Create a class named Browser:

            Methods:
                openBrowser(): prints "opening chrome browser"
                closeBrowser():  prints "closing chrome browser"

    2. Create the following sub classes of Browser and override the methods if needed:

            1. ChromeBrowser
                    methods:
                        openBrowser(): prints "opening chrome browser"
                        closeBrowser():  prints "closing chrome browser"

            2. FireFox extends Browser
                    methods:
                        openBrowser(): prints "opening firefox browser"
                        closeBrowser(): prints "closing fire fox browser"

            3. Opera extends Browser
                    methods:
                        openBrowser(): prints "opening opera browser"
                        closeBrowser(): prints "closing opera browser"

            4. Safari extends Browser
                    methods:
                        openBrowser(): prints "opening safari browser"
                        closeBrowser(): prints "closing safari browser"

 */