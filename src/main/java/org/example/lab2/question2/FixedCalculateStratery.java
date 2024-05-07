package org.example.lab2.question2;

import java.math.BigDecimal;

public class FixedCalculateStratery implements CalculateStratery{
    @Override
    public BigDecimal queryInterest(BigDecimal balance) {
        return balance.multiply(CalculateStratery.FIXED_INTEREST);
    }
}
