package cn.swust.lab1.question10;

public class MiddleLevel extends DifficultyStratery{
    @Override
    public void createSoldier() {
        System.out.println("选择中级难度");
        System.out.println("设置敌方士兵反应适度");
        this.enemys.add(new Soldier(300,300,100));
        //System.out.println("中级玩家有可能取胜");
    }

    @Override
    public void createMonster() {
        System.out.println("设置怪兽步履速度中等");
        this.enemys.add(new Monster(300,300,100));

    }
//    @Override
//    public void setSoldiersReaction() {
//        System.out.println("敌方士兵反应适度");
//    }
//
//    @Override
//    public void setMonstersMoveSpeed() {
//        System.out.println("怪兽步履速度中等");
//    }
//
//    @Override
//    public void play() {
//        System.out.println("敌方士兵反应迟钝");
//    }
}
