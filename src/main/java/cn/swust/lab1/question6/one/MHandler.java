package cn.swust.lab1.question6.one;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MHandler implements InvocationHandler {
    Intercepter intercepter;
    Object target;

    public MHandler(Intercepter intercepter, Object target) {
        this.intercepter = intercepter;
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        intercepter.before(method,args);
        method.invoke(target,args);
        intercepter.after();
        return target;
    }
}
