package cn.swust.lab2.question2;

import java.math.BigDecimal;

public class InterestCalculator {
    private CalculateStratery calculateStratery;

    public void setCalculateStratery(CalculateStratery calculateStratery) {
        this.calculateStratery = calculateStratery;
    }

    public BigDecimal calculateInterest(BigDecimal banlance){
        return calculateStratery.queryInterest(banlance);
    }
}
