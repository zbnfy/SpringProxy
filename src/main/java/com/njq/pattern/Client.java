package com.njq.pattern;

/**
 * Created by NIJIAQI on 2017/10/5.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new Proxy(new RealSubject());
        subject.request();
    }
}
