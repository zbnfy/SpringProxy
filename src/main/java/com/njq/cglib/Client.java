package com.njq.cglib;

import com.njq.pattern.RealSubject;
import com.njq.pattern.Subject;
import org.springframework.cglib.proxy.Enhancer;

/**
 * Created by NIJIAQI on 2017/10/5.
 */
public class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);
        enhancer.setCallback(new MethodInterceptorDemo());
        Subject subject = (Subject) enhancer.create();
        subject.hello();
    }
}
