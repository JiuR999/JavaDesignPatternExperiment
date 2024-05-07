package org.example.lab1.question10.factory;

import org.example.lab1.question10.Difficulty;
import org.example.lab1.question10.Game;

public class DifficultyFactory extends DifficultyLevelGameFactory{
    @Override
    public Game createGame() {
        return new Game(new Difficulty());
    }
}
