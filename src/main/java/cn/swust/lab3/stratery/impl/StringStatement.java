package cn.swust.lab3.stratery.impl;

import cn.swust.lab3.Customer;
import cn.swust.lab3.Rental;
import cn.swust.lab3.stratery.StatementStratery;

import java.util.Iterator;

public class StringStatement implements StatementStratery {
    @Override
    public String statement(Customer customer) {
        double totalAmount = 0; // 总消费金。
        int frequentRenterPoints = 0; // 常客积点
        Iterator<Rental> rentals = customer.getRentals().iterator();
        String result = "Rental Record for " + customer.getName() + "\n";
        while (rentals.hasNext()) {
            double thisAmount = 0;
            // 取得一笔租借记录。
            Rental each = rentals.next();

            thisAmount = each.getCharge();
            // add frequent renter points 累计常客积点。
            frequentRenterPoints += each.getFrequentRenterPoints();
            // show figures for this rental（显示此笔租借记录）
            result += "\t" + each.getMovie().getTitle() + "\t"
                    + thisAmount + "\n";
            totalAmount += thisAmount;
        }
        // add footer lines（结尾打印）
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints
                + " frequent renter points";
        return result;
    }
}
