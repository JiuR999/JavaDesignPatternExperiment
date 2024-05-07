package cn.swust;

import cn.swust.lab1.question5.GifReaderFactory;
import cn.swust.lab1.question5.ImageReader;
import cn.swust.lab1.question5.ImageReaderFactory;
import cn.swust.lab1.question5.JpgReaderFactory;

public class Main {
    public static void main(String[] args) {
//        BackupUtil backupUtil = new BackupUtil();
//        backupUtil.setManager(new AddressBookManager());
//        backupUtil.setManager(new MessageManager());
//        backupUtil.setManager(new MusicManager());
//
//        backupUtil.backup(new MMC());
//        //备份至SD卡
//        System.out.println("===================");
//        backupUtil.backup(new SDcard());

        //读取JPG格式
        readImage(new JpgReaderFactory());
        System.out.println("==============");
        //读取GIF
        readImage(new GifReaderFactory());

    }

    private static void readImage(ImageReaderFactory factory) {
        ImageReader imageReader = factory.createImageReader();
        imageReader.read();
    }
}