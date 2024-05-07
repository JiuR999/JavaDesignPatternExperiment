package cn.swust.lab3.stratery.impl;

import cn.swust.lab3.Movie;
import cn.swust.lab3.stratery.Price;

public class VarietyShowPrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.VARIETY_SHOW;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 3.0;
        if (daysRented > 3)
            result += (daysRented - 3) * 2.0;
        return result;
    }
}