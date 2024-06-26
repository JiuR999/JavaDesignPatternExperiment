package cn.swust.lab2.question9;

import cn.swust.lab2.question9.stratery.HatchStratery;

public class Hatchet extends Weapon{

    @Override
    void initStratery() {
        this.attackStratery = new HatchStratery();
    }

    @Override
    public int getDamage() {
        return 30;
    }

    @Override
    public int getCost() {
        return 500;
    }
}
