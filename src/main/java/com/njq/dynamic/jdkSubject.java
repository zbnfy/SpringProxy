package com.njq.dynamic;

import com.njq.pattern.RealSubject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * aspect
 * Created by NIJIAQI on 2017/10/5.
 */
public class jdkSubject implements InvocationHandler{
    private RealSubject realSubject;

    public jdkSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    /**
     * 动态反射方法：方法的反射就是静态代理和动态代理的区别
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
         Object result = null;
        try {
            result = method.invoke(realSubject,args);
        } catch (Exception e) {
            System.out.println("ex:"+e.getMessage());
            throw e;
        } finally {
            System.out.println("after");
        }
        return result;
    }
}
