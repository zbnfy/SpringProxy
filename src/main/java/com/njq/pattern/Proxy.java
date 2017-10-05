package com.njq.pattern;

/**
 * Created by NIJIAQI on 2017/10/5.
 */
public class Proxy implements Subject{
    private  RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public void request() {
        System.out.println("before");
        try {
            realSubject.request();
        } catch (Exception e) {
            System.out.println("ex:"+e.getMessage());
            try {
                throw e;
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } finally {
            System.out.println("after");
        }
    }

    public void hello() {
        System.out.println("before");
        try {
            realSubject.hello();
        } catch (Exception e) {
            System.out.println("ex:"+e.getMessage());
            try {
                throw e;
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } finally {
            System.out.println("after");
        }
    }
}
