package cn.swust.lab2.question1;

import cn.swust.lab2.question1.color.Black;
import cn.swust.lab2.question1.color.Color;
import cn.swust.lab2.question1.color.Red;

public class Client {
    private Pen pen;
    private Color color;
    public void write(){
        pen.write();
    }
    public void setColor(Color color){
        this.pen.setColor(color);
    }
    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public static void main(String[] args) {
        Client client = new Client();
        Pen pen = new SmallPen();
        //小黑笔
        client.setPen(pen);
        client.setColor(new Black());
        client.write();
        System.out.println("===================");
        //切换颜色为红色
        client.setColor(new Red());
        client.write();
        //切换为大型红色的笔
        System.out.println("===================");
        client.setPen(new LargePen());
        client.setColor(new Red());
        client.write();
    }
}
