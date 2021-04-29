package org.example.aop;

import org.example.proxy.Html;
import org.example.proxy.IBrowser;

public class AopAdapter implements IBrowser {

    private String url;
    private Html html;

    private Runnable before;
    private Runnable after;
    public AopAdapter(String url, Runnable before, Runnable after) {
        this.url = url;
        this.before = before;
        this.after = after;
    }

    @Override
    public Html show() throws InterruptedException {
        before.run();
        if (html == null) {
            System.out.println("AopBrowser html loading from : " + url);
            Thread.sleep(1500);
        }
        after.run();
        System.out.println("AopBrowser html cache : " + url);
        return null;
    }
}
