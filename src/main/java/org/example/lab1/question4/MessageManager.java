package org.example.lab1.question4;

public class MessageManager extends PhoneManager{
    @Override
    public void copy(StorageItem storageItem) {
        System.out.println("将所有信息备份至" + storageItem.getType());
    }
}
