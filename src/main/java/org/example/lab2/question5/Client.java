package org.example.lab2.question5;

public class Client {
    public static void main(String[] args) {
        String originalData = "sunnyLiu";
        System.out.println("原文为:" + originalData);
        System.out.println("----------------------");
        Data data = new OriginalData(originalData);
        Data simpleEncryptedData = new SimpleEncrytion(data);
        System.out.println("第一次简单加密:" + simpleEncryptedData.processData());
        System.out.println("----------------------");
        Data reverseEncryption = new ReverseEncryption(simpleEncryptedData);
        System.out.println("第二次反转加密:" + reverseEncryption.processData());
        System.out.println("----------------------");
        Data moduleEncryption = new ComplexEncryption(reverseEncryption);
        System.out.println("第三次复杂加密:" + moduleEncryption.processData());
        System.out.println("----------------------");
    }
}
