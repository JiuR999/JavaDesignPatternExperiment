package cn.swust.lab2.question5;

public abstract class DataEncryption implements Data{
    protected Data data;
    public DataEncryption(Data data) {
        this.data = data;
    }

    @Override
    public String processData() {
        return data.processData();
    }
}
