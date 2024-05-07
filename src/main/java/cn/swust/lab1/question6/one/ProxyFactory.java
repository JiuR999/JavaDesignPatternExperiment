package cn.swust.lab1.question6.one;

import java.lang.reflect.Proxy;

public class ProxyFactory {

    public static Object getProxy(Object target, Intercepter intercepter) {
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new MHandler(intercepter, target));
        return  proxy;
    }
}
