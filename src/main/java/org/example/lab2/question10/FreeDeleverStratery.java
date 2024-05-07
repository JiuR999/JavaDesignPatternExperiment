package org.example.lab2.question10;

import java.math.BigDecimal;

public class FreeDeleverStratery extends OrderPromotion{
    public FreeDeleverStratery(PromotionStratery promotionStratery) {
        super(promotionStratery);
    }

    @Override
    public BigDecimal promotion() {
        BigDecimal price = super.promotion().subtract(BigDecimal.valueOf(8));
        System.out.println("订单满99元" + "免收运费" +"共计:"+price);
        return price;
    }
}
