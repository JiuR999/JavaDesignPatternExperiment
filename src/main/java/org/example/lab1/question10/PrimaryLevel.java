package org.example.lab1.question10;

public class PrimaryLevel extends DifficultyStratery{
    @Override
    public void createSoldier() {

        System.out.println("设置敌方士兵反应迟钝");
        //System.out.println("即便是初学者也能够很轻松地取胜");
        this.enemys.add(new Soldier(200,100,50));
    }

    @Override
    public void createMonster() {
        System.out.println("设置怪兽步履缓慢");
        this.enemys.add(new Monster(200,100,50));
    }
//    @Override
//    public void setSoldiersReaction() {
//        System.out.println("敌方士兵反应迟钝");
//    }
//
//    @Override
//    public void setMonstersMoveSpeed() {
//        System.out.println("怪兽步履缓慢");
//    }
//
//    @Override
//    public void play() {
//        System.out.println("即便是初学者也能够很轻松地取胜");
//    }
}
