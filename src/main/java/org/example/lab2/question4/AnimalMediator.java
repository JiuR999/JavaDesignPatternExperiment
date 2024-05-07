package org.example.lab2.question4;

public abstract class AnimalMediator {
    private Animal cat;
    private Animal dog;
    private Animal tiger;
    //Animal getAnimal(String animalType, AnimalMediator mediator);
    public void register(Animal colleague){
        if(colleague instanceof Tiger){
            this.tiger = colleague;
        }else if(colleague instanceof Dog){
            this.dog = colleague;
        } else if(colleague instanceof  Cat){
            this.cat = colleague;
        }
    }
    public abstract void coordinate(Animal animal);


    public Animal getCat() {
        return cat;
    }
    public Animal getDog() {
        return dog;
    }

    public Animal getTiger() {
        return tiger;
    }
}