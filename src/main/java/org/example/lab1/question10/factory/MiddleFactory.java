package org.example.lab1.question10.factory;

import org.example.lab1.question10.Game;
import org.example.lab1.question10.MiddleLevel;

public class MiddleFactory extends DifficultyLevelGameFactory{
    @Override
    public Game createGame() {
        return new Game(new MiddleLevel());
    }
}
