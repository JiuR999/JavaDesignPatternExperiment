package cn.swust.lab1.question7.cloth;

import cn.swust.lab1.question7.ClothLevel;
import cn.swust.lab1.question7.Clothing;

public abstract class Cloth implements Clothing {
    protected ClothLevel clothLevel;

    public ClothLevel getClothLevel() {
        return clothLevel;
    }

    public void setClothLevel(ClothLevel clothLevel) {
        this.clothLevel = clothLevel;
    }
}
