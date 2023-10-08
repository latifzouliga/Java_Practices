package day31_Inheritance.BrowserTask;

public class ChromeBrowser extends Browser{

    public ChromeBrowser() {
        super("Chrome browser");
    }

    @Override
    public void openBrowser() {
        System.out.println("Opening "+ getName()+ " to watch youtube videos");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing "+ getName()+ " last tab");
    }

}
