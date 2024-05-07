package org.example.lab2.question2;

import java.math.BigDecimal;

public interface CalculateStratery {
    public static BigDecimal CURRENT_INTEREST = BigDecimal.valueOf(0.0035);
    public static BigDecimal FIXED_INTEREST = BigDecimal.valueOf(0.0135);
    BigDecimal queryInterest(BigDecimal balance);
}
