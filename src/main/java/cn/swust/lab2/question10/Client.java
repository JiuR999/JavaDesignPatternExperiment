package cn.swust.lab2.question10;

import java.math.BigDecimal;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Order order = new Order(BigDecimal.valueOf(199),BigDecimal.valueOf(8));
        PromotionStratery promotionStrateryOrder = null;
        if(order.getSkuTotal().compareTo(BigDecimal.valueOf(99))>0){
            promotionStrateryOrder = new FreeDeleverStratery(order);
            //免运费
            promotionStrateryOrder.promotion();
        }
        //满减优惠
        BigDecimal totalCost = order.getSkuTotal().add(order.getDeliverTotal());
        if(totalCost.compareTo(BigDecimal.valueOf(FullPromotionStratery.FULL_VAL)) > 0){
            promotionStrateryOrder = new FullPromotionStratery(promotionStrateryOrder);
        }

        //选择支付方式支付
        System.out.println("选择支付方式:");
        System.out.println("1.微信支付");
        System.out.println("2.支付宝支付");
        System.out.println("3.银行卡支付");
        int method = new Scanner(System.in).nextInt();
        PaymentMethod paymentMethod = PayMethodFactory.getPayMethod(method);

        //身份验证
        System.out.println("选择验证方式:");
        System.out.println("1.输入密码");
        System.out.println("2.指纹验证");
        int verify = new Scanner(System.in).nextInt();
        IdentityVerification identityVerification = IdentityVerificationFactory.getIdentityVerification(verify);
        identityVerification.verify();
        paymentMethod.pay(promotionStrateryOrder.promotion());
    }
}
