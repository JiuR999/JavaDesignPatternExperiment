package org.example.lab1.question10;

import org.example.lab1.question10.factory.DifficultyFactory;
import org.example.lab1.question10.factory.MiddleFactory;
import org.example.lab1.question10.factory.SimpleGameFactory;

public class Client {

    public static void main(String[] args) {
        Player player = new Player(new SimpleGameFactory());
        player.play();
        System.out.println("===========================");
        player.switchLevel(new MiddleFactory());
        player.play();
        System.out.println("===========================");
        player.switchLevel(new DifficultyFactory());
        player.play();
    }
}
