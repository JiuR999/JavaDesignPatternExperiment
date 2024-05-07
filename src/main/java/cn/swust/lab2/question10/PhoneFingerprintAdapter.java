package cn.swust.lab2.question10;

public abstract class PhoneFingerprintAdapter implements IdentityVerification {
    private FingerprintRecognition fingerprintRecognition;

    public PhoneFingerprintAdapter(FingerprintRecognition fingerprintRecognition) {
        this.fingerprintRecognition = fingerprintRecognition;
    }

    @Override
    public void verify() {
        performPhoneFingerVerify();
        fingerprintRecognition.verify();
    }
    public abstract void performPhoneFingerVerify();
}