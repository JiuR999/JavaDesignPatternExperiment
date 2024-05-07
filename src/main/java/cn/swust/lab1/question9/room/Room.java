package cn.swust.lab1.question9.room;

public abstract class Room {
    protected String name;
    protected int price;

    public Room() {
        initRoom();
    }

    abstract void initRoom();

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
