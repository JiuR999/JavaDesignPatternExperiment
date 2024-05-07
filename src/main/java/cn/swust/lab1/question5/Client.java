package cn.swust.lab1.question5;

public class Client {
    public static void main(String[] args) {
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
