package com.springbootplay.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: huangzuwang
 * @Date: 2019/2/18 17:31
 * @Description:
 */
public class ChargeProxy<T> implements InvocationHandler{



    private T target;

    public ChargeProxy(T target) {
        this.target = target;
    }

    public T getInstance() {
        Class<?> targetClass = target.getClass();
        Object o = Proxy.newProxyInstance(targetClass.getClassLoader(), targetClass.getInterfaces(), this);
        return (T)o;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理：收钱");
        method.invoke(this.target,args);
        return null;
    }
}
