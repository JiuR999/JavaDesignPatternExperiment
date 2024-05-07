package cn.swust.lab2.question9;

public class Client {
    public static void main(String[] args) {
        // 创建几个角色
        Character king = CharacterFactory.createCharacter("King", 100);
        Character queen = CharacterFactory.createCharacter("Queen", 90);
        Character knight = CharacterFactory.createCharacter("Knight", 120);

        // 角色装备武器
        king.equipWeapon(new Dagger());
        queen.equipWeapon(new BowAndArrow());
        knight.equipWeapon(new Hatchet());
        //角色攻击
        king.attack(queen);
        queen.attack(knight);
        knight.attack(king);
        //角色购买并装备新武器
        king.buyWeapon(new Hatchet());
    }
}
