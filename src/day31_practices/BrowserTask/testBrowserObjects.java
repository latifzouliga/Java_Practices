package day31_practices.BrowserTask;

public class testBrowserObjects {

    public static void main(String[] args) {

        FirefoxBrowser firefox = new FirefoxBrowser();

        SafariBrowser safari = new SafariBrowser();

        OperaBrowser opera = new OperaBrowser();

        ChromeBrowser chrome = new ChromeBrowser();

        firefox.openBrowser();
        firefox.closeBrowser();
        System.out.println("-------------------------------");

        safari.openBrowser();
        safari.closeBrowser();
        System.out.println("-------------------------------");

        opera.openBrowser();
        opera.closeBrowser();
        System.out.println("-------------------------------");

        chrome.openBrowser();
        chrome.closeBrowser();




    }


}
