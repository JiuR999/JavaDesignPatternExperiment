package cn.swust.lab1.question6.two.impl;

// 被观察者接口
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}