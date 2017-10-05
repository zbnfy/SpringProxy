package com.njq.dynamic;

import com.njq.pattern.RealSubject;
import com.njq.pattern.Subject;

import java.lang.reflect.Proxy;

/**
 * Created by NIJIAQI on 2017/10/5.
 */
public class Client {
    public static void main(String[] args) {
        //生成字节码文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        Subject subject = (Subject) Proxy.newProxyInstance(com.njq.pattern.Client.class.getClassLoader(),new Class[]{Subject.class},new jdkSubject(new RealSubject()));
        subject.request();
        subject.hello();
    }
}
