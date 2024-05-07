package cn.swust.lab2.question2;

import java.math.BigDecimal;

public class CurrentAccountCalculateStratery implements CalculateStratery{
    @Override
    public BigDecimal queryInterest(BigDecimal balance) {
        return balance.multiply(CalculateStratery.CURRENT_INTEREST);
    }
}
