package org.example.lab2.question10;

import java.math.BigDecimal;

public abstract class OrderPromotion implements PromotionStratery{
    protected  PromotionStratery promotionStratery;

    public OrderPromotion(PromotionStratery promotionStratery) {
        this.promotionStratery = promotionStratery;
    }

    @Override
    public BigDecimal promotion() {
        return promotionStratery.promotion();
    }
}
