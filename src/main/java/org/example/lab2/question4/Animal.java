package org.example.lab2.question4;

public abstract class Animal {
    protected AnimalMediator mediator;

    public Animal(AnimalMediator mediator) {
        this.mediator = mediator;
    }
    public abstract void run();
    public static String getAnimalCategory(Animal animal){
        return animal.getClass().getSimpleName();
    }
    public abstract void interact(Animal animal);

}
