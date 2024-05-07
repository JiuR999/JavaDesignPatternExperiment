package cn.swust.lab2.question10;

import java.math.BigDecimal;

public class WechatPay implements PaymentMethod{
    @Override
    public void pay(BigDecimal total) {
        System.out.println("微信支付" + total + "元");
    }
}
