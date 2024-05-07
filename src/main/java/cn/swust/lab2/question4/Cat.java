package cn.swust.lab2.question4;

public class Cat extends Animal implements Cscape, Mew, ClimbeTree {
    public Cat(AnimalMediator mediator) {
        super(mediator);
        mediator.register(this);
    }
    @Override
    public void run() {
        System.out.println("猫在跑");
    }

    @Override
    public void interact(Animal animal) {
        System.out.println("猫与"+ getAnimalCategory(animal)+"联系");
    }
    @Override
    public void climbeTree() {
        System.out.println("猫在爬树");
    }

    @Override
    public void cscape() {
        System.out.println("猫cscape");
    }

    @Override
    public void mew() {
        System.out.println("猫在喵喵叫");
    }
}
