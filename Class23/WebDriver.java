package com.syntax.Class23;

public class WebDriver {
    public void  startBrowser(){
        System.out.println("Starting the browser");
    }
    public void openUrl(String url){
        System.out.println("Opening "+url);
    }
    public void testLoginPage(){
        System.out.println("Checking if login page is visible ");
    }
    public void closeBrowser(){
        System.out.println("Closing the browser");
    }
}

class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Opening Google Chrome");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("Opening the url on Google Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing Login page on google chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Google Chrome");
    }
}

class Firefox extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Opening Firefox");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("Opening the url on Firefox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing Login page on Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox");
    }
}

class Safari extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Opening Safari");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("Opening the url on Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing Login page on Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Safari");
    }
}


class Edge extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Opening Edge");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("Opening the url on Edge");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing Login page on Edge");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Edge");
    }
}