package cn.swust.lab1.question4;

public class MusicManager extends PhoneManager{
    @Override
    public void copy(StorageItem storageItem) {
        System.out.println("将所有歌曲备份至" + storageItem.getType());
    }
}
