package org.example.lab1.question10;

public class Monster extends Enemy{
    public Monster(int speed, int reaction, int attackLevel) {
        super(speed, reaction, attackLevel);
    }

    @Override
    public void attack() {
        System.out.println("怪兽攻击你对你造成伤害"+ this.attackLevel);
    }
}
