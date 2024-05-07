package cn.swust.lab3.factory;

import cn.swust.lab3.Movie;

public class MovieFactory {

    public static Movie getMovie(String title, int priceCode){
        return new Movie(title,priceCode);
    }
}
