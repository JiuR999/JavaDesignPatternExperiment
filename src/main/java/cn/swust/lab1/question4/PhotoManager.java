package cn.swust.lab1.question4;

public class PhotoManager extends PhoneManager{
    @Override
    public void copy(StorageItem storageItem) {
        System.out.println("将所有照片备份至" + storageItem.getType());
    }
}
