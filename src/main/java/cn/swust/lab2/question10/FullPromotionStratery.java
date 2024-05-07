package cn.swust.lab2.question10;

import java.math.BigDecimal;

public class FullPromotionStratery extends OrderPromotion{

    public static final int FULL_VAL = 199;
    public static final int PROMOTION_VAL = 10;

    public FullPromotionStratery(PromotionStratery promotionStratery) {
        super(promotionStratery);
    }

    @Override
    public BigDecimal promotion() {
        BigDecimal price = super.promotion().subtract(BigDecimal.valueOf(PROMOTION_VAL));
        System.out.println("订单满199减10,共计:" + price);
        return price;
    }

//    @Override
//    public void promotion(Order totalConst) {
//        if(totalConst.getSkuTotal().compareTo(BigDecimal.valueOf(FULL_VAL)) == 1){
//
//            BigDecimal nTotalConst = totalConst.getSkuTotal().subtract(BigDecimal.valueOf(PROMOTION_VAL));
//            totalConst.setSkuTotal(nTotalConst);
//        }
//    }
}
