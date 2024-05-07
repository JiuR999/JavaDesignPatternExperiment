package cn.swust.lab2.question10;

import java.math.BigDecimal;

public class AlipayPayment implements PaymentMethod{
    @Override
    public void pay(BigDecimal total) {
        System.out.println("支付宝支付" + total + "元");
    }
}
