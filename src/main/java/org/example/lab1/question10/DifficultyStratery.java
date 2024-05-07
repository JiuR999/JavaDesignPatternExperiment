package org.example.lab1.question10;

import java.util.ArrayList;
import java.util.List;

public abstract class DifficultyStratery {
    protected List<Enemy> enemys = new ArrayList<>();
    abstract void createSoldier();
    abstract void createMonster();
    void attack(){
        for (Enemy enemy : enemys) {
            enemy.attack();
        }
    }
}
