package cn.swust.lab1.question10.factory;

import cn.swust.lab1.question10.Difficulty;
import cn.swust.lab1.question10.Game;

public class DifficultyFactory extends DifficultyLevelGameFactory{
    @Override
    public Game createGame() {
        return new Game(new Difficulty());
    }
}
