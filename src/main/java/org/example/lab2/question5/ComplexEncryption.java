package org.example.lab2.question5;

public class ComplexEncryption extends DataEncryption{

    public ComplexEncryption(Data data) {
        super(data);
    }

    @Override
    public String processData() {
        String data = super.processData();
        StringBuilder encryptedBuilder = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            char nc = (char) ((c % 6) + '0');
            encryptedBuilder.append(nc);
        }
        return encryptedBuilder.toString();
    }
}
