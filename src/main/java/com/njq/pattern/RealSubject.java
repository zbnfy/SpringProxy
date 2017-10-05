package com.njq.pattern;

/**
 * Created by NIJIAQI on 2017/10/5.
 */
public class RealSubject implements Subject{
    public void request() {
        System.out.println("real subject execute request");
    }

    public void hello() {
        System.out.println("hello");
    }
}
