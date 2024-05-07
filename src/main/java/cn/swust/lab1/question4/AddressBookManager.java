package cn.swust.lab1.question4;

public class AddressBookManager extends PhoneManager{
    @Override
    public void copy(StorageItem storageItem) {
        System.out.println("将通讯录所有联系人信息备份至" + storageItem.getType());
    }
}
