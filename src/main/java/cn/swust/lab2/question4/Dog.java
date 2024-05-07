package cn.swust.lab2.question4;

public class Dog extends Animal implements Chase, Cscape, Bark{
    public Dog(AnimalMediator mediator) {
        super(mediator);
        mediator.register(this);
    }

    @Override
    public void run() {
        System.out.println("狗在跑");
    }

    @Override
    public void interact(Animal animal) {
        System.out.println("狗与"+Animal.getAnimalCategory(animal)+"联系");
    }

    @Override
    public void chase(Animal animal) {
        System.out.println("狗在追逐" + Animal.getAnimalCategory(animal));
    }

    @Override
    public void cscape() {
        System.out.println("狗cscape");
    }

    @Override
    public void bark() {
        System.out.println("狗在扒树皮");
    }
}
