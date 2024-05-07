package cn.swust.lab2.question10;

import java.util.HashMap;
import java.util.Map;

public class PayMethodFactory {
    private static Map<Integer,PaymentMethod> methodMap;

    static {
        methodMap = new HashMap<>();
        methodMap.put(1,new WechatPay());
        methodMap.put(2,new AlipayPayment());
        methodMap.put(3,new BankCardPay());
    }
    public static PaymentMethod getPayMethod(int methodName){
        return methodMap.get(methodName);
    }
}
