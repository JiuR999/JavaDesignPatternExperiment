package cn.swust.lab2.question9;

import cn.swust.lab2.question9.stratery.AttackStratery;

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
