package cn.swust.lab2.question7;

import java.lang.reflect.Proxy;

public class ProxyFactory {
    public static Object getProxy(Object target){
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new Myhandler(target));
        return proxy;
    }
}
