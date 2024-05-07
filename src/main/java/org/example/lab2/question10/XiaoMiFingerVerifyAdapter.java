package org.example.lab2.question10;

public class XiaoMiFingerVerifyAdapter extends PhoneFingerprintAdapter{
    public XiaoMiFingerVerifyAdapter(FingerprintRecognition fingerprintRecognition) {
        super(fingerprintRecognition);
    }

    @Override
    public void performPhoneFingerVerify() {
        System.out.println("调用小米手机系统指纹识别");
    }
}
