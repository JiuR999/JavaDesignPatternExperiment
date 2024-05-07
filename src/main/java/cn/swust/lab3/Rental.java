package cn.swust.lab3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rental {
   private Movie movie; // 影片
   private int daysRented; // 租期

   public double getCharge() {
      return movie.getPrice().getCharge(daysRented);
   }

   public int getFrequentRenterPoints() {
      return movie.getPrice().getFrequentRenterPoints(daysRented);
   }
}
