package org.example.lab1.question6.one;

import java.lang.reflect.Method;

public interface Intercepter {
    void before(Method method,Object[] args);
    void after();
}
