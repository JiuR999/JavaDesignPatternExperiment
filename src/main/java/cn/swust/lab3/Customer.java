package cn.swust.lab3;

import cn.swust.lab3.stratery.StatementStratery;
import lombok.Data;
import lombok.Getter;

import java.util.*;

@Data
public class Customer {
   private String name; // 姓名
   private List<Rental> rentals = new ArrayList<>(); // 租借记
   private StatementStratery statementStratery;
   public Customer(String name) {
      this.name = name;
   };

   public void addRental(Rental arg) {
      this.rentals.add(arg);
   }

   public void setStatementStratery(StatementStratery statementStratery) {
      this.statementStratery = statementStratery;
   }

   public void statement() {
      System.out.println(statementStratery.statement(this));
   }

}
