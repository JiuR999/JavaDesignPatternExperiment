package cn.swust.lab2.question4;

public class Client {
    public static void main(String[] args) {
        AnimalMediator mediator = new ConcreteAnimalMediator();
        Tiger tiger = new Tiger(mediator);
        Dog dog = new Dog(mediator);
        Cat cat = new Cat(mediator);
        //老虎与狗联系
        tiger.hunt(dog);
    }
}
