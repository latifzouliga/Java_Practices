package day31_practices.BrowserTask;

public class FirefoxBrowser extends Browser{


    public FirefoxBrowser() {
        super("Firefox Browser");
    }

    @Override
    public void openBrowser() {
        System.out.println("Opening "+ getName() + " and surfing the web");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing "+ getName()+ " tabs");
    }
}
