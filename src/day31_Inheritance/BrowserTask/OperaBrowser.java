package day31_Inheritance.BrowserTask;

public class OperaBrowser extends Browser{

    public OperaBrowser() {
        super("Opera");
    }

    @Override
    public void openBrowser() {
        System.out.println("Opening "+ getName()+ " to do google search");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing "+getName()+" search tab");
    }
}
