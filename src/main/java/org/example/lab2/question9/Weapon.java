package org.example.lab2.question9;

import org.example.lab2.question9.stratery.AttackStratery;

public abstract class Weapon {
    AttackStratery attackStratery;

    public Weapon() {
        initStratery();
    }

    String attack() {
        return attackStratery.performAttack();
    }

    abstract void initStratery();

    abstract int getDamage();

    abstract int getCost();
}
