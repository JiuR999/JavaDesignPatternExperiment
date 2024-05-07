package org.example.lab1.question10;

public class Soldier extends Enemy{

    public Soldier(int speed, int reaction, int attackLevel) {
        super(speed, reaction, attackLevel);
    }

    @Override
    public void attack() {
        System.out.println("士兵攻击了你对你造成"+ this.attackLevel+"伤害");
    }
}
