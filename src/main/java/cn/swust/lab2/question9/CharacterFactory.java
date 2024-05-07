package cn.swust.lab2.question9;

public class CharacterFactory {
    public static Character createCharacter(String name, int health){
        return new Character(name, health);
    }
}
