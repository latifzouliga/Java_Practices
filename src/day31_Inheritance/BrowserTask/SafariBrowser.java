package day31_Inheritance.BrowserTask;

public class SafariBrowser extends Browser{

    public SafariBrowser() {
        super("Safari browser");
    }

    @Override
    public void openBrowser() {
        System.out.println("Opening "+ getName()+ " to watch Muhtar's java videos");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing "+getName()+ " because i'm tired");
    }
}
