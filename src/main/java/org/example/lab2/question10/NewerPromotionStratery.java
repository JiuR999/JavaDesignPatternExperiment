package org.example.lab2.question10;

import java.math.BigDecimal;

public class NewerPromotionStratery extends OrderPromotion {

    public static final int NWER_PROMOTION_VAL = 10;

    public NewerPromotionStratery(PromotionStratery promotionStratery) {
        super(promotionStratery);
    }

    @Override
    public BigDecimal promotion() {
        System.out.println("新人优惠" + "返" + NWER_PROMOTION_VAL + "元");
        return super.promotion().add(BigDecimal.valueOf(NWER_PROMOTION_VAL));
        //totalConst.setSkuTotal(totalConst.getSkuTotal().subtract(BigDecimal.valueOf(NWER_PROMOTION_VAL)));
    }
}
