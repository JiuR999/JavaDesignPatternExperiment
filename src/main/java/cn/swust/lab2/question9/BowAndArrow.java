package cn.swust.lab2.question9;

import cn.swust.lab2.question9.stratery.ShootStratery;

public class BowAndArrow extends Weapon{

    @Override
    void initStratery() {
        this.attackStratery = new ShootStratery();
    }

    @Override
    public int getDamage() {
        return 20;
    }

    @Override
    public int getCost() {
        return 350;
    }

}
