package org.example.proxy;

public class Main {
    public static void main(String [] args) {
        Browser browser = new Browser("www.naver.com");
        browser.show();

        IBrowser ibrowser = new BrowserProxy("www.cache.com");
        ibrowser.show();
        ibrowser.show();
    }
}
