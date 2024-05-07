package cn.swust.lab1.question5;

public class JpgReaderFactory extends ImageReaderFactory{
    @Override
    public ImageReader createImageReader() {
        return new JpgReader();
    }
}
