package cn.swust.lab1.question2;

public abstract class Shape {
    protected int width;
    protected int height;
    protected String bColor;
    protected String fColor;
    protected EraseStatery statery;

    public Shape(EraseStatery statery) {
        this.statery = statery;
    }

    public Shape() {
        setSize();
        setColor();
        fill();
    }

    public EraseStatery getStatery() {
        return statery;
    }

    public void setColor(){
        System.out.println("设置边框颜色");
    }
    public void fill(){
        System.out.println("设置填充颜色");
    }
    public void setSize(){
        System.out.println("设置画布宽高");
    }

    public abstract void draw();
    public void erase(){
        statery.erase();
    }
    public abstract void display();
}
