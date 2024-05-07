package cn.swust.lab3;

import cn.swust.lab3.stratery.Price;
import cn.swust.lab3.stratery.impl.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
   public static final int REGULAR = 0;
   public static final int NEW_RELEASE = 1;
   public static final int CHILDRENS = 2;
   //纪录片
   public static final int DOCUMENTARY = 3;
   //综艺片
   public static final int VARIETY_SHOW = 4;

   private String title;
   private Price price;

   public Movie(String title, int priceCode){
      this.title = title;
      setPriceCode(priceCode);
   }
   public void setPriceCode(int arg) {
      switch (arg) {
         case REGULAR:
            price = new RegularPrice();
            break;
         case CHILDRENS:
            price = new ChildrensPrice();
            break;
         case NEW_RELEASE:
            price = new NewReleasePrice();
            break;
         case DOCUMENTARY:
            price = new DocumentaryPrice();
            break;
         case VARIETY_SHOW:
            price = new VarietyShowPrice();
            break;
         default:
            throw new IllegalArgumentException("Incorrect Price Code");
      }
   }
}
