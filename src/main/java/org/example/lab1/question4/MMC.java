package org.example.lab1.question4;

public class MMC extends StorageItem{
    @Override
    public void write(PhoneManager manager) {
        manager.copy(this);
        System.out.println("MMF写入成功!");
    }

    @Override
    public String getType() {
        return "MMF";
    }
}
