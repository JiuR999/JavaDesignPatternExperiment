package org.example.lab1.question10;

import org.example.lab1.question10.factory.DifficultyLevelGameFactory;

public class Player {
    protected int level;
    protected DifficultyLevelGameFactory factory;

    public Player(DifficultyLevelGameFactory factory) {
        this.factory = factory;
    }

    public void switchLevel(DifficultyLevelGameFactory difficultyLevelGameFactory) {
        this.factory = difficultyLevelGameFactory;
    }
    public void play() {
        Game game = factory.createGame();
        System.out.println("您选择游戏难度为:" + game.difficultyStratery.getClass().getSimpleName());
        game.play();
    }

}
