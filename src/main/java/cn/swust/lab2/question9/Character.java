package cn.swust.lab2.question9;

class Character {
    private String name;
    private int health;
    private Weapon weapon;
    private int gold;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
        this.weapon = null;
    }

    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
        System.out.println(name + " 装备了 " + weapon.getClass().getSimpleName());
    }

    public void abandonWeapon(){
        this.weapon = null;
    }

    public void saleWeapon(Weapon weapon){
        abandonWeapon();
        this.gold += (int) (weapon.getCost() * 0.6);
    }
    public void buyWeapon(Weapon weapon){
        System.out.println(name + "购买了" + weapon.getClass().getSimpleName() +
                "花费" + weapon.getCost());
        this.gold -= weapon.getCost();
        equipWeapon(weapon);
    }
    public void attack(Character target) {
        if (weapon != null) {
            System.out.println(name + " 攻击 " + target.getName() + " 用 " + weapon.getClass().getSimpleName() +
                    weapon.attack() + " 造成 " + weapon.getDamage() + " 伤害");
            target.health -= weapon.getDamage();
        } else {
            System.out.println(name + " 还没装备装备");
        }
    }

    /**.

     * 切换武器.
     * @param weapon 新的武器.
     */
    public void switchWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }
}