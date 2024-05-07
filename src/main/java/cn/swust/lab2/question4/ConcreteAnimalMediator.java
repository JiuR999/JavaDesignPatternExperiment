package cn.swust.lab2.question4;

class ConcreteAnimalMediator extends AnimalMediator {

    @Override
    public void coordinate(Animal animal) {
            if(animal instanceof Cat){
                ((Cat)animal).cscape();
                animal.run();
                ((Cat)animal).climbeTree();
            } else if(animal instanceof Dog){
                ((Dog)animal).cscape();
                animal.run();
            } else if(animal instanceof Tiger){
                animal.run();
            }
    }
}