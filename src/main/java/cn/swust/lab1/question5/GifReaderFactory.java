package cn.swust.lab1.question5;

public class GifReaderFactory extends ImageReaderFactory{
    @Override
    public ImageReader createImageReader() {
        return new GifReader();
    }
}
