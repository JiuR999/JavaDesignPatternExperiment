package cn.swust.lab2.question10;

import java.math.BigDecimal;

public class BankCardPay implements PaymentMethod{
    @Override
    public void pay(BigDecimal total) {
        System.out.println("银行卡支付" + total + "元");
    }
}
