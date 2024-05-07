package org.example.lab1.question10;

public abstract class Enemy {
    protected int speed;
    protected int reaction;
    protected int attackLevel;

    public Enemy(int speed, int reaction, int attackLevel) {
        this.speed = speed;
        this.reaction = reaction;
        this.attackLevel = attackLevel;
    }

    public abstract void attack();
}
