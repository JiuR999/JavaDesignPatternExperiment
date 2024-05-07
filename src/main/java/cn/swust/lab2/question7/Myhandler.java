package cn.swust.lab2.question7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.time.LocalDateTime;

public class Myhandler implements InvocationHandler {
    Object target;

    public Myhandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        method.invoke(target,args);
        long endTime = System.currentTimeMillis();
        System.out.println(target.getClass().getSimpleName() +
                "花费:" + (endTime - startTime) + "s");
        return null;
    }
}
