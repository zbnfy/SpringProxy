package com.njq.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by NIJIAQI on 2017/10/5.
 */
public class MethodInterceptorDemo implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before in cglib");
        Object result = null;
        try {
            result = methodProxy.invokeSuper(o,objects);
        } catch (Exception e) {
            System.out.println("ex:"+e.getMessage());
            throw e;
        } finally {
            System.out.println("after in cglib");
        }
        return result;
    }
}
