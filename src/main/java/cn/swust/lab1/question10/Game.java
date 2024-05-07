package cn.swust.lab1.question10;

public class Game {
    DifficultyStratery difficultyStratery;

    public Game(DifficultyStratery difficultyStratery) {
        this.difficultyStratery = difficultyStratery;
    }

    public void setDifficultyStratery(DifficultyStratery difficultyStratery) {
        this.difficultyStratery = difficultyStratery;
    }

    void play(){
        difficultyStratery.createSoldier();
        difficultyStratery.createMonster();
        difficultyStratery.attack();
    }
}
