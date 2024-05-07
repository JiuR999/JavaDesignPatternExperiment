package org.example.lab1.question6.two.pojo;

import org.example.lab1.question6.two.impl.Observer;
import org.example.lab1.question6.two.impl.Subject;

import java.util.ArrayList;
import java.util.List;

// 租房中介类，作为被观察者
public class RentalAgency implements Subject {
    private List<Observer> observers;
    private int transactionCount;

    public RentalAgency() {
        observers = new ArrayList<>();
        transactionCount = 0;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // 租房交易流程
    public void rentHouse(String transactionDetails) {
        // 交押金
        notifyObservers("房东和租客交押金：" + transactionDetails);
        transactionCount++;
        // 签合同
        notifyObservers("房东和租客签订租房合同：" + transactionDetails);
        transactionCount++;
        // 拿钥匙
        notifyObservers("房东将房子钥匙交给租客：" + transactionDetails);
        transactionCount++;
        System.out.println("交易完成！");
    }

    // 统计已办理的交易数
    public int getTransactionCount() {
        return transactionCount;
    }
}
