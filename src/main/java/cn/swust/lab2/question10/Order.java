package cn.swust.lab2.question10;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order implements PromotionStratery{
    BigDecimal skuTotal;
    BigDecimal deliverTotal;
    List<PromotionStratery> promotionStrateries;
    public Order(BigDecimal skuTotal, BigDecimal deliverTotal) {
        this.skuTotal = skuTotal;
        this.deliverTotal = deliverTotal;
        promotionStrateries = new ArrayList<>();
    }

    public void addProStratery(PromotionStratery promotionStratery){
        this.promotionStrateries.add(promotionStratery);
    }
    public void checkOut(){
        System.out.println("总共花费:" + (this.skuTotal.add(this.deliverTotal)).subtract(promotion()));
    }

    @Override
    public BigDecimal promotion() {
        System.out.println("原价" + (this.skuTotal.add(this.deliverTotal))+"元");
        return (this.skuTotal.add(this.deliverTotal));
    }


    public BigDecimal getSkuTotal() {
        return skuTotal;
    }

    public void setSkuTotal(BigDecimal skuTotal) {
        this.skuTotal = skuTotal;
    }

    public BigDecimal getDeliverTotal() {
        return deliverTotal;
    }

    public void setDeliverTotal(BigDecimal deliverTotal) {
        this.deliverTotal = deliverTotal;
    }
}
