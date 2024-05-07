package cn.swust.lab2.question2;

import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) {
        //模拟查询数据库后用户余额为100000元
        BigDecimal banlance = BigDecimal.valueOf(100000);
        InterestCalculator interestCalculator = new InterestCalculator();
        //模拟登录失败
        boolean isLoging = login("123456", "123456");
        if(!isLoging){
            System.out.println("账户密码不匹配,请检查后重新输入!");
        } else {
            //定义一个死期计算的示例
            CalculateStratery calculateStratery = new FixedCalculateStratery();
            interestCalculator.setCalculateStratery(calculateStratery);
            //查询利息
            BigDecimal interest = interestCalculator.calculateInterest(banlance);
            System.out.printf("您的余额为:%s,所得利息为:%s\n", banlance,interest.toString());
        }
    }

    private static boolean login(String account, String password) {
        //模拟数据库存储用户的账号与密码
        String stdAccount = "123456";
        String stdPassword = "123456";
        if(account.equals(stdAccount) && password.equals(stdPassword)){
            return true;
        }
        return false;
    }
}
