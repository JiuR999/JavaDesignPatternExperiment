package org.example.lab2.question10;

import java.util.HashMap;
import java.util.Map;

public class IdentityVerificationFactory {
    private static Map<Integer,IdentityVerification> identityVerifications;

    static {
        identityVerifications = new HashMap<>();
        identityVerifications.put(1,new PasswordVerification());
        identityVerifications.put(2,new XiaoMiFingerVerifyAdapter(new FingerprintRecognition()));
    }
    public static IdentityVerification getIdentityVerification(int verify){

        return identityVerifications.get(verify);
    }
}
