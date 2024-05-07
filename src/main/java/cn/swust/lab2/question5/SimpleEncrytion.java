package cn.swust.lab2.question5;

public class SimpleEncrytion extends DataEncryption {
    public SimpleEncrytion(Data data) {
        super(data);
    }

    @Override
    public String processData() {
        String data = super.processData();
        StringBuilder encryptedData = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            if (Character.isLetter(c)) {
                char encryptedChar = (char) (c + 6);
                if ((Character.isLowerCase(c) && encryptedChar > 'z') || (Character.isUpperCase(c) && encryptedChar > 'Z')) {
                    encryptedChar = (char) (c - (26 - 6));
                }
                encryptedData.append(encryptedChar);
            } else {
                encryptedData.append(c);
            }

        }
        return encryptedData.toString();
    }

}
