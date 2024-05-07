package org.example.lab2.question4;

class Tiger extends Animal implements Chase{
    public Tiger(AnimalMediator mediator) {
        super(mediator);
        mediator.register(this);
    }

    @Override
    public void run() {
        System.out.println("老虎正在跑");
    }

    @Override
    public void interact(Animal animal) {
        System.out.println("老虎"+Animal.getAnimalCategory(animal)+"联系");

    }

    public void hunt(Animal animal) {
        System.out.println("老虎在狩猎" + Animal.getAnimalCategory(animal));
        mediator.coordinate(animal);
    }

    public void bite(Animal animal){
        System.out.println("老虎用嘴巴咬" + Animal.getAnimalCategory(animal));
    }

    @Override
    public void chase(Animal animal){
        System.out.println("老虎在追逐" + Animal.getAnimalCategory(animal));
        mediator.coordinate(animal);
    }

    public void snarl(Animal animal){
        System.out.println("老虎在吃" + Animal.getAnimalCategory(animal));
    }
}