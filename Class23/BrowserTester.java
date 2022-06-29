package com.syntax.Class23;

public class BrowserTester {
    public static void main(String[] args) {

        WebDriver browser = new Firefox();

 //    browser.closeBrowser();
 //    browser.startBrowser();
 //    browser.openUrl("WWW.GOOGLE.COM");
 //    browser.testLoginPage();

        WebDriver [] browsers = {new Chrome(), new Safari(), new Edge(), new Firefox()};

        for(WebDriver b:browsers){
            b.closeBrowser();
            b.startBrowser();
            b.openUrl("WWW.GOOGLE.COM");
            b.testLoginPage();
        }


    }
}
