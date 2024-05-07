package cn.swust.lab1.question10;

public class Difficulty extends DifficultyStratery{
    @Override
    public void createSoldier() {
        System.out.println("选择高级难度");
        System.out.println("设置敌方士兵反映敏捷");
        this.enemys.add(new Soldier(500,500,300));
        System.out.println("就算是高级玩家也难逃被击毙的厄运");
    }

    @Override
    public void createMonster() {
        System.out.println("设置怪兽狰狞狡诈");
        this.enemys.add(new Monster(500,500,300));
    }
}
