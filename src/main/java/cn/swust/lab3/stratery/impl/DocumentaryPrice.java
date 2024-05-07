package cn.swust.lab3.stratery.impl;

import cn.swust.lab3.Movie;
import cn.swust.lab3.stratery.Price;

public class DocumentaryPrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.DOCUMENTARY;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 2.5;
        if (daysRented > 5)
            result += (daysRented - 5) * 1.0;
        return result;
    }
}