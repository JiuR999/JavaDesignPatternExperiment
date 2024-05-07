package cn.swust.lab3;

import cn.swust.lab3.stratery.impl.HtmlStatement;
import cn.swust.lab3.stratery.impl.StringStatement;
import cn.swust.lab3.utils.JsonDataLoader;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Customer customer = new Customer("张三");
        //设置为HTML格式打印
        customer.setStatementStratery(new HtmlStatement());
        //从配置文件读取租界记录并加载
        List<Rental> rentals = new JsonDataLoader<Rental>()
                .loadDatasFromJson(Client.class.getResource("/rental.json").getPath(),
                        new TypeReference<List<Rental>>() {
                        });
        customer.setRentals(rentals);
        //html打印
        customer.statement();
        System.out.println("\n字符串打印");
        //字符串打印
        customer.setStatementStratery(new StringStatement());
        customer.statement();
    }
}
