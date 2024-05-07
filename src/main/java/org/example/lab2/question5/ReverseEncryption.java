package org.example.lab2.question5;

public class ReverseEncryption extends DataEncryption{
    public ReverseEncryption(Data data) {
        super(data);
    }

    @Override
    public String processData() {
        String data = super.processData();
        return new StringBuilder(data).reverse().toString();
    }
}
