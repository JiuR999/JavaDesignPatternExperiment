package cn.swust.lab1.question4;

public class SDcard extends StorageItem{
    @Override
    public void write(PhoneManager manager) {
        manager.copy(this);
        System.out.println("SD卡写入成功!");
    }

    @Override
    public String getType() {
        return "SDcard";
    }
}
