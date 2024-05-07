package cn.swust.lab3.stratery.impl;

import cn.swust.lab3.Customer;
import cn.swust.lab3.Rental;
import cn.swust.lab3.stratery.StatementStratery;

import java.util.Iterator;

public class HtmlStatement implements StatementStratery {
    @Override
    public String statement(Customer customer) {
        double totalAmount = 0; // 总消费金。
        int frequentRenterPoints = 0; // 常客积点
        Iterator<Rental> rentals = customer.getRentals().iterator();
        String result = "<h1>Rental Record for <em>" + customer.getName() + "</em></h1>\n";

        while (rentals.hasNext()) {
            double thisAmount = 0;
            // 取得一笔租借记录。
            Rental each = rentals.next();
            result += "<p>\t" + each.getMovie().getTitle() + ": " + each.getCharge() + "<br></p>\n";

            totalAmount += each.getCharge();
            // add frequent renter points 累计常客积点。
            frequentRenterPoints += each.getFrequentRenterPoints();
            result += "<p>Amount owed is " + totalAmount + "</p>\n";
            result += "<p>You earned " + frequentRenterPoints + " frequent renter points</p>\n";
        }
        // add footer lines（结尾打印）
        result += "===============================\n";
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints
                + " frequent renter points";
        return result;
    }
}
